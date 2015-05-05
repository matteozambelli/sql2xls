// $ANTLR 3.4 C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g 2015-04-13 20:47:23
 
package update;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class updateLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public updateLexer() {} 
    public updateLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public updateLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g"; }

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:79:16: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:
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
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:82:15: ( ( '0' .. '9' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:
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

    // $ANTLR start "UPDATE_KEY"
    public final void mUPDATE_KEY() throws RecognitionException {
        try {
            int _type = UPDATE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:87:10: ( 'UPDATE' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:87:12: 'UPDATE'
            {
            match("UPDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UPDATE_KEY"

    // $ANTLR start "TABLE_KEY"
    public final void mTABLE_KEY() throws RecognitionException {
        try {
            int _type = TABLE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:91:10: ( 'TABLE' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:91:12: 'TABLE'
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
    // $ANTLR end "TABLE_KEY"

    // $ANTLR start "SET_KEY"
    public final void mSET_KEY() throws RecognitionException {
        try {
            int _type = SET_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:95:10: ( 'SET' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:95:12: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SET_KEY"

    // $ANTLR start "WHERE_KEY"
    public final void mWHERE_KEY() throws RecognitionException {
        try {
            int _type = WHERE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:99:10: ( 'WHERE' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:99:12: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE_KEY"

    // $ANTLR start "AND_KEY"
    public final void mAND_KEY() throws RecognitionException {
        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:104:10: ( 'AND' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:104:12: 'AND'
            {
            match("AND"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AND_KEY"

    // $ANTLR start "OR_KEY"
    public final void mOR_KEY() throws RecognitionException {
        try {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:108:10: ( 'OR' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:108:12: 'OR'
            {
            match("OR"); 



            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OR_KEY"

    // $ANTLR start "MULTIPLE_KEY"
    public final void mMULTIPLE_KEY() throws RecognitionException {
        try {
            int _type = MULTIPLE_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:112:10: ( ( AND_KEY | OR_KEY )* )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:112:12: ( AND_KEY | OR_KEY )*
            {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:112:12: ( AND_KEY | OR_KEY )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='A') ) {
                    alt1=1;
                }
                else if ( (LA1_0=='O') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:112:13: AND_KEY
            	    {
            	    mAND_KEY(); 


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:112:23: OR_KEY
            	    {
            	    mOR_KEY(); 


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTIPLE_KEY"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:116:6: ( ',' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:116:8: ','
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
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:120:6: ( ';' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:120:8: ';'
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

    // $ANTLR start "ASSIGNMENT"
    public final void mASSIGNMENT() throws RecognitionException {
        try {
            int _type = ASSIGNMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:124:6: ( '=' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:124:8: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASSIGNMENT"

    // $ANTLR start "PUNT"
    public final void mPUNT() throws RecognitionException {
        try {
            int _type = PUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:128:5: ( ( ',' | '.' | '!' | '?' | ';' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:
            {
            if ( input.LA(1)=='!'||input.LA(1)==','||input.LA(1)=='.'||input.LA(1)==';'||input.LA(1)=='?' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PUNT"

    // $ANTLR start "IDENTIFIER_TABLE_FIELD"
    public final void mIDENTIFIER_TABLE_FIELD() throws RecognitionException {
        try {
            int _type = IDENTIFIER_TABLE_FIELD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:131:23: ( '`' LETTER ( LETTER | DIGIT | '_' )* '`' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:132:1: '`' LETTER ( LETTER | DIGIT | '_' )* '`'
            {
            match('`'); 

            mLETTER(); 


            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:132:12: ( LETTER | DIGIT | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:
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
            	    break loop2;
                }
            } while (true);


            match('`'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER_TABLE_FIELD"

    // $ANTLR start "IDENTIFIER_VALUE_STRING"
    public final void mIDENTIFIER_VALUE_STRING() throws RecognitionException {
        try {
            int _type = IDENTIFIER_VALUE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:134:24: ( '\\'' ( LETTER | DIGIT | '_' | ' ' | PUNT )+ '\\'' )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:135:1: '\\'' ( LETTER | DIGIT | '_' | ' ' | PUNT )+ '\\''
            {
            match('\''); 

            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:135:6: ( LETTER | DIGIT | '_' | ' ' | PUNT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= ' ' && LA3_0 <= '!')||LA3_0==','||LA3_0=='.'||(LA3_0 >= '0' && LA3_0 <= '9')||LA3_0==';'||LA3_0=='?'||(LA3_0 >= 'A' && LA3_0 <= 'Z')||LA3_0=='_'||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:
            	    {
            	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||input.LA(1)==','||input.LA(1)=='.'||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)==';'||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER_VALUE_STRING"

    // $ANTLR start "IDENTIFIER_VALUE_NUMBER"
    public final void mIDENTIFIER_VALUE_NUMBER() throws RecognitionException {
        try {
            int _type = IDENTIFIER_VALUE_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:137:24: ( ( DIGIT )+ )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:138:1: ( DIGIT )+
            {
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:138:1: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER_VALUE_NUMBER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:140:3: ( ( '\\r' | '\\n' | '\\t' | ' ' ) )
            // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:141:2: ( '\\r' | '\\n' | '\\t' | ' ' )
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

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:8: ( UPDATE_KEY | TABLE_KEY | SET_KEY | WHERE_KEY | MULTIPLE_KEY | COMMA | END_STATEMENT | ASSIGNMENT | PUNT | IDENTIFIER_TABLE_FIELD | IDENTIFIER_VALUE_STRING | IDENTIFIER_VALUE_NUMBER | WS )
        int alt5=13;
        switch ( input.LA(1) ) {
        case 'U':
            {
            alt5=1;
            }
            break;
        case 'T':
            {
            alt5=2;
            }
            break;
        case 'S':
            {
            alt5=3;
            }
            break;
        case 'W':
            {
            alt5=4;
            }
            break;
        case ',':
            {
            alt5=6;
            }
            break;
        case ';':
            {
            alt5=7;
            }
            break;
        case '=':
            {
            alt5=8;
            }
            break;
        case '!':
        case '.':
        case '?':
            {
            alt5=9;
            }
            break;
        case '`':
            {
            alt5=10;
            }
            break;
        case '\'':
            {
            alt5=11;
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
            alt5=12;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt5=13;
            }
            break;
        default:
            alt5=5;
        }

        switch (alt5) {
            case 1 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:10: UPDATE_KEY
                {
                mUPDATE_KEY(); 


                }
                break;
            case 2 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:21: TABLE_KEY
                {
                mTABLE_KEY(); 


                }
                break;
            case 3 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:31: SET_KEY
                {
                mSET_KEY(); 


                }
                break;
            case 4 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:39: WHERE_KEY
                {
                mWHERE_KEY(); 


                }
                break;
            case 5 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:49: MULTIPLE_KEY
                {
                mMULTIPLE_KEY(); 


                }
                break;
            case 6 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:62: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 7 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:68: END_STATEMENT
                {
                mEND_STATEMENT(); 


                }
                break;
            case 8 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:82: ASSIGNMENT
                {
                mASSIGNMENT(); 


                }
                break;
            case 9 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:93: PUNT
                {
                mPUNT(); 


                }
                break;
            case 10 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:98: IDENTIFIER_TABLE_FIELD
                {
                mIDENTIFIER_TABLE_FIELD(); 


                }
                break;
            case 11 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:121: IDENTIFIER_VALUE_STRING
                {
                mIDENTIFIER_VALUE_STRING(); 


                }
                break;
            case 12 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:145: IDENTIFIER_VALUE_NUMBER
                {
                mIDENTIFIER_VALUE_NUMBER(); 


                }
                break;
            case 13 :
                // C:\\Users\\Matteo\\workspace\\SQL2XLS\\src\\update.g:1:169: WS
                {
                mWS(); 


                }
                break;

        }

    }


 

}