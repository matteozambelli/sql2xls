package tables;

import java.util.ArrayList;

public class Table {

	private String name;
	private ArrayList<Column> columns;
	private boolean consistentColumns;
	@Override
	public String toString() {
		return "Table [" + (name != null ? "name=" + name + ", " : "")
				+ (columns != null ? "columns=" + columns : "") + "]";
	}

	public Table(String name) {
		super();
		this.name = name;
		columns = new ArrayList<Column>();
	}
	public Table() {
		super();
	}
	public void addColumn(Column col)
	{
		columns.add(col);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Column> getColumns() {
		return columns;
	}

	public void setColumns(ArrayList<Column> columns) {
		this.columns = columns;
	}
	
	public void insertValueInTable(String column, String value)
	{
		if(consistentColumns)
		{
			for(Column c : columns)
			{
				if(c.getName().equals(column))
				{
					c.setValue(value);
				}
			}
		}
	}
	
	public void setPrimaryKey(String column)
	{
		for(Column c : columns)
		{
			if (c.getName().equals(column))
			{
				
				c.setPrimaryKey(true);
				break;
			}
		}
	}
	
	public boolean checkColumns(ArrayList<String> columnsToCheck, int line)
	{
		ArrayList<String> tmp = new ArrayList<String>();
		for (Column c : columns)
		{
			tmp.add(c.getName());
		}
		
		if(columnsToCheck.containsAll(tmp) && tmp.containsAll(columnsToCheck))
			consistentColumns = true;
		else
			consistentColumns = false;
		
		return consistentColumns;
	}
}
