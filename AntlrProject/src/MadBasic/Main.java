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
        //int[] selectedTests = {0}; // ALL
        int[] selectedTests = {1, 5}; // Just semantic cube;
        tester.testManager(selectedTests);
        //BasicSemantic basicSemantic =  BasicSemantic.getInstance();

    }
}
