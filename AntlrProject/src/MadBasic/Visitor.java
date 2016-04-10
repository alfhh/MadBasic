package MadBasic;

import MadBasic.Algrebra.*;
import MadBasic.Quadruples.Expression;
import MadBasic.Quadruples.QuadrupleSemantic;
import MadBasic.Quadruples.Write;
import MadBasic.Quadruples.*;
import MadBasic.Quadruples.Gotos.*;
import MadBasic.Semantic.*;
import ParserMadBasic.MadBasicBaseVisitor;
import ParserMadBasic.MadBasicParser;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Visitor extends MadBasicBaseVisitor<String> {

    BasicSemantic basicSemantic;
    QuadrupleSemantic quadrupleSemantic;
    int temporalCount;
    Stack<Type> typeStack;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
        quadrupleSemantic = QuadrupleSemantic.getInstance();
        temporalCount = 0;
        typeStack = new Stack<>();
    }



    /**
     * This function creates a quadruple (write) with the value of the top of the
     * operandStack
     */
    public String visitWrite(MadBasicParser.WriteContext ctx) {
        String res = visitChildren(ctx);

        // Get the top element of the stack
        Operand output = quadrupleSemantic.getOperandStack().pop();

        // Add to the quadruple
        quadrupleSemantic.getQuadrupleList().add(new Write(output));
        return res;
    }

    /**
     *
     */
    public String visitQWrite(MadBasicParser.QWriteContext ctx) {
        String res = visitChildren(ctx);
        Operand op1 = quadrupleSemantic.getOperandStack().pop();
        Operand op2 = quadrupleSemantic.getOperandStack().pop();


        //Check the semantic cube
        Type resT = SemanticCube.getCubeType(op1.getType().getTypeValue(), op2.getType().getTypeValue(),Operator.CARET.getValue());

        //agregar cuadruplo
        if (resT != Type.FALSE) {
            Temporal temp = new Temporal(temporalCount++, resT);
            quadrupleSemantic.getQuadrupleList().add(
                    new Expression(
                            Operator.CARET, op1, op2, temp));
            quadrupleSemantic.getOperandStack().push(temp);
            quadrupleSemantic.getOperandSList().add(temp);
        } else {
            System.out.println("Errro: Printing in rule qWrite with " + op1 + " and " + op2);
        }

        return res;
    }

    @Override
    public String visitTypeInt(MadBasicParser.TypeIntContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(Type.INT);
//        System.out.println("Type.INT");
        return res;
    }

    @Override
    public String visitTypeFloat(MadBasicParser.TypeFloatContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(Type.FLOAT);
//        System.out.println("Type.FLOAT");
        return res;
    }

    @Override
    public String visitTypeString(MadBasicParser.TypeStringContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(Type.STRING);
//        System.out.println("Type.STRING");
        return res;
    }

    @Override
    public String visitTypeBool(MadBasicParser.TypeBoolContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(Type.BOOL);
//        System.out.println("Type.BOOL");
        return res;
    }

    @Override
    public String visitTypeList(MadBasicParser.TypeListContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(Type.LIST);
//        System.out.println("Type.LIST");
        return res;
    }

    @Override
    public String visitTypeObject(MadBasicParser.TypeObjectContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(Type.OBJECT);
//        System.out.println("Type.OBJECT");
        return res;
    }

    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        String result = "";

        ParseTree c = ctx.getChild(0);
        String childResult = c.accept(this);
        result = this.aggregateResult(result, childResult);

//        System.out.println(typeStack + ctx.getChild(1).getText() + ctx.getChild(2).getText());
        Type type = typeStack.pop();
        while (!typeStack.empty()){
            type.setType(typeStack.pop());
        }
//        System.out.println(type);

        int n = ctx.getChildCount();

        for (int i = 1; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            c = ctx.getChild(i);
            childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
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
        return result;
    }


    // Functions
    @Override
    public String visitFunction(MadBasicParser.FunctionContext ctx) {
        String result = "";
        ParseTree c = ctx.getChild(0);
        String childResult = c.accept(this);
        result = this.aggregateResult(result, childResult);

//        System.out.println(typeStack + ctx.getChild(1).getText());
        Type type = typeStack.pop();
        while (!typeStack.empty()){
            type.setType(typeStack.pop());
        }
//        System.out.println(type);

        int n = ctx.getChildCount();

        for (int i = 1; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            c = ctx.getChild(i);
            childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }
        String id = ctx.getChild(1).getText();
        Scope scp = new Scope(id, basicSemantic.getScopeStack().peek());
        Procedure proc = new Procedure(id, type, scp);
        basicSemantic.getProcedures().add(proc);
        basicSemantic.getScopes().add(proc.getScope());
        basicSemantic.getScopeStack().push(proc.getScope());
//        String res = visitChildren(ctx);
        basicSemantic.getScopeStack().pop();
        return result;
    }

    @Override
    public String visitParams(MadBasicParser.ParamsContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();

        for (int i = 0; i < 3 && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

//        System.out.println(typeStack + ctx.getChild(2).getText());
        Type type = typeStack.pop();
        while (!typeStack.empty()){
            type.setType(typeStack.pop());
        }
//        System.out.println(type);

        Variable variable= new Variable(ctx.getChild(2).getText(), type, null);

        for (int i = 3; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    @Override
    public String visitN(MadBasicParser.NContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();
        if (n > 0) {
            for (int i = 0; i < 4 && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
                ParseTree c = ctx.getChild(i);
                String childResult = c.accept(this);
                result = this.aggregateResult(result, childResult);
            }

//            System.out.println(typeStack + ctx.getChild(3).getText());
            Type type = typeStack.pop();
            while (!typeStack.empty()) {
                type.setType(typeStack.pop());
            }
//            System.out.println(type);

            Variable variable = new Variable(ctx.getChild(2).getText(), type, null);

            for (int i = 4; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
                ParseTree c = ctx.getChild(i);
                String childResult = c.accept(this);
                result = this.aggregateResult(result, childResult);
            }
        }

        return result;
    }

    // Procedure
    @Override
    public String visitProcedure(MadBasicParser.ProcedureContext ctx) {
//        System.out.println("proc");
        String id = ctx.getChild(1).getText();
        Scope scp = new Scope(id, basicSemantic.getScopeStack().peek());
        Procedure proc = new Procedure(id, null, scp);
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

    @Override
    public String visitUAnd(MadBasicParser.UAndContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.AND);
        return super.visitUAnd(ctx);
    }

    @Override
    public String visitUOr(MadBasicParser.UOrContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.OR);
        return super.visitUOr(ctx);
    }

    //EXPRESSION

    @Override
    public String visitT(MadBasicParser.TContext ctx) {
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
//                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
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
        quadrupleSemantic.getOperatorStack().push(Operator.EQUALEQUAL);
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
//                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
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
//                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
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
//                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
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
                quadrupleSemantic.getOperandSList().add(temp);
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
                    quadrupleSemantic.getOperandSList().add(var);
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
        quadrupleSemantic.getOperandSList().add(new Constant<Integer>(new Integer(text), Type.INT));
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
        quadrupleSemantic.getOperandSList().add(new Constant<Float>(new Float(text), Type.FLOAT));
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
        quadrupleSemantic.getOperandStack().push(new Constant<String>(new String(text), Type.STRING));
        quadrupleSemantic.getOperandSList().add(new Constant<String>(new String(text), Type.STRING));
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
        quadrupleSemantic.getOperandSList().add(new Constant<Boolean>(new Boolean(text), Type.BOOL));
        //System.out.println("Boolean added to getOperandStack(): " + text);
        return super.visitValueBool(ctx);
    }

    //Read

    @Override
    public String visitRead(MadBasicParser.ReadContext ctx) {
        Type type = quadrupleSemantic.getOperandStack().peek().getType();
        Temporal temp = new Temporal(temporalCount++, type);
        quadrupleSemantic.getQuadrupleList().add(new Read(temp));
        quadrupleSemantic.getOperandStack().push(temp);
        return super.visitRead(ctx);
    }


    //Assignment

    /**
     * @param ctx
     * @return
     */
    @Override
    public String visitAssignment(MadBasicParser.AssignmentContext ctx) {
        String res = null;
        String text = ctx.getChild(0).getText();
        boolean found = false;
        Scope scope = basicSemantic.getScopeStack().peek();
        while (scope != null && !found) {
            for (Variable var : scope.getVariables()) {
                if (var.getID().equals(text)) {
                    quadrupleSemantic.getOperandStack().push(var);
                    res = visitChildren(ctx);
                    Operand oper = quadrupleSemantic.getOperandStack().peek();
                    quadrupleSemantic.getOperandStack().pop();
                    quadrupleSemantic.getOperandStack().pop();
                    quadrupleSemantic.getQuadrupleList().add(new Assignment(oper, var));
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
        return res;
    }

    //IF Statement

    @Override
    public String visitCondition(MadBasicParser.ConditionContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();

        for (int i = 0; i < 4 && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Operand condition = quadrupleSemantic.getOperandStack().peek();
        quadrupleSemantic.getOperandStack().pop();
        if (condition.getType() == Type.BOOL) {
            GotoFalse gotoFalse = new GotoFalse(condition);
            quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());
            quadrupleSemantic.getQuadrupleList().add(gotoFalse);
        } else {
            System.out.println("Error, Identifier: " + ctx.getChild(2).getText() + " not bool!");
        }

        for (int i = 4; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Integer fin = quadrupleSemantic.getJumpStack().peek();
        quadrupleSemantic.getJumpStack().pop();
        ((Goto) quadrupleSemantic.getQuadrupleList().get(fin)).setJump(quadrupleSemantic.getQuadrupleList().size());

        return result;
    }

    //ELSE Statement

    @Override
    public String visitPElse(MadBasicParser.PElseContext ctx) {
        Goto go = new Goto();
        Integer falso = quadrupleSemantic.getJumpStack().peek();
        quadrupleSemantic.getJumpStack().pop();
        quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());
        quadrupleSemantic.getQuadrupleList().add(go);
        ((Goto) quadrupleSemantic.getQuadrupleList().get(falso)).setJump(quadrupleSemantic.getQuadrupleList().size());
        return super.visitPElse(ctx);
    }

    //LOOP Statement

    @Override
    public String visitLoop(MadBasicParser.LoopContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();

        quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());

        for (int i = 0; i < 4 && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Operand condition = quadrupleSemantic.getOperandStack().peek();
        quadrupleSemantic.getOperandStack().pop();
        if (condition.getType() == Type.BOOL) {
            GotoFalse gotoFalse = new GotoFalse(condition);
            quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());
            quadrupleSemantic.getQuadrupleList().add(gotoFalse);
        } else {
            System.out.println("Error, Identifier: " + ctx.getChild(2).getText() + " not bool!");
        }

        for (int i = 4; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
//            System.out.println(ctx.getChild(i).getText() + " " + i);
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Integer fin = quadrupleSemantic.getJumpStack().peek();
        quadrupleSemantic.getJumpStack().pop();
        Integer retorno = quadrupleSemantic.getJumpStack().peek();
        quadrupleSemantic.getJumpStack().pop();
        quadrupleSemantic.getQuadrupleList().add(new Goto(retorno));
        ((Goto) quadrupleSemantic.getQuadrupleList().get(fin)).setJump(quadrupleSemantic.getQuadrupleList().size());

        return result;
    }
}
