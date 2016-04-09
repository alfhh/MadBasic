package MadBasic.Quadruples;

import MadBasic.Quadruples.Quadruple;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Write extends Quadruple {
    String output;

    public Write() {
    }

    public Write(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}
