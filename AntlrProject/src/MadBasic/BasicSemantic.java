package MadBasic;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by lsanchez on 3/10/16.
 */
public class BasicSemantic {

    private static BasicSemantic instance;

    private BasicSemantic() {
        procedures = new LinkedList<>();
        variables = new LinkedList<>();
        scopes = new LinkedList<>();
        scopeStack = new Stack<>();
    }

    static public BasicSemantic getInstance(){
        if (instance == null){
            instance = new BasicSemantic();
        }
        return instance;
    }

    LinkedList<Procedure> procedures;
    LinkedList<Variable> variables;
    LinkedList<Scope> scopes;
    Stack<Scope> scopeStack;

    public LinkedList<Procedure> getProcedures() {
        return procedures;
    }

    public void setProcedures(LinkedList<Procedure> procedures) {
        this.procedures = procedures;
    }

    public LinkedList<Variable> getVariables() {
        return variables;
    }

    public void setVariables(LinkedList<Variable> variables) {
        this.variables = variables;
    }

    public LinkedList<Scope> getScopes() {
        return scopes;
    }

    public void setScopes(LinkedList<Scope> scopes) {
        this.scopes = scopes;
    }

    public Stack<Scope> getScopeStack() {
        return scopeStack;
    }

    public void setScopeStack(Stack<Scope> scopeStack) {
        this.scopeStack = scopeStack;
    }
}
