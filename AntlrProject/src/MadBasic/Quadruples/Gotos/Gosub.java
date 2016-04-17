package MadBasic.Quadruples.Gotos;

import MadBasic.Semantic.Methods.Procedure;

/**
 * Created by lsanchez on 4/11/16.
 */
public class Gosub extends Goto {
    Procedure procedure;

    public Gosub(int jump, Procedure procedure) {
        super(jump);
        this.procedure = procedure;
    }

    public Procedure getProcedure() {
        return procedure;
    }

    public void setProcedure(Procedure procedure) {
        this.procedure = procedure;
    }

    @Override
    public String toString() {
        return "Gosub{" +
                "gosub" +
                ",\t" + procedure.getID() +
                ",\t" +
                ",\t" + jump +
                "}";
    }
}
