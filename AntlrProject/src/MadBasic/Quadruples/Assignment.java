package MadBasic.Quadruples;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;
import MadBasic.Algrebra.Operand;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Assignment extends Quadruple {
    Operand value;
    Operand result;

    public Assignment(Operand value, Operand result) {
        this.value = value;
        this.result = result;
    }

    public Operand getValue() {
        return value;
    }

    public void setValue(Operand value) {
        this.value = value;
    }

    public Operand getResult() {
        return result;
    }

    public void setResult(Operand result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "=" +
                ",\t" + Operand.getIdString(value) +
                ",\t" +
                ",\t" + Operand.getIdString(result) +
                "}";
    }
}
