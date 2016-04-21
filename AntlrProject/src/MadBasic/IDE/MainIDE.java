package MadBasic.IDE;

import MadBasic.Visitor;
import MadBasic.Parser;
import MadBasic.TestingGround;
import MadBasic.VMachine.Machine;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 * Created by lsanchez on 3/9/16.
 */
public class MainIDE extends JFrame implements ActionListener, SystemIO {

    private static MainIDE instance;
    private RSyntaxTextArea editorArea;
    private JMenuBar menuBarOptions;
    private JMenu file, build, help;
    private JMenuItem miNewFile, miSaveFile, miSaveAsFile, miOpen, miCloseApp;
    private JMenuItem miCompile, miRun, miRunCompile;
    private JMenuItem miHelpOnline, miAbout;
    private JPanel thePanel;
    private JTextArea jConsole;

    private ArchiveHandler archiveHandler;
    Machine myMachine;


    private MainIDE() {

        archiveHandler = new ArchiveHandler();
        this.setSize(800, 800);
        this.setLocationRelativeTo(null); // Center of the screen
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Mad Basic IDE");

        // Build menu bar
        menuBarOptions = new JMenuBar();
        file = new JMenu("File");
        build = new JMenu("Build");
        help = new JMenu("Help");

        // Components of File menu
        miNewFile = new JMenuItem("New");
        miOpen = new JMenuItem("Open");
        miSaveFile = new JMenuItem("Save");
        miSaveAsFile = new JMenuItem("Save As");
        miCloseApp = new JMenuItem("Exit");
        file.add(miNewFile);
        file.add(miOpen);
        file.add(miSaveFile);
        file.add(miSaveAsFile);
        file.add(miCloseApp);

        // Components of Build menu
        miCompile = new JMenuItem("Compile");
        miRun = new JMenuItem("Run");
        miRunCompile = new JMenuItem("Run and Compile");
        build.add(miCompile);
        build.add(miRun);
        build.add(miRunCompile);

        // Components of Help menu
        miHelpOnline = new JMenuItem("Online help");
        miAbout = new JMenuItem("About");
        help.add(miHelpOnline);
        help.add(miAbout);

        // Add action listeners to buttons
        miNewFile.addActionListener(this);
        miSaveFile.addActionListener(this);
        miSaveAsFile.addActionListener(this);
        miOpen.addActionListener(this);
        miCloseApp.addActionListener(this);
        miCompile.addActionListener(this);
        miRun.addActionListener(this);
        miRunCompile.addActionListener(this);
        miHelpOnline.addActionListener(this);
        miAbout.addActionListener(this);

        // Add all the menu to the menu bar
        menuBarOptions.add(file);
        menuBarOptions.add(build);
        menuBarOptions.add(help);
        this.setJMenuBar(menuBarOptions);

        thePanel = new JPanel();
        thePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 2, 10));

        // ---------------------------------------------- RSyntaxTextArea
        editorArea = new RSyntaxTextArea(30, 90);
        editorArea.setSyntaxEditingStyle(SyntaxConstants.SYNTAX_STYLE_JAVA);
        editorArea.setCodeFoldingEnabled(true);
        editorArea.setEditable(false);

        // Scrolling enabled for editor
        RTextScrollPane sp = new RTextScrollPane(editorArea);
        thePanel.add(sp);

        // ---------------------------------------------- RSyntaxTextArea

        jConsole = new JTextArea(12, 69);
        thePanel.add(jConsole);

        this.add(thePanel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){

        if(e.getSource() == miCloseApp){
            System.exit(0);
        }

        if(e.getSource() == miNewFile){
            // TODO CHECK IF THE FILE IS NOT SAVED
            editorArea.setText("");
            archiveHandler.resetActualFile();
        }

        if(e.getSource() == miSaveFile){
            String data = editorArea.getText();

            if(archiveHandler.getActualFile() != null){
                archiveHandler.saveFile(data);
            } else {
                archiveHandler.saveFileAs(data, this);
            }
        }

        if(e.getSource() == miSaveAsFile){
            String data = editorArea.getText();
            archiveHandler.saveFileAs(data, this);
        }

        if(e.getSource() == miOpen){
            String fileData = archiveHandler.openFile(this);
            editorArea.setText(fileData);
        }

        if(e.getSource() == miCompile){

            if (archiveHandler.getActualFile() != null){

                try {
                    ParseTree tree = Parser.parse(archiveHandler.getActualFile().getName(), "MadBasic", "madbasic");
                    new Visitor().visit(tree);
                } catch (IOException error) {
                    error.printStackTrace();
                }

                TestingGround tester = new TestingGround();

                TestingGround.TestNum[] selectedTests = {
                        TestingGround.TestNum.SCOPETABLE,
                        TestingGround.TestNum.PROC_TABLE,
                        TestingGround.TestNum.OPERANDSTACK,
                        TestingGround.TestNum.QUADRUPLELIST,
                };

                tester.testManager(selectedTests);

            } else {
                JOptionPane.showMessageDialog(null,
                        "\nPlease save file first",
                        "Error",JOptionPane.WARNING_MESSAGE);
            }

        }

        if(e.getSource() == miRun){
            myMachine = Machine.getInstance();
            myMachine.run();
        }

    }

    @Override
    public void print(String message) {
        jConsole.append(message + "\n");
    }

    /**
     * Function that logs an error to the IDE console
     * The message displayed will have a prefix string equal to
     * "Error: "
     * @param message the message that is displayed
     */
    @Override
    public void printError(String message) {
        jConsole.append("ERROR: " + message + "\n");
    }

    @Override
    public String read(String messageResquest) {
        String res = JOptionPane.showInputDialog(messageResquest);
        return res;
    }

    // Singleton..
    static public MainIDE getInstance(){
        if (instance == null){
            instance = new MainIDE();
        }
        return instance;
    }
}
