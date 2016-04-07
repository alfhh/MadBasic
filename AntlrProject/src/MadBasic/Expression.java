package MadBasic;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Expression extends Quadruple {
    Operator oper;
    Variable operand1;
    Variable operand2;


    public Expression(Operator oper, Variable operand1, Variable operand2) {
        this.oper = oper;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public Operator getOper() {
        return oper;
    }

    public void setOper(Operator oper) {
        this.oper = oper;
    }

    public Variable getOperand1() {
        return operand1;
    }

    public void setOperand1(Variable operand1) {
        this.operand1 = operand1;
    }

    public Variable getOperand2() {
        return operand2;
    }

    public void setOperand2(Variable operand2) {
        this.operand2 = operand2;
    }
}