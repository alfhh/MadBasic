package MadBasic.Algrebra;

import MadBasic.Semantic.Type;

/**
 * Created by lsanchez on 4/6/16.
 */
public class Temporal extends Operand {
    int ID;

    public Temporal(int ID, Type type) {
        this.ID = ID;
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Temporal{" +
                "ID=" + ID +
                "Type=" + type +
                '}';
    }
}
