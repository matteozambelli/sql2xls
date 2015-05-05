grammar update;

options {
  language = Java;
}

//parser header
@header{ 
package update;
import updatehandlers.*;
}

//lexer header 
@lexer::header{ 
package update;
}

@members{
UpdateHandler uh=new UpdateHandler();
}

start

@init{}
     :
     (
     updateLine=UPDATE_KEY 
     TABLE_KEY 
     tableName=IDENTIFIER_TABLE_FIELD {uh.addTable(tableName.getText());}
     SET_KEY
     fields=fieldList {uh.addFields(tableName.getText(),fields);}
     WHERE_KEY
     targets=targetRow {uh.addTargets(tableName.getText(),targets);}
     END_STATEMENT
     {
      uh.update(updateLine.getLine()); 
      uh.reset();
     }   
     )*
     { 
        uh.printTableNames();
        uh.writeFile();
     } 
     ;
     
fieldList returns[String list]
                             :
                             {String fieldName; String valueName = ""; String returnString = "";}                             
                             (
                             fn=IDENTIFIER_TABLE_FIELD {fieldName=fn.getText()+'-';}
                             ASSIGNMENT
                             (vn=(IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER) {valueName=vn.getText();})
                             COMMA* {returnString+=fieldName+valueName+'|';} //gestione errori: comma multipli ignorati
                             )+
                             {list=returnString;}
                             ;

targetRow returns[String list] //specifica: target può essere composto
                             :
                             {String fieldName; String valueName = ""; String returnString = "";}
                             (
                             fn=IDENTIFIER_TABLE_FIELD {fieldName=fn.getText()+'-';}
                             ASSIGNMENT
                             (vn=(IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER) {valueName=vn.getText();})
                             mul=MULTIPLE_KEY* {
                                                if(mul != null)
                                                returnString+=fieldName+valueName+'['+mul.getText()+'|';
                                                else
                                                returnString+=fieldName+valueName+'|';
                                                } //gestione errori: comma multipli ignorati
                             )*
                             {list=returnString;}
                             ;
                             


//LEXER TOKENS

fragment LETTER:
('a'..'z' | 'A'..'Z');

fragment DIGIT:
('0'..'9');


UPDATE_KEY
         : 'UPDATE'
         ;
         
TABLE_KEY
         : 'TABLE'
         ;
         
SET_KEY
         : 'SET'
         ;
         
WHERE_KEY
         : 'WHERE'
         ;
       

fragment AND_KEY
         : 'AND'
         ;

fragment OR_KEY
         : 'OR'
         ;

MULTIPLE_KEY
         : (AND_KEY | OR_KEY)*
         ;         

COMMA
     : ','
     ;

END_STATEMENT
     : ';'  
     ;

ASSIGNMENT
     : '='  
     ;      

PUNT
    : (',' | '.' | '!' | '?' | ';')
    ;
    
IDENTIFIER_TABLE_FIELD:
'`' LETTER (LETTER | DIGIT | '_')* '`';

IDENTIFIER_VALUE_STRING:
'\'' (LETTER | DIGIT | '_' | ' ' | PUNT )+ '\'';

IDENTIFIER_VALUE_NUMBER:
DIGIT+;

WS: //Caratteri ignorabili
('\r' | '\n' | '\t' | ' ') {$channel=HIDDEN;};

        