package MadBasic;

import java.util.LinkedList;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Scope {
    String name;
    Scope parent;
    LinkedList<Variable> variables;

    public Scope(String name) {
        this.name = name;
        this.parent = null;
        variables = new LinkedList<>();
    }


    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        variables = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getParent() {
        return parent;
    }

    public void setParent(Scope parent) {
        this.parent = parent;
    }

    public LinkedList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(LinkedList<Variable> variables) {
        this.variables = variables;
    }

    @Override
    public String toString() {
        String var = "{";
        for (Variable variable : variables) {
            var += variable.toString();
            if (variable != variables.getLast()) {
                var += ", ";
            }
        }
        var += "}";

        return "SCOPE: {name:" + name + ", parent:" + parent + ", variables:" + var + "}";
    }
}
