package MadBasic;

import ParserMadBasic.MadBasicBaseVisitor;
import ParserMadBasic.MadBasicParser;

import java.util.Arrays;
import java.util.LinkedList;

/**

 * Created by lsanchez on 3/10/16.
 */
public class Visitor extends MadBasicBaseVisitor<String> {

    BasicSemantic basicSemantic;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
    }


    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        String type = ctx.getChild(0).getText();
        LinkedList<String> ids = new LinkedList<>();
        ids.add(ctx.getChild(1).getText());
        ids.addAll(Arrays.asList(ctx.getChild(2).getText().trim().split(",")));
        for (String id : ids) {
            if (id.trim().length() > 0) {
                basicSemantic.getVariables().add(new Variable(id, type, basicSemantic.getScopeStack().peek()));
            }
        }
        return super.visitE(ctx);
    }


    // Functions
    @Override
    public String visitFunction(MadBasicParser.FunctionContext ctx) {
        String id = ctx.getChild(1).getText();
        Scope scp = new Scope(id, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(scp);
        basicSemantic.getScopeStack().push(scp);
        visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return null;
    }

    // Procedure
    @Override
    public String visitProcedure(MadBasicParser.ProcedureContext ctx) {
        String id = ctx.getChild(1).getText();
        Scope scp = new Scope(id, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(scp);
        basicSemantic.getScopeStack().push(scp);
        visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return null;
    }

    //Main


    @Override
    public String visitMain(MadBasicParser.MainContext ctx) {
        String name = "main";
        Scope scp = new Scope(name, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(scp);
        basicSemantic.getScopeStack().push(scp);
        visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
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
