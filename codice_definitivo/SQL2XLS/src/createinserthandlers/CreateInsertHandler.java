package createinserthandlers;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Hashtable;

import tables.Column;
import tables.ColumnType;
import tables.Table;
import utility.Utils;
import jxl.*;
import jxl.write.*;

public class CreateInsertHandler {

	
	ArrayList<String> tableNames;
	Hashtable<Integer, String> errorLog;
	File output;
	WritableWorkbook workbook;
	ArrayList<WritableSheet> sheetList;
	
	public CreateInsertHandler(){
		sheetList = new ArrayList<WritableSheet>();
		tableNames = new ArrayList<String>();
		errorLog = new Hashtable<Integer, String>();
		output = new File(Utils.getInstance().getOutputFolder() + "\\" + Utils.getInstance().getFilename()  +".xls");
		
		try {
			workbook = Workbook.createWorkbook(output);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	public void addTable(String tablename)
	{
		tableNames.add(tablename);
	}
	
	public void printTableNames()
	{
		System.out.println(tableNames.toString());
	}
	
	public static ColumnType getColumnType(String in)
	{
		if(in.contains("int"))
		{
			return ColumnType.INT;
		}
		else if(in.contains("varchar"))
		{
			return ColumnType.VARCHAR;
		}
		else if(in.contains("datetime"))
		{
			return ColumnType.DATETIME;
		}
		else if(in.contains("date"))
		{
			return ColumnType.DATE;
		}
		else
		{
			return ColumnType.UNDEFINED;
		}
	}
	
	public static int getColumnLength(String in)
	{
		if(in.contains("int(") )
		{
			return Integer.parseInt(in.substring(4, in.length()-2));
		}
		else if(in.contains("varchar("))
		{
			return Integer.parseInt(in.substring(8, in.length()-2));
		}
		{
			return -1;
		}
	}
	
	public boolean tableAlreadyExists(String name, ArrayList<Table> table,int line)
	{
		for(Table t : table)
		{
			if (t.getName().equals(name))
				{
					errorLog.put(line, "table " + name + " already exists!");
					return true;
				}
		}
		return false;
	}
	
	public int getIndexByName(String name, ArrayList<Table> list, int line )
	{
		for(Table t : list)
		{
			if (t.getName().equals(name)) return list.indexOf(t);
		}
		errorLog.put(line, "table " + name + " does not exist!");
		return -1;
	}
	
	public void addError(String msg, Integer line)
	{
		errorLog.put(line, msg);
	}

	public Hashtable<Integer, String> getErrorLog() {
		return errorLog;
	}
	
	public void createXls(ArrayList<Table> tables)
	{
		Label tmp;
		ArrayList<String> values;
		for(Table t : tables)
		{
			WritableSheet tmpSheet = workbook.createSheet(t.getName(), tables.indexOf(t));
			for(Column c : t.getColumns())
			{
				tmp = new Label(t.getColumns().indexOf(c), 0, c.getName());
				
				try {
					tmpSheet.addCell(tmp);
				} catch (WriteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				values = c.getValues();
				for(int i = 0 ; i < values.size() ; i++)
				{
					System.out.println("riga: " + t.getColumns().indexOf(c) + " colonna: " +  (i + 1 ) + " valore : " + values.get(i));
					tmp = new Label(t.getColumns().indexOf(c), i + 1, values.get(i));
					try {
						tmpSheet.addCell(tmp);
					} catch (WriteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		}
		try {
			workbook.write();
			workbook.close();
			Utils.getInstance().setErrorsCreate(errorLog);
			
		} catch (WriteException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
