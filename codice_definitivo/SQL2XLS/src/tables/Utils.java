package tables;

import java.util.ArrayList;
import java.util.Hashtable;

public class Utils {
	
	private String outputFolder;
	private static Utils instance;
	private String inputXls;
	private String filename;
	
	private Hashtable<Integer, String> errorLogCreate;
	
	private Utils()
	{
		
	}
	
	public static Utils getInstance()
	{
		if(instance == null)
			instance = new Utils();;
			
		return instance;
	}

	public String getOutputFolder() {
		return outputFolder;
	}

	public void setOutputFolder(String outputFolder) {
		this.outputFolder = outputFolder;
	}
	
	public Hashtable<Integer, String> getErrorsCreate() {
		return errorLogCreate;
	}

	public void setErrorsCreate(Hashtable<Integer, String> el) {
		this.errorLogCreate = el;
	}
	
	public String getInputXls() {
		return inputXls;
	}

	public void setInputXls(String inputXls) {
		this.inputXls = inputXls;
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
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
	
	public static int getColumnLengt(String in)
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
	
	public static boolean tableAlreadyExists(String name, ArrayList<Table> table)
	{
		for(Table t : table)
		{
			if (t.getName().equals(name)) return true;
		}
		return false;
	}
	
	public static int getIndexByName(String name, ArrayList<Table> list, int line )
	{
		for(Table t : list)
		{
			if (t.getName().equals(name)) return list.indexOf(t);
		}
		return -1;
	}
	
	
}
