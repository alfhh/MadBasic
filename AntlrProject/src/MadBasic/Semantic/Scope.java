package MadBasic.Semantic;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Methods.Procedure;

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
    HashMap<String, Procedure> procedureHashMap;


    public Scope(String name) {
        this.name = name;
        this.parent = null;
        variables = new LinkedList<>();
        variableHashMap = new HashMap<>();
        procedureHashMap = new HashMap<>();
    }

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
        variables = new LinkedList<>();
        variableHashMap = new HashMap<>();
        procedureHashMap = new HashMap<>();
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
        return this.variableHashMap.putIfAbsent(variable.getID(), variable);
    }

    public HashMap<String, Procedure> getProcedureHashMap() {
        return procedureHashMap;
    }

    public void setProcedureHashMap(HashMap<String, Procedure> procedureHashMap) {
        this.procedureHashMap = procedureHashMap;
    }

    @Override
    public String toString() {
        String var = "{\t";
        int limit = 0;
        for (Variable variable : variableHashMap.values()) {
            var += variable.toString();
            limit++;
            if (limit != variableHashMap.size()) {
                var += ",\n\t";
            }
        }
        var += "}";

        String proc = "";
        if (!procedureHashMap.isEmpty()) {
            proc = "methods: {";
            for (Procedure procedure : procedureHashMap.values()) {
                proc += ",\n\t" + procedure.toString();
            }
            proc += "}";
        }

        String parentName = "";
        if (parent != null) {
            parentName = parent.getName();
        } else {
            parentName = "null";
        }

        return "SCOPE: {name:" + name + ", \nparent:" + parentName + ",\nvariables:\n" + var +
                ",\n" + proc + "}\n";
    }
}
