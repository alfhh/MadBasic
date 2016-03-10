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

        BasicSemantic basicSemantic =  BasicSemantic.getInstance();

        System.out.println("Tabla de variables");
        for (Variable variable: basicSemantic.getVariables()) {
            System.out.println(variable);
        }

        System.out.println();

        System.out.println("Tabla de Scopes");
        for (Scope scope: basicSemantic.getScopes()) {
            System.out.println(scope);
        }

        System.out.println();

        System.out.println("Tabla de procedimientos");
        for (Procedure procedure: basicSemantic.getProcedures()) {
            System.out.println(procedure);
        }
    }
}
