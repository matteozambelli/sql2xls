// $ANTLR 3.4 C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g 2015-03-22 14:43:14
 
package updatePackage;
import updateTester.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class updateParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND_KEY", "ASSIGNMENT", "COMMA", "DIGIT", "END_STATEMENT", "IDENTIFIER_TABLE_FIELD", "IDENTIFIER_VALUE_NUMBER", "IDENTIFIER_VALUE_STRING", "LETTER", "MULTIPLE_KEY", "OR_KEY", "PUNT", "SET_KEY", "TABLE_KEY", "UPDATE_KEY", "WHERE_KEY", "WS"
    };

    public static final int EOF=-1;
    public static final int AND_KEY=4;
    public static final int ASSIGNMENT=5;
    public static final int COMMA=6;
    public static final int DIGIT=7;
    public static final int END_STATEMENT=8;
    public static final int IDENTIFIER_TABLE_FIELD=9;
    public static final int IDENTIFIER_VALUE_NUMBER=10;
    public static final int IDENTIFIER_VALUE_STRING=11;
    public static final int LETTER=12;
    public static final int MULTIPLE_KEY=13;
    public static final int OR_KEY=14;
    public static final int PUNT=15;
    public static final int SET_KEY=16;
    public static final int TABLE_KEY=17;
    public static final int UPDATE_KEY=18;
    public static final int WHERE_KEY=19;
    public static final int WS=20;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public updateParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public updateParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return updateParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g"; }


    UpdateHandler uh=new UpdateHandler();



    // $ANTLR start "start"
    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:22:1: start : (updateLine= UPDATE_KEY TABLE_KEY tableName= IDENTIFIER_TABLE_FIELD SET_KEY fields= fieldList WHERE_KEY targets= targetRow END_STATEMENT )* ;
    public final void start() throws RecognitionException {
        Token updateLine=null;
        Token tableName=null;
        String fields =null;

        String targets =null;


        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:25:6: ( (updateLine= UPDATE_KEY TABLE_KEY tableName= IDENTIFIER_TABLE_FIELD SET_KEY fields= fieldList WHERE_KEY targets= targetRow END_STATEMENT )* )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:26:6: (updateLine= UPDATE_KEY TABLE_KEY tableName= IDENTIFIER_TABLE_FIELD SET_KEY fields= fieldList WHERE_KEY targets= targetRow END_STATEMENT )*
            {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:26:6: (updateLine= UPDATE_KEY TABLE_KEY tableName= IDENTIFIER_TABLE_FIELD SET_KEY fields= fieldList WHERE_KEY targets= targetRow END_STATEMENT )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==UPDATE_KEY) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:27:6: updateLine= UPDATE_KEY TABLE_KEY tableName= IDENTIFIER_TABLE_FIELD SET_KEY fields= fieldList WHERE_KEY targets= targetRow END_STATEMENT
            	    {
            	    updateLine=(Token)match(input,UPDATE_KEY,FOLLOW_UPDATE_KEY_in_start68); 

            	    match(input,TABLE_KEY,FOLLOW_TABLE_KEY_in_start76); 

            	    tableName=(Token)match(input,IDENTIFIER_TABLE_FIELD,FOLLOW_IDENTIFIER_TABLE_FIELD_in_start86); 

            	    uh.addTable(tableName.getText());

            	    match(input,SET_KEY,FOLLOW_SET_KEY_in_start95); 

            	    pushFollow(FOLLOW_fieldList_in_start104);
            	    fields=fieldList();

            	    state._fsp--;


            	    uh.addFields(tableName.getText(),fields);

            	    match(input,WHERE_KEY,FOLLOW_WHERE_KEY_in_start113); 

            	    pushFollow(FOLLOW_targetRow_in_start122);
            	    targets=targetRow();

            	    state._fsp--;


            	    uh.addTargets(tableName.getText(),targets);

            	    match(input,END_STATEMENT,FOLLOW_END_STATEMENT_in_start131); 


            	          uh.update(updateLine.getLine()); 
            	          uh.reset();
            	         

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


             
                    uh.printTableNames();
                    uh.writeFile();
                 

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



    // $ANTLR start "fieldList"
    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:46:1: fieldList returns [String list] : (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) ( COMMA )* )+ ;
    public final String fieldList() throws RecognitionException {
        String list = null;


        Token fn=null;
        Token vn=null;

        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:47:30: ( (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) ( COMMA )* )+ )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:48:30: (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) ( COMMA )* )+
            {
            String fieldName; String valueName = ""; String returnString = "";

            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:49:30: (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) ( COMMA )* )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==IDENTIFIER_TABLE_FIELD) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:50:30: fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) ( COMMA )*
            	    {
            	    fn=(Token)match(input,IDENTIFIER_TABLE_FIELD,FOLLOW_IDENTIFIER_TABLE_FIELD_in_fieldList330); 

            	    fieldName=fn.getText()+'-';

            	    match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_fieldList363); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:52:30: (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) )
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:52:31: vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER )
            	    {
            	    vn=(Token)input.LT(1);

            	    if ( (input.LA(1) >= IDENTIFIER_VALUE_NUMBER && input.LA(1) <= IDENTIFIER_VALUE_STRING) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    valueName=vn.getText();

            	    }


            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:53:30: ( COMMA )*
            	    loop2:
            	    do {
            	        int alt2=2;
            	        int LA2_0 = input.LA(1);

            	        if ( (LA2_0==COMMA) ) {
            	            alt2=1;
            	        }


            	        switch (alt2) {
            	    	case 1 :
            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:53:30: COMMA
            	    	    {
            	    	    match(input,COMMA,FOLLOW_COMMA_in_fieldList437); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop2;
            	        }
            	    } while (true);


            	    returnString+=fieldName+valueName+'|';

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            list=returnString;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "fieldList"



    // $ANTLR start "targetRow"
    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:58:1: targetRow returns [String list] : (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) (mul= MULTIPLE_KEY )* )* ;
    public final String targetRow() throws RecognitionException {
        String list = null;


        Token fn=null;
        Token vn=null;
        Token mul=null;

        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:59:30: ( (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) (mul= MULTIPLE_KEY )* )* )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:60:30: (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) (mul= MULTIPLE_KEY )* )*
            {
            String fieldName; String valueName = ""; String returnString = "";

            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:61:30: (fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) (mul= MULTIPLE_KEY )* )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==IDENTIFIER_TABLE_FIELD) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:62:30: fn= IDENTIFIER_TABLE_FIELD ASSIGNMENT (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) ) (mul= MULTIPLE_KEY )*
            	    {
            	    fn=(Token)match(input,IDENTIFIER_TABLE_FIELD,FOLLOW_IDENTIFIER_TABLE_FIELD_in_targetRow668); 

            	    fieldName=fn.getText()+'-';

            	    match(input,ASSIGNMENT,FOLLOW_ASSIGNMENT_in_targetRow701); 

            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:64:30: (vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER ) )
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:64:31: vn= ( IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER )
            	    {
            	    vn=(Token)input.LT(1);

            	    if ( (input.LA(1) >= IDENTIFIER_VALUE_NUMBER && input.LA(1) <= IDENTIFIER_VALUE_STRING) ) {
            	        input.consume();
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    valueName=vn.getText();

            	    }


            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:65:33: (mul= MULTIPLE_KEY )*
            	    loop4:
            	    do {
            	        int alt4=2;
            	        int LA4_0 = input.LA(1);

            	        if ( (LA4_0==MULTIPLE_KEY) ) {
            	            alt4=1;
            	        }


            	        switch (alt4) {
            	    	case 1 :
            	    	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:65:33: mul= MULTIPLE_KEY
            	    	    {
            	    	    mul=(Token)match(input,MULTIPLE_KEY,FOLLOW_MULTIPLE_KEY_in_targetRow777); 

            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop4;
            	        }
            	    } while (true);



            	                                                    if(mul != null)
            	                                                    returnString+=fieldName+valueName+'['+mul.getText()+'|';
            	                                                    else
            	                                                    returnString+=fieldName+valueName+'|';
            	                                                    

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            list=returnString;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return list;
    }
    // $ANTLR end "targetRow"

    // Delegated rules


 

    public static final BitSet FOLLOW_UPDATE_KEY_in_start68 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_TABLE_KEY_in_start76 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_IDENTIFIER_TABLE_FIELD_in_start86 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_SET_KEY_in_start95 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_fieldList_in_start104 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_WHERE_KEY_in_start113 = new BitSet(new long[]{0x0000000000000300L});
    public static final BitSet FOLLOW_targetRow_in_start122 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_END_STATEMENT_in_start131 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_IDENTIFIER_TABLE_FIELD_in_fieldList330 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_fieldList363 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_fieldList397 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_COMMA_in_fieldList437 = new BitSet(new long[]{0x0000000000000242L});
    public static final BitSet FOLLOW_IDENTIFIER_TABLE_FIELD_in_targetRow668 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ASSIGNMENT_in_targetRow701 = new BitSet(new long[]{0x0000000000000C00L});
    public static final BitSet FOLLOW_set_in_targetRow735 = new BitSet(new long[]{0x0000000000002202L});
    public static final BitSet FOLLOW_MULTIPLE_KEY_in_targetRow777 = new BitSet(new long[]{0x0000000000002202L});

}