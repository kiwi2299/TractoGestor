/**
 * This class allows the user to choose a file with the given extensions.This class is general and could be a public class in its own file.
 * 
 * @author kaydell
    
 */
package clases;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Usuario
 */
public class FileChooser {


    public File chooseFile(String description, String... extensions) {
		JFileChooser chooser = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(description, extensions);
		chooser.setFileFilter(filter);
		int returnVal = chooser.showOpenDialog(null);
		if(returnVal == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile(); 
			System.out.println("You chose to open this file: " + selectedFile.getAbsolutePath());
			return selectedFile;
		} else {
			return null;
		}
	}

}
