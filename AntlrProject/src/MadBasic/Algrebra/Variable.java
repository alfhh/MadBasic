package MadBasic.Algrebra;

import MadBasic.Semantic.Scope;
import MadBasic.Semantic.Types.Type;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Variable extends Operand {
    String ID;
    Scope scope;
    boolean isByReference;
    boolean isAddress;

    public Variable(String ID, Type type, Scope scope) {
        this.ID = ID;
        this.type = type;
        this.scope = scope;
    }

    public Variable(String ID, Type type, Scope scope, boolean reference) {
        this.ID = ID;
        this.type = type;
        this.scope = scope;
        this.isByReference = reference;
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

    public boolean isByReference() {
        return isByReference;
    }

    public void setByReference(boolean byReference) {
        isByReference = byReference;
    }

    public boolean isAddress() {
        return isAddress;
    }

    public void setAddress(boolean address) {
        isAddress = address;
    }

    @Override
    public String toString() {
        return "VARIABLE:{ID:" + ID + ", type:" + type + ", scope:" + scope.getName() + "}";
    }
}
