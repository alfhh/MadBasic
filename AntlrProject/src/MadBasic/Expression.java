package MadBasic;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Expression extends Quadruple {
    Operator oper;
    Operand operand1;
    Operand operand2;
    Temporal result;

    public Expression(Operator oper, Operand operand1, Operand operand2, Temporal result) {
        this.oper = oper;
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.result = result;
    }

    public Operator getOper() {
        return oper;
    }

    public void setOper(Operator oper) {
        this.oper = oper;
    }

    public Operand getOperand1() {
        return operand1;
    }

    public void setOperand1(Operand operand1) {
        this.operand1 = operand1;
    }

    public Operand getOperand2() {
        return operand2;
    }

    public void setOperand2(Operand operand2) {
        this.operand2 = operand2;
    }

    public Temporal getResult() {
        return result;
    }

    public void setResult(Temporal result) {
        this.result = result;
    }
}