package MadBasic;


import MadBasic.IDE.MainIDE;
import MadBasic.Semantic.BasicSemantic;
import MadBasic.VMachine.Machine;
import MadBasic.YUML.YUMLParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by lsanchez on 3/9/16.
 */
public class Main {


    public static void main(String[] args) {

        /*
        ParseTree tree = null;

        try {
            tree = Parser.parse("ArrayTest.mad", "MadBasic", "madbasic");
            new Visitor().visit(tree);
        } catch (IOException error) {
            error.printStackTrace();
        }

        TestingGround tester = new TestingGround();

        TestingGround.TestNum[] selectedTests = {
                TestingGround.TestNum.VARIABLE_TABLE,
//                TestingGround.TestNum.SCOPETABLE,
//                TestingGround.TestNum.PROC_TABLE,
                TestingGround.TestNum.OPERANDSTACK,
                TestingGround.TestNum.QUADRUPLELIST,
                TestingGround.TestNum.ERAS,
                TestingGround.TestNum.CLASSES,
        };

        tester.testManager(selectedTests);

        /**/

        /*

        YUMLParser yuml = new YUMLParser();
        yuml.makeDiagram(BasicSemantic.getInstance().getClassHashMap());
        yuml.createDiagram();
        yuml.runDiagram();

        /**/

        //*
        MainIDE ide = MainIDE.getInstance();
        Machine vmachine = Machine.getInstance();
        /**/
    }
}
