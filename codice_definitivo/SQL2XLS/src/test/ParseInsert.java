package test;

import java.io.FileReader;
import java.io.IOException;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import tables.Utils;
import createinsert.CreateLexerLexer;
import createinsert.CreateLexerParser;

public class ParseInsert {
    static CreateLexerParser parser;
  
    public static void startParsing(String path, String outputDir, String filename) throws IOException, RecognitionException {
    	
    	
        CommonTokenStream tokens;
          String fileIn = path;

          Utils.getInstance().setOutputFolder(outputDir);
          Utils.getInstance().setFilename(filename);
      //      try {
                
                CreateLexerLexer lexer = new CreateLexerLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
            tokens = new CommonTokenStream(lexer);
            parse (tokens);
       //     } catch (Exception e) {
                
           //     e.printStackTrace();
                
            //}
            
            

      }
    
   

  static void parse (CommonTokenStream tokens) throws IOException, RecognitionException {
    parser = new CreateLexerParser(tokens);
    parser.start();

  }
}