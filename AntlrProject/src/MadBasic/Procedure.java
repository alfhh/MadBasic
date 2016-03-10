package MadBasic;

/**
 * Created by lsanchez on 3/9/16.
 */
public class Procedure {
    String ID;
    String type;
    Scope scope;

    public Procedure(String ID, String type, Scope scope) {
        this.ID = ID;
        this.type = type;
        this.scope = new Scope("scope" + ID, scope);
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }
}
