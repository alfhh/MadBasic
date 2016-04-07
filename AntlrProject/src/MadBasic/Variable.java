package MadBasic;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Variable extends Operand{
    String ID;
    Scope scope;

    public Variable(String ID, Type type, Scope scope) {
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
