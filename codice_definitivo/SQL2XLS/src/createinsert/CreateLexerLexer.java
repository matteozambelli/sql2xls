// $ANTLR 3.4 C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g 2015-04-13 20:47:24
 
  package createinsert; 
  

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CreateLexerLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public CreateLexerLexer() {} 
    public CreateLexerLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public CreateLexerLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g"; }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:81:16: ( ( 'A' .. 'Z' ) | ( 'a' .. 'z' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:83:15: ( ( '0' .. '9' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:85:3: ( ( '\\r' | '\\n' | '\\t' | ' ' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:86:2: ( '\\r' | '\\n' | '\\t' | ' ' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "SPECIAL_CHAR"
    public final void mSPECIAL_CHAR() throws RecognitionException {
        try {
            int _type = SPECIAL_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:88:13: ( '_' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:88:15: '_'
            {
            match('_'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SPECIAL_CHAR"

    // $ANTLR start "APEX_VALUE"
    public final void mAPEX_VALUE() throws RecognitionException {
        try {
            int _type = APEX_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:90:11: ( '\\'' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:90:13: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "APEX_VALUE"

    // $ANTLR start "FIELD_VALUE"
    public final void mFIELD_VALUE() throws RecognitionException {
        try {
            int _type = FIELD_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:92:12: ( APEX_VALUE ( LETTER | DIGIT | SPECIAL_CHAR )+ APEX_VALUE )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:92:14: APEX_VALUE ( LETTER | DIGIT | SPECIAL_CHAR )+ APEX_VALUE
            {
            mAPEX_VALUE(); 


            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:92:25: ( LETTER | DIGIT | SPECIAL_CHAR )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            mAPEX_VALUE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FIELD_VALUE"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:94:7: ( ( DIGIT )+ )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:94:9: ( DIGIT )+
            {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:94:9: ( DIGIT )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "CREATE"
    public final void mCREATE() throws RecognitionException {
        try {
            int _type = CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:96:7: ( 'CREATE' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:96:9: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CREATE"

    // $ANTLR start "TABLE"
    public final void mTABLE() throws RecognitionException {
        try {
            int _type = TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:98:6: ( 'TABLE' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:98:8: 'TABLE'
            {
            match("TABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TABLE"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:100:4: ( 'IF' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:100:6: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:102:4: ( 'NOT' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:102:6: 'NOT'
            {
            match("NOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "EXISTS"
    public final void mEXISTS() throws RecognitionException {
        try {
            int _type = EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:104:7: ( 'EXISTS' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:104:9: 'EXISTS'
            {
            match("EXISTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXISTS"

    // $ANTLR start "INSERT"
    public final void mINSERT() throws RecognitionException {
        try {
            int _type = INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:106:7: ( 'INSERT' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:106:9: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INSERT"

    // $ANTLR start "INTO"
    public final void mINTO() throws RecognitionException {
        try {
            int _type = INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:108:5: ( 'INTO' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:108:7: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTO"

    // $ANTLR start "APEX_TABLE"
    public final void mAPEX_TABLE() throws RecognitionException {
        try {
            int _type = APEX_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:110:11: ( '`' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:110:13: '`'
            {
            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "APEX_TABLE"

    // $ANTLR start "PRIMARY"
    public final void mPRIMARY() throws RecognitionException {
        try {
            int _type = PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:114:8: ( 'PRIMARY' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:114:10: 'PRIMARY'
            {
            match("PRIMARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PRIMARY"

    // $ANTLR start "UNIQUE"
    public final void mUNIQUE() throws RecognitionException {
        try {
            int _type = UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:116:7: ( 'UNIQUE' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:116:9: 'UNIQUE'
            {
            match("UNIQUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNIQUE"

    // $ANTLR start "KEY"
    public final void mKEY() throws RecognitionException {
        try {
            int _type = KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:118:4: ( 'KEY' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:118:6: 'KEY'
            {
            match("KEY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KEY"

    // $ANTLR start "VALUES"
    public final void mVALUES() throws RecognitionException {
        try {
            int _type = VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:120:7: ( 'VALUES' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:120:9: 'VALUES'
            {
            match("VALUES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VALUES"

    // $ANTLR start "VARCHAR"
    public final void mVARCHAR() throws RecognitionException {
        try {
            int _type = VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:122:8: ( 'varchar' LP ( DIGIT )+ RP )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:122:10: 'varchar' LP ( DIGIT )+ RP
            {
            match("varchar"); 



            mLP(); 


            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:122:23: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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


            mRP(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VARCHAR"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:124:3: ( '(' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:124:5: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:126:3: ( ')' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:126:5: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RP"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:4: ( ( 'int' )? ( LP ( DIGIT )+ RP ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:6: ( 'int' )? ( LP ( DIGIT )+ RP )
            {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:6: ( 'int' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='i') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:6: 'int'
                    {
                    match("int"); 



                    }
                    break;

            }


            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:13: ( LP ( DIGIT )+ RP )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:14: LP ( DIGIT )+ RP
            {
            mLP(); 


            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:128:17: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            mRP(); 


            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DATE"
    public final void mDATE() throws RecognitionException {
        try {
            int _type = DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:130:5: ( 'date' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:130:7: 'date'
            {
            match("date"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATE"

    // $ANTLR start "DATETIME"
    public final void mDATETIME() throws RecognitionException {
        try {
            int _type = DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:132:9: ( 'datetime' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:132:11: 'datetime'
            {
            match("datetime"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DATETIME"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:134:7: ( 'double' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:134:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:136:6: ( ',' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:136:8: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "END_STATEMENT"
    public final void mEND_STATEMENT() throws RecognitionException {
        try {
            int _type = END_STATEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:138:14: ( ';' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:138:16: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "END_STATEMENT"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:140:5: ( APEX_TABLE ( LETTER | DIGIT | SPECIAL_CHAR )+ APEX_TABLE )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:140:7: APEX_TABLE ( LETTER | DIGIT | SPECIAL_CHAR )+ APEX_TABLE
            {
            mAPEX_TABLE(); 


            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:140:18: ( LETTER | DIGIT | SPECIAL_CHAR )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')||(LA6_0 >= 'A' && LA6_0 <= 'Z')||LA6_0=='_'||(LA6_0 >= 'a' && LA6_0 <= 'z')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            mAPEX_TABLE(); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:8: ( WS | SPECIAL_CHAR | APEX_VALUE | FIELD_VALUE | NUMBER | CREATE | TABLE | IF | NOT | EXISTS | INSERT | INTO | APEX_TABLE | PRIMARY | UNIQUE | KEY | VALUES | VARCHAR | LP | RP | INT | DATE | DATETIME | DOUBLE | COMMA | END_STATEMENT | NAME )
        int alt7=27;
        switch ( input.LA(1) ) {
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt7=1;
            }
            break;
        case '_':
            {
            alt7=2;
            }
            break;
        case '\'':
            {
            int LA7_3 = input.LA(2);

            if ( ((LA7_3 >= '0' && LA7_3 <= '9')||(LA7_3 >= 'A' && LA7_3 <= 'Z')||LA7_3=='_'||(LA7_3 >= 'a' && LA7_3 <= 'z')) ) {
                alt7=4;
            }
            else {
                alt7=3;
            }
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt7=5;
            }
            break;
        case 'C':
            {
            alt7=6;
            }
            break;
        case 'T':
            {
            alt7=7;
            }
            break;
        case 'I':
            {
            int LA7_7 = input.LA(2);

            if ( (LA7_7=='F') ) {
                alt7=8;
            }
            else if ( (LA7_7=='N') ) {
                int LA7_25 = input.LA(3);

                if ( (LA7_25=='S') ) {
                    alt7=11;
                }
                else if ( (LA7_25=='T') ) {
                    alt7=12;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 25, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 7, input);

                throw nvae;

            }
            }
            break;
        case 'N':
            {
            alt7=9;
            }
            break;
        case 'E':
            {
            alt7=10;
            }
            break;
        case '`':
            {
            int LA7_10 = input.LA(2);

            if ( ((LA7_10 >= '0' && LA7_10 <= '9')||(LA7_10 >= 'A' && LA7_10 <= 'Z')||LA7_10=='_'||(LA7_10 >= 'a' && LA7_10 <= 'z')) ) {
                alt7=27;
            }
            else {
                alt7=13;
            }
            }
            break;
        case 'P':
            {
            alt7=14;
            }
            break;
        case 'U':
            {
            alt7=15;
            }
            break;
        case 'K':
            {
            alt7=16;
            }
            break;
        case 'V':
            {
            alt7=17;
            }
            break;
        case 'v':
            {
            alt7=18;
            }
            break;
        case '(':
            {
            int LA7_16 = input.LA(2);

            if ( ((LA7_16 >= '0' && LA7_16 <= '9')) ) {
                alt7=21;
            }
            else {
                alt7=19;
            }
            }
            break;
        case ')':
            {
            alt7=20;
            }
            break;
        case 'i':
            {
            alt7=21;
            }
            break;
        case 'd':
            {
            int LA7_19 = input.LA(2);

            if ( (LA7_19=='a') ) {
                int LA7_29 = input.LA(3);

                if ( (LA7_29=='t') ) {
                    int LA7_33 = input.LA(4);

                    if ( (LA7_33=='e') ) {
                        int LA7_34 = input.LA(5);

                        if ( (LA7_34=='t') ) {
                            alt7=23;
                        }
                        else {
                            alt7=22;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 33, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 29, input);

                    throw nvae;

                }
            }
            else if ( (LA7_19=='o') ) {
                alt7=24;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 19, input);

                throw nvae;

            }
            }
            break;
        case ',':
            {
            alt7=25;
            }
            break;
        case ';':
            {
            alt7=26;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 7, 0, input);

            throw nvae;

        }

        switch (alt7) {
            case 1 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:10: WS
                {
                mWS(); 


                }
                break;
            case 2 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:13: SPECIAL_CHAR
                {
                mSPECIAL_CHAR(); 


                }
                break;
            case 3 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:26: APEX_VALUE
                {
                mAPEX_VALUE(); 


                }
                break;
            case 4 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:37: FIELD_VALUE
                {
                mFIELD_VALUE(); 


                }
                break;
            case 5 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:49: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 6 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:56: CREATE
                {
                mCREATE(); 


                }
                break;
            case 7 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:63: TABLE
                {
                mTABLE(); 


                }
                break;
            case 8 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:69: IF
                {
                mIF(); 


                }
                break;
            case 9 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:72: NOT
                {
                mNOT(); 


                }
                break;
            case 10 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:76: EXISTS
                {
                mEXISTS(); 


                }
                break;
            case 11 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:83: INSERT
                {
                mINSERT(); 


                }
                break;
            case 12 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:90: INTO
                {
                mINTO(); 


                }
                break;
            case 13 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:95: APEX_TABLE
                {
                mAPEX_TABLE(); 


                }
                break;
            case 14 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:106: PRIMARY
                {
                mPRIMARY(); 


                }
                break;
            case 15 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:114: UNIQUE
                {
                mUNIQUE(); 


                }
                break;
            case 16 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:121: KEY
                {
                mKEY(); 


                }
                break;
            case 17 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:125: VALUES
                {
                mVALUES(); 


                }
                break;
            case 18 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:132: VARCHAR
                {
                mVARCHAR(); 


                }
                break;
            case 19 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:140: LP
                {
                mLP(); 


                }
                break;
            case 20 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:143: RP
                {
                mRP(); 


                }
                break;
            case 21 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:146: INT
                {
                mINT(); 


                }
                break;
            case 22 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:150: DATE
                {
                mDATE(); 


                }
                break;
            case 23 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:155: DATETIME
                {
                mDATETIME(); 


                }
                break;
            case 24 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:164: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 25 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:171: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 26 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:177: END_STATEMENT
                {
                mEND_STATEMENT(); 


                }
                break;
            case 27 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\CreateLexer.g:1:191: NAME
                {
                mNAME(); 


                }
                break;

        }

    }


 

}