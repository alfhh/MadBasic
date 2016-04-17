package MadBasic.Quadruples.Gotos;

import MadBasic.Quadruples.Quadruple;

/**
 * Created by lsanchez on 4/9/16.
 */
public class Goto extends Quadruple {
    int jump;

    public Goto() {
    }

    public Goto(int jump) {
        this.jump = jump;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    @Override
    public String toString() {
        return "Goto{" +
                "goto" +
                ",\t" +
                ",\t" +
                ",\t" + jump +
                '}';
    }
}
