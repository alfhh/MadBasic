package MadBasic;

import ParserMadBasic.MadBasicBaseVisitor;
import ParserMadBasic.MadBasicParser;

/**

 * Created by lsanchez on 3/10/16.
 */
public class Visitor extends MadBasicBaseVisitor<String> {

    BasicSemantic basicSemantic;
    String lastType;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
    }

//    @Override
//    public String visitType(MadBasicParser.TypeContext ctx) {
//        if (ctx.getChildCount() == 1){
//            System.out.print(ctx.getChild(0));
//        }
//        else {
//            System
//        }
//        String t = visitChildren(ctx);
//        return t;
//    }

    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        System.out.print(ctx.getChild(0).getText());
        System.out.print(ctx.getChild(1).getText());
        System.out.print(ctx.getChild(2).getText());
        System.out.println();
        return super.visitE(ctx);
    }

//    @Override
//    public String visitF(MadBasicParser.FContext ctx) {
//        if (ctx.getChildCount() > 1) {
//            System.out.print(ctx.getChild(1));
//        }
//        String t = visitChildren(ctx);
//        return t;
//    }


    // Functions
    @Override
    public String visitFunction(MadBasicParser.FunctionContext ctx) {
        String type = ctx.getChild(0).getText();
        String id = ctx.getChild(1).getText();
        System.out.println(type + " " + id);
        return null;
    }

    // Procedure
    @Override
    public String visitProcedure(MadBasicParser.ProcedureContext ctx) {
        String type = "void";
        String id = ctx.getChild(1).getText();
        System.out.println(type + " " + id);
        return null;
    }

    @Override
    public String visitClasse(MadBasicParser.ClasseContext ctx) {
        String name = ctx.getChild(1).getText();
        Scope scp = new Scope(name, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(scp);
        basicSemantic.getScopeStack().push(scp);
        visitChildren(ctx);
        basicSemantic.getScopeStack().pop();

        return null;
    }
}
