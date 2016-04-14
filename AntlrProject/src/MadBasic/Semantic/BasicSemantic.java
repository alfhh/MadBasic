package MadBasic.Semantic;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Methods.Procedure;
import MadBasic.Semantic.Types.Type;
import MadBasic.Semantic.Types.TypeFalse;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by lsanchez on 3/10/16.
 */
public class BasicSemantic {

    private static BasicSemantic instance;


    LinkedList<Procedure> procedures;
    LinkedList<Variable> variables;
    LinkedList<Scope> scopes;
    Stack<Scope> scopeStack;
    Stack<Type> typeStack;
    LinkedList<Variable> paramList;
    boolean params;
    Type quickTypeSearch;

    private BasicSemantic() {
        procedures = new LinkedList<>();
        variables = new LinkedList<>();
        scopes = new LinkedList<>();
        scopeStack = new Stack<>();
        typeStack = new Stack<>();
        params = false;

        // Add the global scope
        Scope global = new Scope("global");
        scopes.add(global);
        scopeStack.push(global);

        quickTypeSearch = new TypeFalse();

    }

    static public BasicSemantic getInstance(){
        if (instance == null){
            instance = new BasicSemantic();
        }
        return instance;
    }

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

    public Stack<Type> getTypeStack() {
        return typeStack;
    }

    public void setTypeStack(Stack<Type> typeStack) {
        this.typeStack = typeStack;
    }

    public LinkedList<Variable> getParamList() {
        return paramList;
    }

    public void setParamList(LinkedList<Variable> paramList) {
        this.paramList = paramList;
    }

    public boolean isParams() {
        return params;
    }

    public void setParams(boolean params) {
        this.params = params;
    }

    public Type getActualType(){
        return this.quickTypeSearch;
    }

    public void setActualType(Type t){
        this.quickTypeSearch = t;
    }

    public void resetActualType(){
        this.quickTypeSearch = new TypeFalse();
    }
}
