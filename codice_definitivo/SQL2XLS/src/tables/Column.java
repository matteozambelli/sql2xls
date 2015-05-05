package tables;

import java.util.ArrayList;

public class Column {

	private String Name;
	private ColumnType type;
	private int lenght;
	private boolean primaryKey;
	private ArrayList<String> values;
	
	public Column(String name, ColumnType type) {
		super();
		Name = name;
		this.type = type;
		values = new ArrayList<String>();
	}
	
	public Column(String name, ColumnType type, int lenght, boolean primaryKey) {
		super();
		Name = name;
		this.type = type;
		this.lenght = lenght;
		this.primaryKey = primaryKey;
		values = new ArrayList<String>();
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public ColumnType getType() {
		return type;
	}
	public void setType(ColumnType type) {
		this.type = type;
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public boolean isPrimaryKey() {
		return primaryKey;
	}
	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public void setValue(String value)
	{
		values.add(value);
	}

	public ArrayList<String> getValues() {
		return values;
	}

	@Override
	public String toString() {
		return "Column [" + (Name != null ? "Name=" + Name + ", " : "")
				+ (type != null ? "type=" + type + ", " : "") + "lenght="
				+ lenght + ", primaryKey=" + primaryKey + ", "
				+ (values != null ? "values=" + values : "") + "]";
	}
	
}