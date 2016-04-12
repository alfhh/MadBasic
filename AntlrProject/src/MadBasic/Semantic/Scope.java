package MadBasic.Semantic;

import MadBasic.Algrebra.Variable;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Scope {
    String name;
    Scope parent;
    LinkedList<Variable> variables;
    HashMap<String, Variable> variableHashMap;

    public Scope(String name) {
        this.name = name;
        this.parent = null;
        variables = new LinkedList<>();
        variableHashMap = new HashMap<>();
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

    public HashMap<String, Variable> getVariableHashMap() {
        return variableHashMap;
    }

    public void setVariableHashMap(HashMap<String, Variable> variableHashMap) {
        this.variableHashMap = variableHashMap;
    }

    public Variable addVariable(Variable variable){
        return variableHashMap.putIfAbsent(variable.getID(), variable);
    }

    @Override
    public String toString() {
        String var = "{\t";
        for (Variable variable : variables) {
            var += variable.toString();
            if (variable != variables.getLast()) {
                var += ",\n\t";
            }
        }
        var += "}";

        String parentName = "";
        if (parent != null){
            parentName = parent.getName();
        } else {
            parentName = "null";
        }

        return "SCOPE: {name:" + name + ", \nparent:" + parentName + ",\nvariables:\n" + var + "}\n";
    }
}
