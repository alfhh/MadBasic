package MadBasic.Quadruples.Gotos;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;

/**
 * Created by lsanchez on 4/9/16.
 */
public class GotoTrue extends Goto {
    Operand condition;

    public GotoTrue(Operand condition) {
        this.condition = condition;
    }

    public GotoTrue(int jump, Operand condition) {
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
        return "GotoTrue{" +
                "gotoTrue" +
                ",\t" + Operand.getIdString(condition) +
                ",\t" +
                ",\t" + jump +
                '}';
    }
}
