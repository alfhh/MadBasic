package MadBasic.Semantic.Methods;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Scope;
import MadBasic.Semantic.Types.Type;
import MadBasic.VMemory.Era;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by lsanchez on 3/9/16.
 */
public class Procedure {
    String ID;
    Scope scope;
    LinkedList<Variable> params;
    int quadrupleStart;
    HashMap<String, Integer> eraHash;

    public Procedure(String ID, Scope parent) {
        this.ID = ID;
        this.scope = new Scope(ID, parent);
        params = new LinkedList<>();
        eraHash = new HashMap<>();
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

    public LinkedList<Variable> getParams() {
        return params;
    }

    public void setParams(LinkedList<Variable> params) {
        this.params = params;
    }

    public int getQuadrupleStart() {
        return quadrupleStart;
    }

    public void setQuadrupleStart(int quadrupleStart) {
        this.quadrupleStart = quadrupleStart;
    }

    public HashMap<String, Integer> getEra() {
        return eraHash;
    }

    public void setEra(HashMap<String, Integer> eraHash) {
        this.eraHash = eraHash;
    }

    public Procedure clone() {
        Procedure proc = new Procedure(ID, scope.getParent());
        proc.setParams(new LinkedList<>());
        proc.getParams().addAll(params);
        proc.setQuadrupleStart(quadrupleStart);
        proc.setEra(new HashMap<>());
        proc.getEra().putAll(eraHash);
        return proc;
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

        return "PROCEDURE{ID:" + ID + ", Start:" + quadrupleStart + ",\nscope:" + scope.getName() +
                ",\nparams:\n" + var + ",\n eraHash: " + eraHash + "}\n";
    }
}
