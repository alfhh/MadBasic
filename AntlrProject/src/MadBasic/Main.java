package MadBasic;

import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;

/**
 * Created by lsanchez on 3/9/16.
 */
public class Main {
    public static void main(String [] args){
        try {
            ParseTree tree = Parser.parse("Ex1.mad", "MadBasic", "madbasic");
            new Visitor().visit(tree);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
