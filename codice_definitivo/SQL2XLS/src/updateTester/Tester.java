package updateTester;

import java.io.FileReader;
import java.io.FileWriter;

import updatePackage.updateLexer;

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.Token;

public class Tester {

	public static void main(String[] args) {
	  	String fileIn = ".\\resources\\words.txt";
	  	String fileOut = ".\\resources\\lexer.ANTRL.txt";
	  	FileWriter fOut;
	  	Token tk;
	  	int i;

			try {
				System.out.println ("Test ANTLR lexer");
				updateLexer lexer = new updateLexer(new ANTLRReaderStream(new FileReader(fileIn))); 
				fOut = new FileWriter (fileOut);
				i = 0;
				while ((tk = lexer.nextToken()).getType() != updateLexer.EOF) {
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