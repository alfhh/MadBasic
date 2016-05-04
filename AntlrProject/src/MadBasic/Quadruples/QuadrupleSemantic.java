package MadBasic.Quadruples;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by lsanchez on 4/6/16.
 */
public class QuadrupleSemantic {
    Stack<Operator> operatorStack;
    LinkedList<Operator> operatorList;
    Stack<Operand> operandStack;
    LinkedList<Operand> operandSList;
    LinkedList<Quadruple> quadrupleList;
    Stack<Integer> jumpStack;
    int temporalCount;
    Stack<Operand> argsStack;

    static private QuadrupleSemantic instance;

    private QuadrupleSemantic() {
        operandStack = new Stack<>();
        operatorStack = new Stack<>();
        quadrupleList = new LinkedList<>();
        operatorList = new LinkedList<>();
        operandSList = new LinkedList<>();
        jumpStack = new Stack<>();
        temporalCount = 0;
    }

    static public QuadrupleSemantic getInstance() {
        if (instance == null) {
            instance = new QuadrupleSemantic();
        }
        return instance;
    }

    public static void resetInstance() {
        instance = new QuadrupleSemantic();
    }

    public Stack<Operator> getOperatorStack() {
        return operatorStack;
    }

    public void setOperatorStack(Stack<Operator> operatorStack) {
        this.operatorStack = operatorStack;
    }

    public Stack<Operand> getOperandStack() {
        return operandStack;
    }

    public void setOperandStack(Stack<Operand> operandStack) {
        this.operandStack = operandStack;
    }

    public LinkedList<Quadruple> getQuadrupleList() {
        return quadrupleList;
    }

    public void setQuadrupleList(LinkedList<Quadruple> quadrupleList) {
        this.quadrupleList = quadrupleList;
    }

    public int getTemporalCount() {
        return temporalCount;
    }

    public int getTemporalCountAndStep() {
        return temporalCount++;
    }

    public void setTemporalCount(int temporalCount) {
        this.temporalCount = temporalCount;
    }

    public LinkedList<Operator> getOperatorList() {
        return operatorList;
    }

    public void setOperatorList(LinkedList<Operator> operatorList) {
        this.operatorList = operatorList;
    }

    public LinkedList<Operand> getOperandSList() {
        return operandSList;
    }

    public void setOperandSList(LinkedList<Operand> operandSList) {
        this.operandSList = operandSList;
    }

    public Stack<Integer> getJumpStack() {
        return jumpStack;
    }

    public void setJumpStack(Stack<Integer> jumpStack) {
        this.jumpStack = jumpStack;
    }

    public static void setInstance(QuadrupleSemantic instance) {
        QuadrupleSemantic.instance = instance;
    }

    public Stack<Operand> getArgsStack() {
        return argsStack;
    }

    public void setArgsStack(Stack<Operand> argsStack) {
        this.argsStack = argsStack;
    }
}
