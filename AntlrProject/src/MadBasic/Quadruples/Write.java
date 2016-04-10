package MadBasic.Quadruples;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Write extends Quadruple {
    Operand output;
    

    public Write(Operand output) {
        this.output = output;
    }

    public Operand getOutput() {
        return output;
    }

    public void setOutput(Operand output) {
        this.output = output;
    }

    public String toString(){
        return "PRINT {print, "+ Operator.getIdString(output) +", , }";
    }
}
