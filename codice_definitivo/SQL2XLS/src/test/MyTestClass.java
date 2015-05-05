package test;
import java.io.FileReader;
import java.io.FileWriter;

import org.antlr.runtime.ANTLRReaderStream;

import createinsert.*;

import org.antlr.runtime.Token;

public class MyTestClass {

	public static void main(String[] args) {
	  	String fileIn = ".\\resources\\words.txt";
	  	String fileOut = ".\\resources\\lexer.ANTRL.txt";
	  	FileWriter fOut;
	  	Token tk;
	  	int i;

			try {
				System.out.println ("Test ANTLR lexer");
				CreateLexerLexer lexer = new CreateLexerLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
				fOut = new FileWriter (fileOut);
				i = 0;
				while ((tk = lexer.nextToken()).getType() != CreateLexerLexer.EOF) {
					System.out.println(++i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" + 
							"TokenType:" + tk.getType() + ":\t" + tk.getText());
					fOut.append(i + ":[" + tk.getLine() + "," + tk.getCharPositionInLine() + "]\t" + 
															"TokenType:" + tk.getType() + ":\t" + tk.getText() + "\n");
				} 
				fOut.close();
			} catch (Exception e) {
				System.out.println ("Test ANTLR abortito");
				e.printStackTrace();
			}
	  }	
}
