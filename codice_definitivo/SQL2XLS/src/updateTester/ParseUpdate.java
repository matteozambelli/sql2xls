package updateTester;



	import java.io.FileReader;
	import java.io.IOException;

	import org.antlr.runtime.ANTLRReaderStream;
	import org.antlr.runtime.CommonTokenStream;
	import org.antlr.runtime.RecognitionException;

	import updatePackage.updateLexer;
	import updatePackage.updateParser;

	public class ParseUpdate {	    
		
		static updateParser parser;
	  
	    public static void main(String[] args) {
	    CommonTokenStream tokens;
	      String fileIn = ".\\resources\\words.txt";

	        try {
	            System.out.println ("Start Parsing");
	            System.out.println ("-----------------------");
	            updateLexer lexer = new updateLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
	        tokens = new CommonTokenStream(lexer);
	        parse (tokens);
	        } catch (Exception e) {
	            System.out.println ("Parsing abortito\n\n");
	            e.printStackTrace();
	        }

	  }

	  static void parse (CommonTokenStream tokens) throws IOException, RecognitionException {
	    parser = new updateParser(tokens);
	    parser.start();

	   /* if (parser.uh.errors.isEmpty())
	        System.out.println ("Parsing completato con successo\n\n");
	    else 
	        System.out.println ("Parsing completato con " + parser.uh.errors.size() + " errori semantici\n\n"+parser.ph.getErr());
*/
	  }
	}