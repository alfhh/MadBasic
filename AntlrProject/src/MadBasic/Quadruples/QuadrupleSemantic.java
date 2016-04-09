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
    Stack<Operand> operandStack;
    LinkedList<Quadruple> quadrupleList;
    int temporalCount;

    static private QuadrupleSemantic instance;

    private QuadrupleSemantic() {
        operandStack = new Stack<>();
        operatorStack = new Stack<>();
        quadrupleList = new LinkedList<>();
        temporalCount = 0;
    }

    static public QuadrupleSemantic getInstance(){
        if (instance == null){
            instance = new QuadrupleSemantic();
        }
        return instance;
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

    public void setTemporalCount(int temporalCount) {
        this.temporalCount = temporalCount;
    }
}
