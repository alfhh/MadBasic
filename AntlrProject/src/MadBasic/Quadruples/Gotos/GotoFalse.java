package MadBasic.Quadruples.Gotos;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;

/**
 * Created by lsanchez on 4/9/16.
 */
public class GotoFalse extends Goto {
    Operand condition;

    public GotoFalse(Operand condition) {
        this.condition = condition;
    }

    public GotoFalse(int jump, Operand condition) {
        super(jump);
        this.condition = condition;
    }

    public Operand getCondition() {
        return condition;
    }

    public void setCondition(Operand condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "GotoFalse{" +
                "gotoFalse" +
                ",\t" + Operator.getIdString(condition) +
                ",\t" +
                ",\t" + jump +
                '}';
    }
}
