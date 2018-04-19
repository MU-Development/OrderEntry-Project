
import javax.swing.*;
import java.io.*;

/**
 * FileChooser is a Dialog box that interacts with the user
 * to select a file. 
 * @author U146576
 * @since jdk1.5
 */
public class FileChooser {

    public String selectFile(String dfile){
        JFileChooser jfc = new JFileChooser();
        int returnVal = jfc.showOpenDialog(null);

        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File selectedFile = jfc.getSelectedFile();
            dfile = selectedFile.getAbsolutePath();
        }
        return dfile;
    }
}
