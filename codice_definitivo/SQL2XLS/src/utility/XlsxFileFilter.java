package utility;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class XlsxFileFilter extends FileFilter {	  

	/*
	 * Filtro sui file xlsx, accetta solo file xlsx 
	 */
	@Override
	public boolean accept(File arg0) {
		if (arg0.isDirectory()) return true; //il true serve per navigare nelle directory
	    String fname = arg0.getName().toLowerCase();
	    return fname.endsWith("xls");
	}
	
	public String getDescription() {
	    return "XLS FILES";
	  }
}
