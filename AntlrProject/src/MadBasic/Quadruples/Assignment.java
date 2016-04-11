package MadBasic.Quadruples;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;
import MadBasic.Algrebra.Variable;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Assignment extends Quadruple {
    Operand value;
    Variable result;

    public Assignment(Operand value, Variable result) {
        this.value = value;
        this.result = result;
    }

    public Operand getValue() {
        return value;
    }

    public void setValue(Operand value) {
        this.value = value;
    }

    public Variable getResult() {
        return result;
    }

    public void setResult(Variable result) {
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
