package MadBasic.IDE;

import javax.swing.*;
import java.io.*;

/**
 * Created by ahinojosa on 16/04/16.
 */
public class ArchiveHandler {

    File actualFile; // This variable holds an instance of File that corresponds to the last saved document on the IDE

    public ArchiveHandler(){
        this.actualFile = null;
    }

    public File getActualFile() {
        return actualFile;
    }

    public void setActualFile(File actualFile) {
        this.actualFile = actualFile;
    }

    public void resetActualFile(){
        this.actualFile = null;
    }

    /**
     * This procedure saves a file to disk with the actual text of the text editor
     * @param editorData
     */
    public void saveFile(String editorData){
        try {
            File savedFile = getActualFile();

            if(savedFile !=null) {
                FileWriter  save= new FileWriter(savedFile);
                save.write(editorData);
                save.close();
                setActualFile(savedFile);
            }
        }
        catch(IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error, file not saved",
                    "WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }

    /**
     * This procedure saves a new file to disk
     * @param editorData
     * @param window
     */
    public void saveFileAs(String editorData, JFrame window) {
        try {
            JFileChooser fileC = new JFileChooser();
            fileC.showSaveDialog(window);
            File savedFile = fileC.getSelectedFile();

            if(savedFile !=null) {
                FileWriter  save= new FileWriter(savedFile);
                save.write(editorData);
                save.close();
                setActualFile(savedFile);
                JOptionPane.showMessageDialog(null,
                        "File saved",
                        "Done",JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Error, file not saved",
                    "WARNING",JOptionPane.WARNING_MESSAGE);
        }
    }


    /**
     * This function opens a JFileChooser in order to get a file and load its
     * contents in the editor
     * @param window the main JFrame
     * @return a String with all the data of the file
     */
    public String openFile(JFrame window) {
        String aux="";
        String data="";
        try {
            JFileChooser fileC =new JFileChooser();
            fileC.showOpenDialog(window);

            File theFile = fileC.getSelectedFile(); // Get the selected file

            if(theFile!=null) {
                FileReader content =new FileReader(theFile);
                BufferedReader buffer =new BufferedReader(content);
                while((aux=buffer.readLine())!=null)  { // Until get all info
                    data+= aux+ "\n";
                }
                setActualFile(theFile);
                buffer.close();
            }
        }
        catch(IOException ex) {
            JOptionPane.showMessageDialog(null,ex+"" +
                            "\nFile not found",
                    "Warning",JOptionPane.WARNING_MESSAGE);
        }
        return data;
    }

}
