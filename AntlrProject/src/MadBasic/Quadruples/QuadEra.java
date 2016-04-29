package MadBasic.Quadruples;

import MadBasic.Semantic.Methods.Procedure;

/**
 * Created by lsanchez on 4/11/16.
 */
public class QuadEra extends Quadruple {
    Procedure procedure;

    public QuadEra(Procedure procedure) {
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
        return "QuadEra{" +
                "era" +
                ",\t" + procedure.getID() +
                ",\t" +
                ",\t" +
                "}";
    }
}
