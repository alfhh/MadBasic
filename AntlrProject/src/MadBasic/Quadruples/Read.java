package MadBasic.Quadruples;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;
import MadBasic.Algrebra.Temporal;
import MadBasic.Algrebra.Variable;
import MadBasic.Quadruples.Quadruple;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Read extends Quadruple {
    Temporal value;

    public Read(Temporal value) {
        this.value = value;
    }

    public Temporal getValue() {
        return value;
    }

    public void setValue(Temporal value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Read{" +
                "read" +
                ",\t" +
                ",\t" +
                ",\t" + Operand.getIdString(value) +
                '}';
    }
}
