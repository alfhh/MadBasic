package MadBasic.Algrebra;

import MadBasic.Semantic.Types.Type;

/**
 * Created by lsanchez on 4/6/16.
 */
public class Temporal extends Operand {
    int ID;
    boolean pointer;

    public Temporal(int ID, Type type) {
        this.ID = ID;
        this.type = type;
        this.pointer = false;
    }

    public Temporal(int ID, Type type, boolean pointer) {
        this.ID = ID;
        this.type = type;
        this.pointer = pointer;
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

    public boolean isPointer() {
        return pointer;
    }

    public void setPointer(boolean pointer) {
        this.pointer = pointer;
    }

    @Override
    public String toString() {
        return "Temporal{" +
                "ID=" + ID +
                ", Type=" + type +
                '}';
    }
}
