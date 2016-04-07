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
    QuadrupleSemantic quadrupleSemantic;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
        quadrupleSemantic = QuadrupleSemantic.getInstance();
    }


    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        String type = ctx.getChild(0).getText();
        LinkedList<String> ids = new LinkedList<>();
        ids.add(ctx.getChild(1).getText());
        ids.addAll(Arrays.asList(ctx.getChild(2).getText().trim().split(",")));
        for (String id : ids) {
            if (id.trim().length() > 0) {
                Variable var = new Variable(id, type, basicSemantic.getScopeStack().peek());
                basicSemantic.getVariables().add(var);
                basicSemantic.getScopeStack().peek().getVariables().add(var);
            }
        }
        return super.visitE(ctx);
    }


    // Functions
    @Override
    public String visitFunction(MadBasicParser.FunctionContext ctx) {
        String id = ctx.getChild(1).getText();
        String type = ctx.getChild(0).getText();
        Scope scp = new Scope(id, basicSemantic.getScopeStack().peek());
        Procedure proc = new Procedure(id, type, scp);
        basicSemantic.getProcedures().add(proc);
        basicSemantic.getScopes().add(proc.getScope());
        basicSemantic.getScopeStack().push(proc.getScope());
        String res = visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return res;
    }

    // Procedure
    @Override
    public String visitProcedure(MadBasicParser.ProcedureContext ctx) {
        String id = ctx.getChild(1).getText();
        Scope scp = new Scope(id, basicSemantic.getScopeStack().peek());
        Procedure proc = new Procedure(id, "void", scp);
        basicSemantic.getProcedures().add(proc);
        basicSemantic.getScopes().add(proc.getScope());
        basicSemantic.getScopeStack().push(proc.getScope());
        String res = visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return res;
    }


    //Main


    @Override
    public String visitMain(MadBasicParser.MainContext ctx) {
        String name = "main";
        Scope scp = new Scope(name, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(scp);
        basicSemantic.getScopeStack().push(scp);
        String res = visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return res;
    }

    @Override
    public String visitClasse(MadBasicParser.ClasseContext ctx) {
        String name = ctx.getChild(1).getText();
        Scope scp = new Scope(name, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(scp);
        basicSemantic.getScopeStack().push(scp);
        String res = visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return res;
    }

    //QUADRUPLES

    //EXPRESSION

    @Override
    public String visitT(MadBasicParser.TContext ctx) {
        String res = visitChildren(ctx);
        if(ctx.getChildCount() > 0){
            Operand temp1 = quadrupleSemantic.operandStack.peek();
            Operand temp2 = quadrupleSemantic.operandStack.peek();
            String operand = ctx.getChild(1).getText();

            //cubo semantico

            //agregar cuadruplo
        }
        return res;
    }

    @Override
    public String visitY(MadBasicParser.YContext ctx) {
        String res = visitChildren(ctx);
        if(ctx.getChildCount() > 0){
            Operand temp1 = quadrupleSemantic.operandStack.peek();
            Operand temp2 = quadrupleSemantic.operandStack.peek();
            String operand = ctx.getChild(1).getText();

            //cubo semantico

            //agregar cuadruplo
        }
        return res;
    }

    @Override
    public String visitV(MadBasicParser.VContext ctx) {
        String res = visitChildren(ctx);
        if(ctx.getChildCount() > 0){
            Operand temp1 = quadrupleSemantic.operandStack.peek();
            Operand temp2 = quadrupleSemantic.operandStack.peek();
            String operand = ctx.getChild(1).getText();

            //cubo semantico

            //agregar cuadruplo
        }
        return res;
    }

    @Override
    public String visitAa(MadBasicParser.AaContext ctx) {
        String res = visitChildren(ctx);
        if(ctx.getChildCount() > 0){
            Operand temp1 = quadrupleSemantic.operandStack.peek();
            Operand temp2 = quadrupleSemantic.operandStack.peek();
            String operand = ctx.getChild(1).getText();

            //cubo semantico

            //agregar cuadruplo
        }
        return res;
    }

    @Override
    public String visitFactor(MadBasicParser.FactorContext ctx) {
        String res = visitChildren(ctx);
        if(ctx.getChildCount() == 2){

            //checar si hay un - y  todo el pedo

            //revisar si el valor se agrega aqui o en otro lado todo


        } else { //ctx.getChildCount() == 3
            //agregar el valor de la lista? checar si es necesario todo
        }
        return res;
    }
}
