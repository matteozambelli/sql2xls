grammar CreateLexer;

options {
  language = Java;
}
//parser
@header { 
  package createinsert; 
  import createinserthandlers.*; 
  import tables.*;
  import jxl.*;
  
  }
//lexer
@lexer::header { 
  package createinsert; 
  }

@members {
  CreateInsertHandler ih = new CreateInsertHandler();
  ArrayList<Table> tables = new ArrayList<Table>();
  Table tmpTable;
  Column tmpColumn;
  int index;
  ArrayList<String> columnNames = new ArrayList<String>();
  int i = 0;
  
}

start
@init{}:
(
  (
	  rowNumber = CREATE TABLE ?(IF NOT EXISTS) tableName = NAME {tmpTable = new Table(tableName.getText());} LP
	  (( columnName = NAME type = (INT|VARCHAR|DATE|DATETIME) 
		  {
			  tmpColumn = new Column(columnName.getText(),CreateInsertHandler.getColumnType(type.getText()));
			  tmpTable.addColumn(tmpColumn);
		  } 
		  COMMA )+) 
		  ?(PRIMARY KEY LP primaryKey = NAME {tmpTable.setPrimaryKey(primaryKey.getText());} (COMMA primaryKey = NAME)* {tmpTable.setPrimaryKey(primaryKey.getText());} RP)
		  RP END_STATEMENT
		  {
			  if(!ih.tableAlreadyExists(tmpTable.getName(), tables, rowNumber.getLine()))
			  {
			      tables.add(tmpTable);
			      System.out.println(rowNumber.getLine());
			  }
		  }
	  )
	 |
	 (
	 {columnNames.clear();}
	  rowNumber = INSERT INTO tableTarget = NAME 
	  {
	    index = ih.getIndexByName(tableTarget.getText(),tables,rowNumber.getLine());
	    tmpTable = tables.get(index);
	  } 
	  LP ( columnName = NAME {columnNames.add(columnName.getText());}COMMA)* columnName = NAME {columnNames.add(columnName.getText());} RP
	  {
	    if(!tmpTable.checkColumns(columnNames,rowNumber.getLine()))
	    {
	      ih.addError("Invalid column name(s) at line " +  rowNumber.getLine(), rowNumber.getLine());
	    }
	  }
	  VALUES 
	  ({i = 0;}LP (value = FIELD_VALUE {tmpTable.insertValueInTable(columnNames.get(i++),value.getText());} COMMA)* value = FIELD_VALUE {tmpTable.insertValueInTable(columnNames.get(i++),value.getText());} RP COMMA)*
	  {i = 0;}LP (value = FIELD_VALUE {tmpTable.insertValueInTable(columnNames.get(i++),value.getText());} COMMA)* value = FIELD_VALUE {tmpTable.insertValueInTable(columnNames.get(i++),value.getText());} RP END_STATEMENT
	 )
)*
{
	for (Table t : tables)
	{
	  System.out.println(t.toString());
	}
	System.out.println(ih.getErrorLog());
	ih.createXls(tables);
}
;

fragment LETTER: ('A'..'Z')|('a'..'z');

fragment DIGIT: ('0'..'9');

WS: //Caratteri ignorabili
('\r' | '\n' | '\t' | ' ') {$channel=HIDDEN;};

SPECIAL_CHAR: '_';

APEX_VALUE: '\'';

FIELD_VALUE: APEX_VALUE (LETTER|DIGIT|SPECIAL_CHAR)+ APEX_VALUE;

NUMBER: DIGIT+ ;

CREATE: 'CREATE' ;

TABLE: 'TABLE';

IF : 'IF';

NOT: 'NOT';

EXISTS: 'EXISTS';

INSERT: 'INSERT';

INTO: 'INTO';

APEX_TABLE: '`';



PRIMARY: 'PRIMARY';

UNIQUE: 'UNIQUE';

KEY: 'KEY';

VALUES: 'VALUES';

VARCHAR: 'varchar' LP DIGIT+ RP ;

LP: '(';

RP: ')';

INT: 'int' ?(LP DIGIT+ RP);

DATE: 'date' ;

DATETIME: 'datetime';

DOUBLE: 'double';

COMMA: ',';

END_STATEMENT: ';';

NAME: APEX_TABLE (LETTER|DIGIT|SPECIAL_CHAR)+ APEX_TABLE;


