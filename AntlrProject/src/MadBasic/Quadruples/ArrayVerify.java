package MadBasic.Quadruples;

import MadBasic.Algrebra.Constant;
import MadBasic.Algrebra.Operand;

/**
 * Created by lsanchez on 4/20/16.
 */
public class ArrayVerify extends Quadruple {
    Operand operand;
    Constant<Integer> start;
    Constant<Integer> end;

    public ArrayVerify(Operand operand, Constant<Integer> start, Constant<Integer> end) {
        this.operand = operand;
        this.start = start;
        this.end = end;
    }

    public Operand getOperand() {
        return operand;
    }

    public void setOperand(Operand operand) {
        this.operand = operand;
    }

    public Constant<Integer> getStart() {
        return start;
    }

    public void setStart(Constant<Integer> start) {
        this.start = start;
    }

    public Constant<Integer> getEnd() {
        return end;
    }

    public void setEnd(Constant<Integer> end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "ArrayVerify{" +
                "ver" +
                ",\t" + Operand.getIdString(operand) +
                ",\t" + Operand.getIdString(start) +
                ",\t" + Operand.getIdString(end) +
                '}';
    }
}
