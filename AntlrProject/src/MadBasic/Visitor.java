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
    int temporalCount;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
        quadrupleSemantic = QuadrupleSemantic.getInstance();
        temporalCount = 0;
    }




    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        String t = ctx.getChild(0).getText();
        Type type = Type.FALSE;
        if (t.equals("int")) {
            type = Type.INT;
        } else if (t.equals("float")) {
            type = Type.FLOAT;
        } else if (t.equals("string")) {
            type = Type.STRING;
        } else if (t.equals("bool")) {
            type = Type.BOOL;
        } else if (t.startsWith("list")) {
            type = Type.LIST;
        } else if (t.equals("int")) { // todo checar si es una clase
            type = Type.OBJECT;
        } else {
            //todo error
        }
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
        if (ctx.getChildCount() > 0) {
            Operand operand1 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            Operand operand2 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            String operator = ctx.getChild(0).getText();
            Operator oper;
            if (operator == "&&") {
                oper = Operator.AND;
            } else {
                oper = Operator.OR;
            }
            //cubo semantico
            Type resT = SemanticCube.getCubeType(
                    oper.getValue(), operand1.getType().getTypeValue(), operand2.getType().getTypeValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.quadrupleList.add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.operandStack.pop();
                quadrupleSemantic.operandStack.push(temp);
            } else {
                //todo error
            }
        }
        return res;
    }
    /*
    @Override TODO FIX THIS: EMPTY STACK EXCEPTION
    public String visitY(MadBasicParser.YContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() > 0) {
            Operand operand1 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            Operand operand2 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            String operator = ctx.getChild(0).getText();
            Operator oper;
            if (operator == ">") {
                oper = Operator.GREATER;
            } else if (operator == "<") {
                oper = Operator.LESSER;
            } else if (operator == ">=") {
                oper = Operator.GREATEREQUAL;
            } else if (operator == "<=") {
                oper = Operator.LESSEREQUAL;
            } else if (operator == "==") {
                oper = Operator.EQUAL;
            } else {
                oper = Operator.NOTEQUAL;
            }
            //cubo semantico
            Type resT = SemanticCube.getCubeType(
                    oper.getValue(), operand1.getType().getTypeValue(), operand2.getType().getTypeValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.quadrupleList.add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.operandStack.pop();
                quadrupleSemantic.operandStack.push(temp);
            } else {
                //todo error
            }
        }
        return res;
    }
    */


    /* TODO FIX THIS: EMPTY STACK EXCEPTION
    @Override
    public String visitV(MadBasicParser.VContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() > 0) {
            Operand operand1 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            Operand operand2 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            String operator = ctx.getChild(0).getText();
            Operator oper;
            if (operator == "+") {
                oper = Operator.PLUS;
            } else {
                oper = Operator.MINUS;
            }
            //cubo semantico
            Type resT = SemanticCube.getCubeType(
                    oper.getValue(), operand1.getType().getTypeValue(), operand2.getType().getTypeValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.quadrupleList.add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.operandStack.pop();
                quadrupleSemantic.operandStack.push(temp);
            } else {
                //todo error
            }
        }
        return res;
    }
    */
    /* TODO FIX THIS
    @Override
    public String visitAa(MadBasicParser.AaContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() > 0) {
            Operand operand1 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            Operand operand2 = quadrupleSemantic.operandStack.peek();
            quadrupleSemantic.operandStack.pop();
            String operator = ctx.getChild(0).getText();
            Operator oper;
            if (operator == "*") {
                oper = Operator.MULTIPLICATION;
            } else {
                oper = Operator.DIVISION;
            }
            //cubo semantico
            Type resT = SemanticCube.getCubeType(
                    oper.getValue(), operand1.getType().getTypeValue(), operand2.getType().getTypeValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.quadrupleList.add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.operandStack.pop();
                quadrupleSemantic.operandStack.push(temp);
            } else {
                //todo error
            }
        }
        return res;
    }
    */

    /*
    @Override TODO FIX THIS: EMPTY STACK EXCEPTION
    public String visitFactor(MadBasicParser.FactorContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() == 2) {
            if (ctx.getChild(0).getText().equals("-")) {
                Operand oper = quadrupleSemantic.operandStack.peek();
                Type resT = SemanticCube.getCubeType(
                        Operator.MINUS.getValue(), oper.type.getTypeValue(), oper.type.getTypeValue());
                if (resT != Type.FALSE) {
                    Temporal temp = new Temporal(temporalCount++, resT);
                    quadrupleSemantic.quadrupleList.add(
                            new Expression(
                                    Operator.MINUS, new Constant<Integer>(0, Type.INT), oper, temp));
                    quadrupleSemantic.operandStack.pop();
                    quadrupleSemantic.operandStack.push(temp);
                } else {
                    //todo error
                }
            }
        } else { //ctx.getChildCount() == 3
            //agregar el valor de la lista? checar si es necesario todo
        }
        return res;
    }
    */

    @Override
    public String visitValueIdentifier(MadBasicParser.ValueIdentifierContext ctx) {
        String text =  ctx.getChild(0).getText();
        boolean found = false;

        Scope scope = basicSemantic.getScopeStack().peek();
        //System.out.println("Start: " + scope.toString());
        //System.out.println("THE NAME + " + scope.getName());
        while(scope != null && !found){
            for(Variable var : scope.getVariables()){
                //System.out.println("In scope: " + scope.getName() + " Var: " + var.getID());
                if(var.getID().equals(text)){
                    quadrupleSemantic.operandStack.push(var);
                    found = true;
                    break;
                }
            }
            if(!found){
                scope = scope.getParent();
            }
        }

        if(!found) {
            System.out.println("Error, Identifier: " + text + " not found!");
        }

        return super.visitValueIdentifier(ctx);
    }

    //    @Override
//    public String visitValue(MadBasicParser.ValueContext ctx) {
//        String res = visitChildren(ctx);
//        String text = ctx.getChild(0).getText();
//        System.out.println("Readed : " + text); // // TODO: 4/7/16 saber que fucking caso de la regla es o hacer unestra funcion que encuentre el tipe
//        switch (ctx.getRuleIndex()) {
//            case 0:
//                System.out.println("var: " + text);
//                Scope scope = basicSemantic.getScopeStack().peek();
//                boolean found = false;
//                for (Variable v : scope.getVariables()) {
//                    System.out.print(v.getID() + " ");
//                    if (v.getID() == text) {
//                        quadrupleSemantic.operandStack.push(v);
//                        found = true;
//                    }
//                }
//                System.out.println();
//                break;
//            case 1:
//                System.out.println("CTEI " + text);
//                quadrupleSemantic.operandStack.push(new Constant<Integer>(new Integer(text), Type.INT));
//                break;
//            case 2:
//                quadrupleSemantic.operandStack.push(new Constant<Float>(new Float(text), Type.FLOAT));
//                break;
//            case 3:
//                quadrupleSemantic.operandStack.push(new Constant<String>(text, Type.INT));
//                break;
//            case 4:
//                quadrupleSemantic.operandStack.push(new Constant<Boolean>(new Boolean(text), Type.INT));
//                break;
//            case 6:
//                quadrupleSemantic.operandStack.push(new Constant<Boolean>(new Boolean(text), Type.INT));
//                break;
//            case 7:
//                //todo manejamos el push aqui o en call?
//                break;
//        }
//        return res;
//    }

}
