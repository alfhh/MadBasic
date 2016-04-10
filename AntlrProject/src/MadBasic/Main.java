package MadBasic;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by lsanchez on 3/9/16.
 */
public class Main {
    public static void main(String [] args){
        try {
            ParseTree tree = Parser.parse("Main.mad", "MadBasic", "madbasic");
            new Visitor().visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }

        TestingGround tester = new TestingGround();

        TestingGround.TestNum[] selectedTests = {
//                TestingGround.TestNum.ALL,
                TestingGround.TestNum.VARIABLE_TABLE,
                TestingGround.TestNum.SCOPETABLE,
                TestingGround.TestNum.PROC_TABLE,
//                TestingGround.TestNum.SEMANTIC_CUBE_TEST,
                TestingGround.TestNum.OPERANDSTACK,
                TestingGround.TestNum.QUADRUPLELIST,
//                TestingGround.TestNum.OPERAND_LIST,
//                TestingGround.TestNum.SEMANTIC_CUBE_PRINT
        };

        tester.testManager(selectedTests);

    }
}
