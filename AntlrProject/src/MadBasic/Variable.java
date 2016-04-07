package MadBasic;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Variable extends Operand{
    String ID;
    String type;
    Scope scope;

    public Variable(String ID, String type, Scope scope) {
        this.ID = ID;
        this.type = type;
        this.scope = scope;
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

    @Override
    public String toString() {
        return "VARIABLE:{ID:" + ID + ", type:" + type + ", scope:" + scope.getName() + "}";
    }
}
