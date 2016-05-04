package MadBasic.IDE;

import MadBasic.Parser;
import MadBasic.Quadruples.QuadrupleSemantic;
import MadBasic.Semantic.BasicSemantic;
import MadBasic.TestingGround;
import MadBasic.VMachine.Machine;
import MadBasic.VMemory.VirtualMemory;
import MadBasic.Visitor;
import MadBasic.YUML.YUMLParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.fife.ui.rsyntaxtextarea.RSyntaxTextArea;
import org.fife.ui.rsyntaxtextarea.SyntaxConstants;
import org.fife.ui.rtextarea.RTextScrollPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * Created by ahinojosa on 4/17/16.
 */
public class MainIDE extends JFrame implements ActionListener, SystemIO {

    private static MainIDE instance;
    private RSyntaxTextArea editorArea;
    private JMenuBar menuBarOptions;
    private JMenu file, build, help;
    private JMenuItem miNewFile, miSaveFile, miSaveAsFile, miOpen, miCloseApp;
    private JMenuItem miCompile, miRun, miRunCompile, miCreateDiagram;
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
        miRunCompile = new JMenuItem("Compile and Run");
        miCreateDiagram = new JMenuItem("Show class diagram");
        build.add(miCompile);
        build.add(miRun);
        build.add(miRunCompile);
        build.add(miCreateDiagram);

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
        miCreateDiagram.addActionListener(this);

        // Accelerators "CTRL + ?"
        miOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, Event.CTRL_MASK));
        miSaveFile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, Event.CTRL_MASK));
        miCompile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B, Event.CTRL_MASK));
        miRun.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, Event.CTRL_MASK));
        miRunCompile.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, Event.CTRL_MASK));
        miCloseApp.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Event.CTRL_MASK));
        miCreateDiagram.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_M, Event.CTRL_MASK));

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

        // Scrolling enabled for editor
        RTextScrollPane sp = new RTextScrollPane(editorArea);
        thePanel.add(sp);

        // ---------------------------------------------- RSyntaxTextArea

        jConsole = new JTextArea(12, 69);
        jConsole.setEditable(false);
        jConsole.setLineWrap(true);
        jConsole.setWrapStyleWord(true);
        thePanel.add(jConsole);

        JScrollPane scrollbar1 = new JScrollPane(jConsole, JScrollPane.
                VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);


        thePanel.add(scrollbar1);

        this.add(thePanel);
        this.setVisible(true);
    }

    // Singleton..
    static public MainIDE getInstance() {
        if (instance == null) {
            instance = new MainIDE();
        }
        return instance;
    }

    /* ---- IDE FUNCTIONS ---- */

    public void save() {
        String data = editorArea.getText();

        if (archiveHandler.getActualFile() != null) {
            archiveHandler.saveFile(data);
        } else {
            archiveHandler.saveFileAs(data, this);
        }
    }

    public void saveAs() {
        String data = editorArea.getText();
        archiveHandler.saveFileAs(data, this);
    }

    public void open() {
        String fileData = archiveHandler.openFile(this);
        editorArea.setText(fileData);
    }


    public void newFile() {
        // TODO CHECK IF THE FILE IS NOT SAVED
        editorArea.setText("");
        archiveHandler.resetActualFile();
    }

    public void compile() {
        if (archiveHandler.getActualFile() != null) {
            ParseTree tree = null;

            try {
                tree = Parser.parse(archiveHandler.getActualFile().getAbsolutePath(), "MadBasic", "madbasic");
                new Visitor().visit(tree);
            } catch (IOException error) {
                error.printStackTrace();
            }

            TestingGround tester = new TestingGround();

            TestingGround.TestNum[] selectedTests = {
                    TestingGround.TestNum.VARIABLE_TABLE,
                    TestingGround.TestNum.SCOPETABLE,
                    TestingGround.TestNum.PROC_TABLE,
                    TestingGround.TestNum.OPERANDSTACK,
                    TestingGround.TestNum.QUADRUPLELIST,
            };

            tester.testManager(selectedTests);

            myMachine = Machine.getInstance();


            // Send actual values to the VMachine
            myMachine.getCompiledData(QuadrupleSemantic.getInstance().getQuadrupleList(),
                    VirtualMemory.getInstance(),
                    VirtualMemory.getInstance().getvDirectory(),
                    VirtualMemory.getInstance().getvMemory());

        } else {
            JOptionPane.showMessageDialog(null,
                    "\nPlease save file first",
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void run() {

        if (archiveHandler.getActualFile() != null) {
            jConsole.setText("");
            if (myMachine.run()) {
                print("Program successfully finished");
            } else {
                printError("Execution time error");
            }
        } else { // TODO: 22/04/16 Add compilationg succesful flag
            JOptionPane.showMessageDialog(null,
                    "\nCompile file first",
                    "Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public void createDiagram() {
        if (!(BasicSemantic.getInstance() != null && !BasicSemantic.getInstance().getClassHashMap().isEmpty())) {
            compile();
        }
        YUMLParser yuml = new YUMLParser();
        yuml.makeDiagram(BasicSemantic.getInstance().getClassHashMap());
        yuml.createDiagram();
        yuml.runDiagram();
    }

    /* ---- IDE FUNCTIONS ---- */

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == miCloseApp) {
            System.exit(0);
        }

        if (e.getSource() == miNewFile) {
            newFile();
        }

        if (e.getSource() == miSaveFile) {
            save();
        }

        if (e.getSource() == miSaveAsFile) {
            saveAs();
        }

        if (e.getSource() == miOpen) {
            open();
        }

        if (e.getSource() == miCompile) {
            save();
            compile();

        }

        if (e.getSource() == miRun) {
            run();
        }

        if (e.getSource() == miRunCompile) {
            save();
            compile();
            run();
        }

        if (e.getSource() == miCreateDiagram) {
            createDiagram();
        }

    }

    @Override
    public void print(String message) {
        message = message.replace("\"", "");
        jConsole.append(message + "\n");
    }

    /**
     * Function that logs an error to the IDE console
     * The message displayed will have a prefix string equal to
     * "Error: "
     *
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

}
