package MadBasic.Semantic.Methods;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Scope;
import MadBasic.Semantic.Types.Type;

/**
 * Created by lsanchez on 4/10/16.
 */
public class Function extends Procedure {
    Type type;

    public Function(String ID, Type type, Scope parent) {
        super(ID, parent);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        String var = "{\t";
        for (Variable variable : params) {
            var += variable.toString();
            if (variable != params.getLast()) {
                var += ",\n\t";
            }
        }
        var += "}";

        return "FUNCTION{ID:" + ID + ",\ntype: " + type + ", Start:" + quadrupleStart + ",\nscope:" + scope.getName() +
                ",\nparams:\n" + var + ",\neraHash: " + eraHash + "}\n";
    }
}
