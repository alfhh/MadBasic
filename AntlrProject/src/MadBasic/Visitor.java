package MadBasic;

import MadBasic.Algrebra.*;
import MadBasic.Quadruples.Expression;
import MadBasic.Quadruples.QuadrupleSemantic;
import MadBasic.Semantic.*;
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
            Operand operand1 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operand operand2 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
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
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
            } else {
                System.out.println("visitT" + resT.getTypeValue());
                System.out.println(operand1.toString() + oper.getOperator() + operand2);
            }
        }
        return res;
    }

    @Override
    public String visitZGreater(MadBasicParser.ZGreaterContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.GREATER);
        return super.visitZGreater(ctx);
    }

    @Override
    public String visitZLesser(MadBasicParser.ZLesserContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.LESSER);
        return super.visitZLesser(ctx);
    }

    @Override
    public String visitZEqualEqual(MadBasicParser.ZEqualEqualContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.EQUAL);
        return super.visitZEqualEqual(ctx);
    }

    @Override
    public String visitZDifferent(MadBasicParser.ZDifferentContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.NOTEQUAL);
        return super.visitZDifferent(ctx);
    }

    @Override
    public String visitZzEqual(MadBasicParser.ZzEqualContext ctx) {
        if (quadrupleSemantic.getOperatorStack().peek() == Operator.GREATER) {
            quadrupleSemantic.getOperatorStack().pop();
            quadrupleSemantic.getOperatorStack().push(Operator.GREATEREQUAL);
        } else {
            quadrupleSemantic.getOperatorStack().pop();
            quadrupleSemantic.getOperatorStack().push(Operator.LESSEREQUAL);
        }
        return super.visitZzEqual(ctx);
    }

    ///* TODO FIX THIS: EMPTY STACK EXCEPTION
    @Override
    public String visitY(MadBasicParser.YContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() > 0) {
            Operand operand1 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operand operand2 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operator oper = quadrupleSemantic.getOperatorStack().peek();
            quadrupleSemantic.getOperatorStack().pop();
            //cubo semantico
            Type resT = SemanticCube.getCubeType(
                    operand1.getType().getTypeValue(), operand2.getType().getTypeValue(), oper.getValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
            } else {
                System.out.println("visitY" + resT.getTypeValue());
                String operator = ctx.getChild(0).getText();
                System.out.println(operand1.toString() + operator + " " + oper.getOperator() + operand2);
            }
        }
        return res;
    }
    //*/


    @Override
    public String visitWPlus(MadBasicParser.WPlusContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.PLUS);
        return super.visitWPlus(ctx);
    }

    @Override
    public String visitWMinus(MadBasicParser.WMinusContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.MINUS);
        return super.visitWMinus(ctx);
    }

    ///* TODO FIX THIS: EMPTY STACK EXCEPTION
    @Override
    public String visitV(MadBasicParser.VContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() > 0) {
//            System.out.println(ctx.getChild(0).getText() + ctx.getChild(1).getText());
            Operand operand1 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operand operand2 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operator oper = quadrupleSemantic.getOperatorStack().peek();
            quadrupleSemantic.getOperatorStack().pop();
            //cubo semantico
            Type resT = SemanticCube.getCubeType(
                    operand1.getType().getTypeValue(), operand2.getType().getTypeValue(), oper.getValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
            } else {
                System.out.println("visitV" + resT.getTypeValue());
//                System.out.println(operand1.toString() + oper.getOperator() + operand2);
                String operator = ctx.getChild(0).getText();
                System.out.println(operand1.toString() + operator + " " + oper.getOperator() + operand2);

            }

        }
        return res;
    }
    //*/

    @Override
    public String visitAbDivision(MadBasicParser.AbDivisionContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.DIVISION);
        return super.visitAbDivision(ctx);
    }

    @Override
    public String visitAbMultiplication(MadBasicParser.AbMultiplicationContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.MULTIPLICATION);
        return super.visitAbMultiplication(ctx);
    }

    ///* TODO FIX THIS
    @Override
    public String visitAa(MadBasicParser.AaContext ctx) {
        String res = visitChildren(ctx);
        if (ctx.getChildCount() > 0) {
            Operand operand1 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operand operand2 = quadrupleSemantic.getOperandStack().peek();
            quadrupleSemantic.getOperandStack().pop();
            Operator oper = quadrupleSemantic.getOperatorStack().peek();
            quadrupleSemantic.getOperatorStack().pop();
            //cubo semantico
//            System.out.println(operand1.getType().getTypeValue() + " " + operand2.getType().getTypeValue() + " " + oper.getValue());
            Type resT = SemanticCube.getCubeType(
                    operand1.getType().getTypeValue(), operand2.getType().getTypeValue(), oper.getValue());

            //agregar cuadruplo
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
            } else {
                System.out.println("visitAa " + resT.getTypeValue());
//                System.out.println(operand1.toString() + oper.getOperator() + operand2);
                String operator = ctx.getChild(0).getText();
                System.out.println(operand1.toString() + operator + " " + oper.getOperator() + operand2);

            }
        }
        return res;
    }
    // */

    @Override
    public String visitAcMinus(MadBasicParser.AcMinusContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.MINUSSOLO);
        return super.visitAcMinus(ctx);
    }

    ///* TODO FIX THIS: EMPTY STACK EXCEPTION

    @Override
    public String visitFactorValue(MadBasicParser.FactorValueContext ctx) {
        String res = visitChildren(ctx);
        if (!quadrupleSemantic.getOperatorStack().empty() &&
                quadrupleSemantic.getOperatorStack().peek() == Operator.MINUSSOLO) {
            quadrupleSemantic.getOperatorStack().pop();
            Operand oper = quadrupleSemantic.getOperandStack().peek();
            Type resT = SemanticCube.getCubeType(
                    oper.getType().getTypeValue(), oper.getType().getTypeValue(), Operator.MINUS.getValue());
            if (resT != Type.FALSE) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                Operator.MINUS, new Constant<Integer>(0, Type.INT), oper, temp));
                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
            } else {
                System.out.println("visitFactorValue " + resT.getTypeValue());
//                System.out.println(operand1.toString() + oper.getOperator() + operand2);
                String operator = ctx.getChild(0).getText();
                System.out.println(oper.toString() + operator + " " + Operator.MINUSSOLO.getOperator()
                        + oper.toString());
            }
        }
        return res;
    }

    //*/

    /**
     * This function adds the founded variables to the getOperandStack(), if they were not
     * found in any scope and error will be displayed at console.
     * This functions searches the variable in a bottom-top search
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitValueIdentifier(MadBasicParser.ValueIdentifierContext ctx) {
        String text = ctx.getChild(0).getText();
        boolean found = false;

        Scope scope = basicSemantic.getScopeStack().peek();
        while (scope != null && !found) {
            for (Variable var : scope.getVariables()) {
                if (var.getID().equals(text)) {
                    //System.out.println("Variable added to the getOperandStack(): " + text);
                    quadrupleSemantic.getOperandStack().push(var);
                    found = true;
                    break;
                }
            }
            if (!found) {
                scope = scope.getParent();
            }
        }

        if (!found) {
            System.out.println("Error, Identifier: " + text + " not found!");
        }

        return super.visitValueIdentifier(ctx);
    }

    /**
     * Function that adds a constant integer value to the getOperandStack()
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitValueInt(MadBasicParser.ValueIntContext ctx) {
        String text = ctx.getChild(0).getText();
        quadrupleSemantic.getOperandStack().push(new Constant<Integer>(new Integer(text), Type.INT));
        //System.out.println("Integer added to getOperandStack(): " + text);
        return super.visitValueInt(ctx);
    }

    /**
     * Function that adds a constant float value to the getOperandStack()
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitValueFloat(MadBasicParser.ValueFloatContext ctx) {
        String text = ctx.getChild(0).getText();
        quadrupleSemantic.getOperandStack().push(new Constant<Float>(new Float(text), Type.FLOAT));
        //System.out.println("Float added to getOperandStack(): " + text);
        return super.visitValueFloat(ctx);
    }

    /**
     * Function that adds a string to the getOperandStack()
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitValueString(MadBasicParser.ValueStringContext ctx) {
        String text = ctx.getChild(0).getText();
//        quadrupleSemantic.getOperandStack().push(new Constant<String>(new String(text), Type.STRING));
        //System.out.println("String added to getOperandStack(): " + text); todo aun no tenemos nada de strings y crea ruido
        return super.visitValueString(ctx);
    }

    /**
     * Function that adds a boolean value to the getOperandStack()
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitValueBool(MadBasicParser.ValueBoolContext ctx) {
        String text = ctx.getChild(0).getText();
        quadrupleSemantic.getOperandStack().push(new Constant<Boolean>(new Boolean(text), Type.BOOL));
        //System.out.println("Boolean added to getOperandStack(): " + text);
        return super.visitValueBool(ctx);
    }

}
