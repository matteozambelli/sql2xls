package updatehandlers;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import update.updateLexer;
import update.updateParser;
import utility.Utils;

public class ParseUpdate {	    
	
	static updateParser parser;
	
	
	public static void startParsing(String path, String outputDir,String inputXls,String filename) {
    	
    	
        CommonTokenStream tokens;
          String fileIn = path;
          Utils.getInstance().setOutputFolder(outputDir);
          Utils.getInstance().setInputXls(inputXls);
          Utils.getInstance().setFilename(filename);

	        try {
	            updateLexer lexer = new updateLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
	        tokens = new CommonTokenStream(lexer);
	        parse (tokens);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
      }		

  static void parse (CommonTokenStream tokens) throws IOException, RecognitionException {
    parser = new updateParser(tokens);
    parser.start();

  }
}