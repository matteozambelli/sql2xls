package test;

import java.util.ArrayList;
import java.util.Hashtable;

import tables.ColumnType;
import tables.Table;

public class InsertHandler {

	
	ArrayList<String> tableNames;
	Hashtable<Integer, String> errorLog;
	
	public InsertHandler(){
		tableNames = new ArrayList<String>();
		errorLog = new Hashtable<Integer, String>();
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


	
}
