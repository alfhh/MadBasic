package MadBasic;

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
}
