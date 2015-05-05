package utility;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class SqlFileFilter extends FileFilter {	  

	/*
	 * Filtro sui file sql, accetta solo file sql 
	 */
	@Override
	public boolean accept(File arg0) {
		if (arg0.isDirectory()) return true;
	    String fname = arg0.getName().toLowerCase();
	    return fname.endsWith("sql");
	}
	
	public String getDescription() {
	    return "SQL FILES";
	  }
}
