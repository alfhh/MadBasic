package MadBasic;

/**
 * Created by lsanchez on 4/6/16.
 */
public class Temporal extends Operand {
    int ID;
    String type;

    public Temporal(int ID, String type) {
        this.ID = ID;
        this.type = type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
