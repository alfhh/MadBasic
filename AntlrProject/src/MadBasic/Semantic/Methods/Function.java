package MadBasic.Semantic.Methods;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Scope;
import MadBasic.Semantic.Types.Type;

import java.util.HashMap;
import java.util.LinkedList;

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
    public Function clone() {
        Function func = new Function(ID, type, scope.getParent());
        func.setParams(new LinkedList<>());
        func.getParams().addAll(params);
        func.setQuadrupleStart(quadrupleStart);
        func.setEra(new HashMap<>());
        func.getEra().putAll(eraHash);
        return func;
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
