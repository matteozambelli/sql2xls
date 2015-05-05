package updatehandlers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;
import java.io.File; 
import java.io.IOException;

import utility.Utils;
import jxl.*; 
import jxl.format.Colour;
import jxl.format.Pattern;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableCellFormat;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

class UpdateStructure
{
	ArrayList<ArrayList<Integer>> rowValues;
	ArrayList<ArrayList<Integer>> columnValues;
	ArrayList<ArrayList<String>> fieldValues;
	ArrayList<ArrayList<String>> clausolaType;

	UpdateStructure()
	{
		rowValues = new ArrayList<ArrayList<Integer>>();
		columnValues = new ArrayList<ArrayList<Integer>>();
		fieldValues = new ArrayList<ArrayList<String>>();
		clausolaType = new ArrayList<ArrayList<String>>();
	}
	
}

public class UpdateHandler {
	
	Hashtable<String,String> fieldNames;
	Hashtable<String,String> targetsNames;
	
	String targetTable;
	File inputXlsx;
	File outputXlsx;
	Workbook workbook;
	
	//gestione errori semantici (es, non trova la tabella o il campo)
	Hashtable<Integer,String> errorsTable;
	
	//hashtable di quello che andrà sostituito
	Hashtable<String, UpdateStructure> updateTable;
	
	///funzioni di utilità
	// Create cell font and format
    private static WritableCellFormat getCellFormat(Colour colour, Pattern pattern) throws WriteException {
	    WritableFont cellFont = new WritableFont(WritableFont.ARIAL, 11);
	    WritableCellFormat cellFormat = new WritableCellFormat(cellFont);
	    cellFormat.setBackground(colour, pattern);
	    return cellFormat;
    }
    
    //aggiorna la struttura
    private void updateStructure(ArrayList<Integer> rv, ArrayList<Integer> cv, ArrayList<String> fv,ArrayList<String> ct, String tableName)
    {
    	if(updateTable.isEmpty())
    	{
    		UpdateStructure us = new UpdateStructure();
    		us.clausolaType.add(ct);
    		us.columnValues.add(cv);
    		us.fieldValues.add(fv);
    		us.rowValues.add(rv);
    		
    		updateTable.put(tableName,us);    		
    	}
    	else
    	{   
    		if(updateTable.get(tableName) != null)
    		{
	    		ArrayList<ArrayList<Integer>> rowValues = updateTable.get(tableName).rowValues;
	    		ArrayList<ArrayList<Integer>> columnValues = updateTable.get(tableName).columnValues;
	    		ArrayList<ArrayList<String>> fieldValues = updateTable.get(tableName).fieldValues;
	    		ArrayList<ArrayList<String>> clausolaType = updateTable.get(tableName).clausolaType;
	    		
	    		rowValues.add(rv);
	    		columnValues.add(cv);
	    		fieldValues.add(fv);
	    		clausolaType.add(ct);
	    		
	    		UpdateStructure us = new UpdateStructure();
	    		us.clausolaType = clausolaType;
	    		us.columnValues = columnValues;
	    		us.fieldValues = fieldValues;
	    		us.rowValues = rowValues;
	    		
	    		updateTable.remove(tableName);
	    		
	    		updateTable.put(tableName, us);
    		}
    		else
    		{
    			UpdateStructure us = new UpdateStructure();
        		us.clausolaType.add(ct);
        		us.columnValues.add(cv);
        		us.fieldValues.add(fv);
        		us.rowValues.add(rv);
        		
        		updateTable.put(tableName,us);
    		}
    	}
    	
    }
	
	
	public UpdateHandler(){
		targetTable=new String();
		fieldNames=new Hashtable<String,String>();
		targetsNames=new Hashtable<String,String>();
		
		errorsTable=new Hashtable<Integer, String>();
		
		inputXlsx = new File(".\\resources\\test.xls");
		outputXlsx = new File(".\\resources\\testOutput.xls");
		
		inputXlsx = new File(Utils.getInstance().getInputXls());
		outputXlsx = new File(Utils.getInstance().getOutputFolder() + "\\" + Utils.getInstance().getFilename()  +".xls");
		
		updateTable = new Hashtable<String, UpdateStructure>();
		
		try {
			workbook = Workbook.getWorkbook(inputXlsx);
		} catch (BiffException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void addTable(String tableName)
	{
		targetTable=tableName;
	}
	
	public void addFields(String tableName, String fields)
	{
		fieldNames.put(tableName, fields);
	}
	
	public void addTargets(String tableName, String targets)
	{
		targetsNames.put(tableName, targets);
	}
	
	public void printTableNames()
	{
		/*System.out.println(targetTable);
		System.out.println(fieldNames.toString());
		System.out.println(targetsNames.toString());*/
		System.out.println(errorsTable.toString());
	}
	
	public void reset(){
		targetTable="";
		fieldNames.clear();
		targetsNames.clear();
	}
	
	public void update(int lineNumber)
	{
		//ripulisco dagli apici tipici di SQL
		Sheet sheet = workbook.getSheet(targetTable.replaceAll("`", ""));
		
		///gestione errori: se non esiste il foglio??
		if(sheet == null)
		{
			errorsTable.put(lineNumber, "Table "+targetTable+" not exists.");
		}
		else
		{
			//array di supporto per contenere la coppia di indice colonna e valore che andrà sostituito
			ArrayList<Integer> columnValues = new ArrayList<Integer>();
			ArrayList<Integer> rowValues = new ArrayList<Integer>();
			ArrayList<String> cellValues = new ArrayList<String>();
					
			
			//ricavo la prima riga che è l'intestazione
			//1 ricavo il numero di colonne nel foglio
			Integer maxColumns = sheet.getColumns();
			
			String target = fieldNames.get(targetTable);
			String[] targets = target.split("\\|"); //trick per lo split
			
			//scorro la lista dei targets
			for(String s : targets){
				String[] t = s.split("\\-");
				
				boolean foundInt = false;
				//ricerco nell'intestazione (riga 0) se qualcuna delle colonne si chiama come il campo
				for(int i=0;i<maxColumns;i++)
				{
					Cell intCell = sheet.getCell(i,0); //colonna,riga
					if(intCell.getContents().equals(t[0].replaceAll("`", "")))
					{
						foundInt = true;
						columnValues.add(i);
						cellValues.add(t[1].replaceAll("`", ""));
						break;
					}
				}
				
				if(!foundInt)
				{
					errorsTable.put(lineNumber, "Coloumn "+t[0]+" not exists.");
					return;
				}
				
			} //alla fine avrò la mia lista di campi da sostituire e la posizione delle colonne di dove si trovano
			
			target = targetsNames.get(targetTable);
			targets = target.split("\\|"); //trick per lo split
			ArrayList<String> clausolaType = new ArrayList<String>();
			//scorro la lista dei targets
			for(String s : targets){
				String[] t = s.split("\\-");
				String clausolaSupp = "none";
				
				//devo capire se è AND o OR				
				String[] clausola = t[1].split("\\[");
				if(clausola.length > 1)
				{
					clausolaType.add(clausola[1]);
					t[1] = clausola[0];
				}
				else
				{
					clausolaType.add(clausolaSupp);
				}
				
				
				//ricerco nell'intestazione (riga 0) se qualcuna delle colonne si chiama come il campo
				for(int i=0;i<maxColumns;i++)
				{
					Cell intCell = sheet.getCell(i,0); //colonna,riga
					if(intCell.getContents().equals(t[0].replaceAll("`", "")))
					{
						Integer maxRows = sheet.getRows();
						for(int j=0;j<maxRows;j++)
						{
							
							if(sheet.getCell(i, j).getContents().equals(t[1].replaceAll("'", "")))
								rowValues.add(j);
						}
						
					}
				}
				
				
			} //alla fine avrò la mia lista di campi da sostituire e la posizione delle colonne di dove si trovano
						
			updateStructure(rowValues,columnValues,cellValues,clausolaType,targetTable.replaceAll("`", ""));
			
		} //chiusura ramo else
		
	}
	
	public void writeFile()
	{
		//legge il vecchio workbook e controlla se la cella è da cambiare, eventualmente la cambia
		try {
			WritableWorkbook writable = Workbook.createWorkbook(outputXlsx);
			Utils.getInstance().setErrorsCreate(errorsTable);
			for(int i = 0; i<workbook.getNumberOfSheets();i++)
			{
				String sheetName = workbook.getSheet(i).getName();
				WritableSheet writableSheet = writable.createSheet(sheetName, i);
				
				Integer sheetMaxRows = workbook.getSheet(i).getRows();
				Integer sheetMaxColumns = workbook.getSheet(i).getColumns();
						
				Label label = null;
				
				if(!updateTable.containsKey(sheetName))
					break;
				
				for(int j=0; j<sheetMaxRows;j++)
				{
					for(int k=0; k<sheetMaxColumns;k++)
					{
						boolean founded = false;
						
						for(int l=0;l<updateTable.get(sheetName).columnValues.size();l++)
						{
							if(updateTable.get(sheetName).columnValues.get(l).indexOf(k) > -1)
							{
								if(updateTable.get(sheetName).rowValues.get(l).indexOf(j) > -1)
								{									
									//ricavo la clausola...mi basta il primo elemento dell'array
									//se è OR oppure none, la modifica deve avvenire senza problemi
									//se è AND va fatta solo se si soddisfa per intero il requisito
									if(updateTable.get(sheetName).clausolaType.get(l).get(0).equals("AND"))
									{
										//devo modificare solo il numero di riga che si ripete tante volte
										//quante il numero delle clausole
										int noc = updateTable.get(sheetName).clausolaType.get(l).size();
										int occurrences = Collections.frequency(updateTable.get(sheetName).rowValues.get(l), j);
										
										if(noc == occurrences)
										{
											founded = true;
											ArrayList<String> fv = updateTable.get(sheetName).fieldValues.get(l);									
											String newValue = fv.get(updateTable.get(sheetName).columnValues.get(l).indexOf(k));
											newValue = newValue.replaceAll("'", "");
											label = new Label(k,j,newValue, getCellFormat(Colour.LIGHT_ORANGE, Pattern.SOLID));
											break;
										}
											
									}
									else
									{
										founded = true;
										ArrayList<String> fv = updateTable.get(sheetName).fieldValues.get(l);									
										String newValue = fv.get(updateTable.get(sheetName).columnValues.get(l).indexOf(k));
										newValue = newValue.replaceAll("'", "");
										label = new Label(k,j,newValue, getCellFormat(Colour.LIGHT_ORANGE, Pattern.SOLID));
										break;
									}									
									
								}
							}
						}
						
						if(founded == false)
							label = new Label(k,j,workbook.getSheet(i).getCell(k, j).getContents());
												
						//scrive effettivamente la label creata...o quella pre-esistente se non è da modificare
						try {
							writableSheet.addCell(label);
						} catch (WriteException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					} //for colonna
					
				} // for riga
				
				
				writable.write();
				try {
					writable.close();					
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
			
		} catch (IOException | WriteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
