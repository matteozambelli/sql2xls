// $ANTLR 3.4 C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g 2015-04-13 20:47:24
 
  package createinsert; 
  import createinserthandlers.*; 
  import tables.*;
  import jxl.*;
  
  

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CreateLexerParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "APEX_TABLE", "APEX_VALUE", "COMMA", "CREATE", "DATE", "DATETIME", "DIGIT", "DOUBLE", "END_STATEMENT", "EXISTS", "FIELD_VALUE", "IF", "INSERT", "INT", "INTO", "KEY", "LETTER", "LP", "NAME", "NOT", "NUMBER", "PRIMARY", "RP", "SPECIAL_CHAR", "TABLE", "UNIQUE", "VALUES", "VARCHAR", "WS"
    };

    public static final int EOF=-1;
    public static final int APEX_TABLE=4;
    public static final int APEX_VALUE=5;
    public static final int COMMA=6;
    public static final int CREATE=7;
    public static final int DATE=8;
    public static final int DATETIME=9;
    public static final int DIGIT=10;
    public static final int DOUBLE=11;
    public static final int END_STATEMENT=12;
    public static final int EXISTS=13;
    public static final int FIELD_VALUE=14;
    public static final int IF=15;
    public static final int INSERT=16;
    public static final int INT=17;
    public static final int INTO=18;
    public static final int KEY=19;
    public static final int LETTER=20;
    public static final int LP=21;
    public static final int NAME=22;
    public static final int NOT=23;
    public static final int NUMBER=24;
    public static final int PRIMARY=25;
    public static final int RP=26;
    public static final int SPECIAL_CHAR=27;
    public static final int TABLE=28;
    public static final int UNIQUE=29;
    public static final int VALUES=30;
    public static final int VARCHAR=31;
    public static final int WS=32;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CreateLexerParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CreateLexerParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return CreateLexerParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g"; }


      CreateInsertHandler ih = new CreateInsertHandler();
      ArrayList<Table> tables = new ArrayList<Table>();
      Table tmpTable;
      Column tmpColumn;
      int index;
      ArrayList<String> columnNames = new ArrayList<String>();
      int i = 0;
      



    // $ANTLR start "start"
    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:30:1: start : ( (rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT ) | (rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT ) )* ;
    public final void start() throws RecognitionException {
        Token rowNumber=null;
        Token tableName=null;
        Token columnName=null;
        Token type=null;
        Token primaryKey=null;
        Token tableTarget=null;
        Token value=null;

        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:31:8: ( ( (rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT ) | (rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT ) )* )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:32:3: ( (rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT ) | (rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT ) )*
            {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:32:3: ( (rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT ) | (rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==CREATE) ) {
                    alt9=1;
                }
                else if ( (LA9_0==INSERT) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:33:3: (rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT )
            	    {
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:33:3: (rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT )
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:34:4: rowNumber= CREATE ( TABLE )? ( IF NOT EXISTS ) tableName= NAME LP ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )? ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP ) RP END_STATEMENT
            	    {
            	    rowNumber=(Token)match(input,CREATE,FOLLOW_CREATE_in_start61); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:34:23: ( TABLE )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==TABLE) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:34:23: TABLE
            	            {
            	            match(input,TABLE,FOLLOW_TABLE_in_start63); 

            	            }
            	            break;

            	    }


            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:34:30: ( IF NOT EXISTS )
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:34:31: IF NOT EXISTS
            	    {
            	    match(input,IF,FOLLOW_IF_in_start67); 

            	    match(input,NOT,FOLLOW_NOT_in_start69); 

            	    match(input,EXISTS,FOLLOW_EXISTS_in_start71); 

            	    }


            	    tableName=(Token)match(input,NAME,FOLLOW_NAME_in_start78); 

            	    tmpTable = new Table(tableName.getText());

            	    match(input,LP,FOLLOW_LP_in_start82); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:35:4: ( (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+ )?
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==NAME) ) {
            	        alt3=1;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:35:5: (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+
            	            {
            	            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:35:5: (columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA )+
            	            int cnt2=0;
            	            loop2:
            	            do {
            	                int alt2=2;
            	                int LA2_0 = input.LA(1);

            	                if ( (LA2_0==NAME) ) {
            	                    alt2=1;
            	                }


            	                switch (alt2) {
            	            	case 1 :
            	            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:35:7: columnName= NAME type= ( INT | VARCHAR | DATE | DATETIME ) COMMA
            	            	    {
            	            	    columnName=(Token)match(input,NAME,FOLLOW_NAME_in_start94); 

            	            	    type=(Token)input.LT(1);

            	            	    if ( (input.LA(1) >= DATE && input.LA(1) <= DATETIME)||input.LA(1)==INT||input.LA(1)==VARCHAR ) {
            	            	        input.consume();
            	            	        state.errorRecovery=false;
            	            	    }
            	            	    else {
            	            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	            	        throw mse;
            	            	    }



            	            	    			  tmpColumn = new Column(columnName.getText(),CreateInsertHandler.getColumnType(type.getText()));
            	            	    			  tmpTable.addColumn(tmpColumn);
            	            	    		  

            	            	    match(input,COMMA,FOLLOW_COMMA_in_start122); 

            	            	    }
            	            	    break;

            	            	default :
            	            	    if ( cnt2 >= 1 ) break loop2;
            	                        EarlyExitException eee =
            	                            new EarlyExitException(2, input);
            	                        throw eee;
            	                }
            	                cnt2++;
            	            } while (true);


            	            }
            	            break;

            	    }


            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:41:6: ( PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP )
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:41:7: PRIMARY KEY LP primaryKey= NAME ( COMMA primaryKey= NAME )* RP
            	    {
            	    match(input,PRIMARY,FOLLOW_PRIMARY_in_start135); 

            	    match(input,KEY,FOLLOW_KEY_in_start137); 

            	    match(input,LP,FOLLOW_LP_in_start139); 

            	    primaryKey=(Token)match(input,NAME,FOLLOW_NAME_in_start145); 

            	    tmpTable.setPrimaryKey(primaryKey.getText());

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:41:88: ( COMMA primaryKey= NAME )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==COMMA) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:41:89: COMMA primaryKey= NAME
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_start150); 

            	    	    primaryKey=(Token)match(input,NAME,FOLLOW_NAME_in_start156); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);


            	    tmpTable.setPrimaryKey(primaryKey.getText());

            	    match(input,RP,FOLLOW_RP_in_start162); 

            	    }


            	    match(input,RP,FOLLOW_RP_in_start169); 

            	    match(input,END_STATEMENT,FOLLOW_END_STATEMENT_in_start171); 


            	    			  if(!ih.tableAlreadyExists(tmpTable.getName(), tables, rowNumber.getLine()))
            	    			  {
            	    			      tables.add(tmpTable);
            	    			      System.out.println(rowNumber.getLine());
            	    			  }
            	    		  

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:52:3: (rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT )
            	    {
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:52:3: (rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT )
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:53:3: rowNumber= INSERT INTO tableTarget= NAME LP (columnName= NAME COMMA )* columnName= NAME RP VALUES ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )* LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP END_STATEMENT
            	    {
            	    columnNames.clear();

            	    rowNumber=(Token)match(input,INSERT,FOLLOW_INSERT_in_start203); 

            	    match(input,INTO,FOLLOW_INTO_in_start205); 

            	    tableTarget=(Token)match(input,NAME,FOLLOW_NAME_in_start211); 


            	    	    index = ih.getIndexByName(tableTarget.getText(),tables,rowNumber.getLine());
            	    	    tmpTable = tables.get(index);
            	    	  

            	    match(input,LP,FOLLOW_LP_in_start223); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:59:7: (columnName= NAME COMMA )*
            	    loop5:
            	    do {
            	        int alt5=2;
            	        int LA5_0 = input.LA(1);

            	        if ( (LA5_0==NAME) ) {
            	            int LA5_1 = input.LA(2);

            	            if ( (LA5_1==COMMA) ) {
            	                alt5=1;
            	            }


            	        }


            	        switch (alt5) {
            	    	case 1 :
            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:59:9: columnName= NAME COMMA
            	    	    {
            	    	    columnName=(Token)match(input,NAME,FOLLOW_NAME_in_start231); 

            	    	    columnNames.add(columnName.getText());

            	    	    match(input,COMMA,FOLLOW_COMMA_in_start234); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop5;
            	        }
            	    } while (true);


            	    columnName=(Token)match(input,NAME,FOLLOW_NAME_in_start242); 

            	    columnNames.add(columnName.getText());

            	    match(input,RP,FOLLOW_RP_in_start246); 


            	    	    if(!tmpTable.checkColumns(columnNames,rowNumber.getLine()))
            	    	    {
            	    	      ih.addError("Invalid column name(s) at line " +  rowNumber.getLine(), rowNumber.getLine());
            	    	    }
            	    	  

            	    match(input,VALUES,FOLLOW_VALUES_in_start256); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:67:4: ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )*
            	    loop7:
            	    do {
            	        int alt7=2;
            	        alt7 = dfa7.predict(input);
            	        switch (alt7) {
            	    	case 1 :
            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:67:5: LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA
            	    	    {
            	    	    i = 0;

            	    	    match(input,LP,FOLLOW_LP_in_start264); 

            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:67:16: (value= FIELD_VALUE COMMA )*
            	    	    loop6:
            	    	    do {
            	    	        int alt6=2;
            	    	        int LA6_0 = input.LA(1);

            	    	        if ( (LA6_0==FIELD_VALUE) ) {
            	    	            int LA6_1 = input.LA(2);

            	    	            if ( (LA6_1==COMMA) ) {
            	    	                alt6=1;
            	    	            }


            	    	        }


            	    	        switch (alt6) {
            	    	    	case 1 :
            	    	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:67:17: value= FIELD_VALUE COMMA
            	    	    	    {
            	    	    	    value=(Token)match(input,FIELD_VALUE,FOLLOW_FIELD_VALUE_in_start271); 

            	    	    	    tmpTable.insertValueInTable(columnNames.get(i++),value.getText());

            	    	    	    match(input,COMMA,FOLLOW_COMMA_in_start275); 

            	    	    	    }
            	    	    	    break;

            	    	    	default :
            	    	    	    break loop6;
            	    	        }
            	    	    } while (true);


            	    	    value=(Token)match(input,FIELD_VALUE,FOLLOW_FIELD_VALUE_in_start283); 

            	    	    tmpTable.insertValueInTable(columnNames.get(i++),value.getText());

            	    	    match(input,RP,FOLLOW_RP_in_start287); 

            	    	    match(input,COMMA,FOLLOW_COMMA_in_start289); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop7;
            	        }
            	    } while (true);


            	    i = 0;

            	    match(input,LP,FOLLOW_LP_in_start297); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:68:15: (value= FIELD_VALUE COMMA )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==FIELD_VALUE) ) {
            	            int LA8_1 = input.LA(2);

            	            if ( (LA8_1==COMMA) ) {
            	                alt8=1;
            	            }


            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:68:16: value= FIELD_VALUE COMMA
            	    	    {
            	    	    value=(Token)match(input,FIELD_VALUE,FOLLOW_FIELD_VALUE_in_start304); 

            	    	    tmpTable.insertValueInTable(columnNames.get(i++),value.getText());

            	    	    match(input,COMMA,FOLLOW_COMMA_in_start308); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);


            	    value=(Token)match(input,FIELD_VALUE,FOLLOW_FIELD_VALUE_in_start316); 

            	    tmpTable.insertValueInTable(columnNames.get(i++),value.getText());

            	    match(input,RP,FOLLOW_RP_in_start320); 

            	    match(input,END_STATEMENT,FOLLOW_END_STATEMENT_in_start322); 

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);



            	for (Table t : tables)
            	{
            	  System.out.println(t.toString());
            	}
            	System.out.println(ih.getErrorLog());
            	ih.createXls(tables);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\7\uffff";
    static final String DFA7_eofS =
        "\7\uffff";
    static final String DFA7_minS =
        "\1\25\1\16\1\6\1\16\1\6\2\uffff";
    static final String DFA7_maxS =
        "\1\25\1\16\1\32\1\16\1\14\2\uffff";
    static final String DFA7_acceptS =
        "\5\uffff\1\2\1\1";
    static final String DFA7_specialS =
        "\7\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2",
            "\1\3\23\uffff\1\4",
            "\1\2",
            "\1\6\5\uffff\1\5",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "()* loopback of 67:4: ( LP (value= FIELD_VALUE COMMA )* value= FIELD_VALUE RP COMMA )*";
        }
    }
 

    public static final BitSet FOLLOW_CREATE_in_start61 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_TABLE_in_start63 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_IF_in_start67 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_NOT_in_start69 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_EXISTS_in_start71 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAME_in_start78 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LP_in_start82 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_NAME_in_start94 = new BitSet(new long[]{0x0000000080020300L});
    public static final BitSet FOLLOW_set_in_start100 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_start122 = new BitSet(new long[]{0x0000000002400000L});
    public static final BitSet FOLLOW_PRIMARY_in_start135 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_KEY_in_start137 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LP_in_start139 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAME_in_start145 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_COMMA_in_start150 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAME_in_start156 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_RP_in_start162 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RP_in_start169 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_STATEMENT_in_start171 = new BitSet(new long[]{0x0000000000010082L});
    public static final BitSet FOLLOW_INSERT_in_start203 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_INTO_in_start205 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAME_in_start211 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LP_in_start223 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAME_in_start231 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_start234 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_NAME_in_start242 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RP_in_start246 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_VALUES_in_start256 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LP_in_start264 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIELD_VALUE_in_start271 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_start275 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIELD_VALUE_in_start283 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RP_in_start287 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_start289 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LP_in_start297 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIELD_VALUE_in_start304 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_COMMA_in_start308 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_FIELD_VALUE_in_start316 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_RP_in_start320 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_END_STATEMENT_in_start322 = new BitSet(new long[]{0x0000000000010082L});

}