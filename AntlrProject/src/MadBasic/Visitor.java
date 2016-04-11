package MadBasic;

import MadBasic.Algrebra.*;
import MadBasic.Quadruples.*;
import MadBasic.Quadruples.Gotos.Gosub;
import MadBasic.Quadruples.Gotos.Goto;
import MadBasic.Quadruples.Gotos.GotoFalse;
import MadBasic.Semantic.BasicSemantic;
import MadBasic.Semantic.Methods.Function;
import MadBasic.Semantic.Methods.Procedure;
import MadBasic.Semantic.Scope;
import MadBasic.Semantic.SemanticCube;
import MadBasic.Semantic.Types.*;
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
    LinkedList<Variable> paramList;
    Stack<Operand> argsStack;

    public Visitor() {
        basicSemantic = BasicSemantic.getInstance();
        quadrupleSemantic = QuadrupleSemantic.getInstance();
        temporalCount = 0;
        typeStack = new Stack<>();
    }


    //------------------------------------------------------------------------------------------BEGIN BASIC SEMANTIC
    /**/
    //------------------------------------------------------------BEGIN TYPES

    /**
     * @param ctx
     * @return
     */
    @Override
    public String visitTypeInt(MadBasicParser.TypeIntContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(new TypeInt());
        return res;
    }

    /**
     * @param ctx
     * @return
     */
    @Override
    public String visitTypeFloat(MadBasicParser.TypeFloatContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(new TypeFloat());
        return res;
    }

    /**
     * @param ctx
     * @return
     */
    @Override
    public String visitTypeString(MadBasicParser.TypeStringContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(new TypeString());
        return res;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitTypeBool(MadBasicParser.TypeBoolContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(new TypeBool());
        return res;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitTypeList(MadBasicParser.TypeListContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(new TypeList());
        return res;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitTypeObject(MadBasicParser.TypeObjectContext ctx) {
        String res = visitChildren(ctx);
        typeStack.push(new TypeObject());
        return res;
    }

    //------------------------------------------------------------END TYPES
    /**/
    //------------------------------------------------------------BEGIN VARIABLES

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitE(MadBasicParser.EContext ctx) {
        String result = "";

        ParseTree c = ctx.getChild(0);
        String childResult = c.accept(this);
        result = this.aggregateResult(result, childResult);

        Type type = typeStack.pop();
        while (!typeStack.empty()) {
            ((TypeList)type).setType(typeStack.pop());
        }

        int n = ctx.getChildCount();
        for (int i = 1; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
            c = ctx.getChild(i);
            childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        LinkedList<String> ids = new LinkedList<>();
        ids.add(ctx.getChild(1).getText());
        ids.addAll(Arrays.asList(ctx.getChild(2).getText().trim().split(",")));
        for (String id : ids) {
            if (id.trim().length() > 0) {
                // TODO: 4/10/16 modificar para hashtable
                Variable var = new Variable(id, type, basicSemantic.getScopeStack().peek());
                basicSemantic.getVariables().add(var);
                basicSemantic.getScopeStack().peek().getVariables().add(var);
            }
        }
        return result;
    }

    //------------------------------------------------------------END VARIABLES
    /**/
    //------------------------------------------------------------BEGIN METHODS

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitParams(MadBasicParser.ParamsContext ctx) {
        String result = this.defaultResult();

        int n = ctx.getChildCount();
        for (int i = 0; i < 3 && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Type type = typeStack.pop();
        while (!typeStack.empty()) {
            ((TypeList)type).setType(typeStack.pop());
        }

        paramList = new LinkedList<>();
        Variable variable = new Variable(ctx.getChild(2).getText(), type, basicSemantic.getScopeStack().peek());
        paramList.add(variable);


        for (int i = 3; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        return result;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitN(MadBasicParser.NContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();
        if (n > 0) {
            for (int i = 0; i < 4 && this.shouldVisitNextChild(ctx, null); ++i) {
                ParseTree c = ctx.getChild(i);
                String childResult = c.accept(this);
                result = this.aggregateResult(result, childResult);
            }

            Type type = typeStack.pop();
            while (!typeStack.empty()) {
                ((TypeList)type).setType(typeStack.pop());
            }

            Variable variable = new Variable(ctx.getChild(3).getText(), type, basicSemantic.getScopeStack().peek());
            paramList.add(variable);

            for (int i = 4; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
                ParseTree c = ctx.getChild(i);
                String childResult = c.accept(this);
                result = this.aggregateResult(result, childResult);
            }
        }
        return result;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitFunction(MadBasicParser.FunctionContext ctx) {
        String result = "";
        ParseTree c = ctx.getChild(0);
        String childResult = c.accept(this);
        result = this.aggregateResult(result, childResult);

        Type type = typeStack.pop();
        while (!typeStack.empty()) {
            ((TypeList)type).setType(typeStack.pop());
        }

        // TODO: 4/10/16 modificar para hashtable
        String id = ctx.getChild(1).getText();
        Function func = new Function(id, type, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(func.getScope());
        basicSemantic.getScopeStack().push(func.getScope());

        int cParentesisIndex = 5;
        for (int i = 1; i < cParentesisIndex && this.shouldVisitNextChild(ctx, null); ++i) {
            c = ctx.getChild(i);
            childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        func.setParams(paramList);
        func.getScope().getVariables().addAll(paramList);
        func.setQuadrupleStart(quadrupleSemantic.getQuadrupleList().size());
        basicSemantic.getProcedures().add(func);


        int n = ctx.getChildCount();
        for (int i = cParentesisIndex; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
            c = ctx.getChild(i);
            childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        quadrupleSemantic.getQuadrupleList().add(new Retorno());
        basicSemantic.getScopeStack().pop();

        return result;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitProcedure(MadBasicParser.ProcedureContext ctx) {
        String result = "";

        // TODO: 4/10/16 modificar para hashtable
        String id = ctx.getChild(1).getText();
        Procedure proc = new Procedure(id, basicSemantic.getScopeStack().peek());
        basicSemantic.getScopes().add(proc.getScope());
        basicSemantic.getScopeStack().push(proc.getScope());

        int cParentesisIndex = 5;
        for (int i = 0; i < cParentesisIndex && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        proc.setParams(paramList);
        proc.getScope().getVariables().addAll(paramList);
        proc.setQuadrupleStart(quadrupleSemantic.getQuadrupleList().size());
        basicSemantic.getProcedures().add(proc);

        int n = ctx.getChildCount();
        for (int i = cParentesisIndex; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        quadrupleSemantic.getQuadrupleList().add(new Retorno());
        basicSemantic.getScopeStack().pop();

        return result;
    }

    //------------------------------------------------------------END METHODS
    /**/
    //------------------------------------------------------------BEGIN CLASS AND MAIN

    /**
     *
     * @param ctx
     * @return
     */
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

    /**
     *
     * @param ctx
     * @return
     */
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

    //------------------------------------------------------------END CLASS AND MAIN
    /**/
    //------------------------------------------------------------------------------------------END BASIC SEMANTIC


    //------------------------------------------------------------------------------------------BEGIN QUADRUPLES
    /**/
    //------------------------------------------------------------BEGIN ASSIGNMENT, READ AND WRITE

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

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitRead(MadBasicParser.ReadContext ctx) {
        Type type = quadrupleSemantic.getOperandStack().peek().getType();
        Temporal temp = new Temporal(temporalCount++, type);
        quadrupleSemantic.getQuadrupleList().add(new Read(temp));
        quadrupleSemantic.getOperandStack().push(temp);
        return super.visitRead(ctx);
    }

    /**
     * This function creates a quadruple (write) with the value of the top of the
     * operandStack
     * @param ctx
     * @return
     */
    @Override
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
     * @param ctx
     * @return
     */
    @Override
    public String visitQWrite(MadBasicParser.QWriteContext ctx) {
        String res = visitChildren(ctx);
        Operand op1 = quadrupleSemantic.getOperandStack().pop();
        Operand op2 = quadrupleSemantic.getOperandStack().pop();


        //Check the semantic cube
        Type resT = SemanticCube.getCubeType(op1.getType().getTypeValue(), op2.getType().getTypeValue(), Operator.CARET.getValue());

        //agregar cuadruplo
        if (!(resT instanceof TypeFalse)) {
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

    //------------------------------------------------------------END ASSIGNMENT, READ AND WRITE
    /**/
    //------------------------------------------------------------BEGIN EXPRESSION
    /**/
    //------------------------------BEGIN LOGIC OPERATORS

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitUAnd(MadBasicParser.UAndContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.AND);
        return super.visitUAnd(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitUOr(MadBasicParser.UOrContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.OR);
        return super.visitUOr(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
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
            if (!(resT instanceof TypeFalse)) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
            } else {
                System.out.println("visitT" + resT.getTypeValue());
                System.out.println(operand1.toString() + oper.getOperator() + operand2);
            }
        }
        return res;
    }

    //------------------------------END LOGIC OPERATORS
    /**/
    //------------------------------BEGIN COMPARISON OPERATORS

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitZGreater(MadBasicParser.ZGreaterContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.GREATER);
        return super.visitZGreater(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitZLesser(MadBasicParser.ZLesserContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.LESSER);
        return super.visitZLesser(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitZEqualEqual(MadBasicParser.ZEqualEqualContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.EQUALEQUAL);
        return super.visitZEqualEqual(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitZDifferent(MadBasicParser.ZDifferentContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.NOTEQUAL);
        return super.visitZDifferent(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
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

    /**
     *
     * @param ctx
     * @return
     */
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
            if (!(resT instanceof TypeFalse)) {
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

    //------------------------------END COMPARISON OPERATORS
    /**/
    //------------------------------BEGIN SIMPLE OPERATORS

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitWPlus(MadBasicParser.WPlusContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.PLUS);
        return super.visitWPlus(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitWMinus(MadBasicParser.WMinusContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.MINUS);
        return super.visitWMinus(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitV(MadBasicParser.VContext ctx) {
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
            if (!(resT instanceof TypeFalse)) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
            } else {
                System.out.println("visitV" + resT.getTypeValue());
                String operator = ctx.getChild(0).getText();
                System.out.println(operand1.toString() + operator + " " + oper.getOperator() + operand2);

            }

        }
        return res;
    }

    //------------------------------END SIMPLE OPERATORS
    /**/
    //------------------------------BEGIN COMPLEX OPERATORS

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitAbDivision(MadBasicParser.AbDivisionContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.DIVISION);
        return super.visitAbDivision(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitAbMultiplication(MadBasicParser.AbMultiplicationContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.MULTIPLICATION);
        return super.visitAbMultiplication(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
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
            Type resT = SemanticCube.getCubeType(
                    operand1.getType().getTypeValue(), operand2.getType().getTypeValue(), oper.getValue());

            //agregar cuadruplo
            if (!(resT instanceof TypeFalse)) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                oper, operand1, operand2, temp));
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
            } else {
                System.out.println("visitAa " + resT.getTypeValue());
                String operator = ctx.getChild(0).getText();
                System.out.println(operand1.toString() + operator + " " + oper.getOperator() + operand2);

            }
        }
        return res;
    }

    //------------------------------BEGIN COMPLEX OPERATORS
    /**/
    //------------------------------BEGIN UNARY OPERATORS

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitAcMinus(MadBasicParser.AcMinusContext ctx) {
        quadrupleSemantic.getOperatorStack().push(Operator.MINUSSOLO);
        return super.visitAcMinus(ctx);
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitFactorValue(MadBasicParser.FactorValueContext ctx) {
        String res = visitChildren(ctx);
        if (!quadrupleSemantic.getOperatorStack().empty() &&
                quadrupleSemantic.getOperatorStack().peek() == Operator.MINUSSOLO) {
            quadrupleSemantic.getOperatorStack().pop();
            Operand oper = quadrupleSemantic.getOperandStack().peek();
            Type resT = SemanticCube.getCubeType(
                    oper.getType().getTypeValue(), oper.getType().getTypeValue(), Operator.MINUS.getValue());
            if (!(resT instanceof TypeFalse)) {
                Temporal temp = new Temporal(temporalCount++, resT);
                quadrupleSemantic.getQuadrupleList().add(
                        new Expression(
                                Operator.MINUS, new Constant<Integer>(0, new TypeInt()), oper, temp));
                quadrupleSemantic.getOperandStack().pop();
                quadrupleSemantic.getOperandStack().push(temp);
                quadrupleSemantic.getOperandSList().add(temp);
            } else {
                System.out.println("visitFactorValue " + resT.getTypeValue());
                String operator = ctx.getChild(0).getText();
                System.out.println(oper.toString() + operator + " " + Operator.MINUSSOLO.getOperator()
                        + oper.toString());
            }
        }
        return res;
    }

    //------------------------------END UNARY OPERATORS
    /**/
    //------------------------------BEGIN VALUE

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
        quadrupleSemantic.getOperandStack().push(new Constant<Integer>(new Integer(text), new TypeInt()));
        quadrupleSemantic.getOperandSList().add(new Constant<Integer>(new Integer(text), new TypeInt()));
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
        quadrupleSemantic.getOperandStack().push(new Constant<Float>(new Float(text), new TypeFloat()));
        quadrupleSemantic.getOperandSList().add(new Constant<Float>(new Float(text), new TypeFloat()));
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
        quadrupleSemantic.getOperandStack().push(new Constant<String>(new String(text), new TypeString()));
        quadrupleSemantic.getOperandSList().add(new Constant<String>(new String(text), new TypeString()));
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
        quadrupleSemantic.getOperandStack().push(new Constant<Boolean>(new Boolean(text), new TypeBool()));
        quadrupleSemantic.getOperandSList().add(new Constant<Boolean>(new Boolean(text), new TypeBool()));
        return super.visitValueBool(ctx);
    }

    //------------------------------END VALUE
    /**/
    //------------------------------BEGIN CALL


    @Override
    public String visitArgs(MadBasicParser.ArgsContext ctx) {
        String result = visitChildren(ctx);
        argsStack.push(quadrupleSemantic.getOperandStack().pop());
        return result;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitXArgs(MadBasicParser.XArgsContext ctx) {
        String result = visitChildren(ctx);
        argsStack.push(quadrupleSemantic.getOperandStack().pop());
        return result;
    }

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitCall(MadBasicParser.CallContext ctx) {
        String result = "";
        argsStack = new Stack<>();
        // TODO: 4/10/16 modificar si hashtable y para funciones dentro de clases
        Procedure method = null;
        String methodName = ctx.getChild(0).getText();
        for (int i = 0; i < basicSemantic.getProcedures().size(); i++){
            if(methodName.equals(basicSemantic.getProcedures().get(i).getID())){
                method = basicSemantic.getProcedures().get(i);
                break;
            }
        }

        if (method != null) {

            // TODO: 4/11/16 ERA

            result = visitChildren(ctx);
            if(argsStack.size() == method.getParams().size()) {
                for (int i = 0; i < method.getParams().size(); i++) {
                    Variable var = method.getParams().get(i);
                    Operand oper = argsStack.pop();
                    if (oper.getType().equals(var.getType())) {
                        quadrupleSemantic.getQuadrupleList().add(new Parameter(oper, i));
                    } else {
                        // TODO: 4/11/16 error
                        System.out.println("Error on call " + ctx.getChild(0).getText());
                    }
                }

                int jumpback = quadrupleSemantic.getQuadrupleList().size();
                quadrupleSemantic.getQuadrupleList().add(new Gosub(jumpback, method));
            }
            else {
                // TODO: 4/10/16 error
                System.out.println("Error on call " + ctx.getChild(0).getText() + " paramsize");
            }
        }else {
            // TODO: 4/10/16 error
            System.out.println("Error on call \"" + ctx.getChild(0).getText() + "\" non existent");
        }

        return result;
    }

    //------------------------------END CALL
    /**/
    //------------------------------------------------------------END EXPRESSION
    /**/
    //------------------------------------------------------------BEGIN CONDITION

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitCondition(MadBasicParser.ConditionContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();

        for (int i = 0; i < 4 && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Operand condition = quadrupleSemantic.getOperandStack().peek();
        quadrupleSemantic.getOperandStack().pop();
        if (condition.getType() instanceof TypeBool) {
            GotoFalse gotoFalse = new GotoFalse(condition);
            quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());
            quadrupleSemantic.getQuadrupleList().add(gotoFalse);
        } else {
            System.out.println("Error, Identifier: " + ctx.getChild(2).getText() + " not bool!");
        }

        for (int i = 4; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Integer fin = quadrupleSemantic.getJumpStack().peek();
        quadrupleSemantic.getJumpStack().pop();
        ((Goto) quadrupleSemantic.getQuadrupleList().get(fin)).setJump(quadrupleSemantic.getQuadrupleList().size());

        return result;
    }

    /**
     *
     * @param ctx
     * @return
     */
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

    //------------------------------------------------------------END CONDITION
    /**/
    //------------------------------------------------------------BEGIN LOOP

    /**
     *
     * @param ctx
     * @return
     */
    @Override
    public String visitLoop(MadBasicParser.LoopContext ctx) {
        String result = this.defaultResult();
        int n = ctx.getChildCount();

        quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());

        for (int i = 0; i < 4 && this.shouldVisitNextChild(ctx, null); ++i) {
            ParseTree c = ctx.getChild(i);
            String childResult = c.accept(this);
            result = this.aggregateResult(result, childResult);
        }

        Operand condition = quadrupleSemantic.getOperandStack().peek();
        quadrupleSemantic.getOperandStack().pop();
        if (condition.getType() instanceof TypeBool) {
            GotoFalse gotoFalse = new GotoFalse(condition);
            quadrupleSemantic.getJumpStack().add(quadrupleSemantic.getQuadrupleList().size());
            quadrupleSemantic.getQuadrupleList().add(gotoFalse);
        } else {
            System.out.println("Error, Identifier: " + ctx.getChild(2).getText() + " not bool!");
        }

        for (int i = 4; i < n && this.shouldVisitNextChild(ctx, null); ++i) {
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

    //------------------------------------------------------------END LOOP
    /**/
    //------------------------------------------------------------------------------------------END QUADRUPLES

}
