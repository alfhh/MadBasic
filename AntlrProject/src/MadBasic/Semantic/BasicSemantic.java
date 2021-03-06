package MadBasic.Semantic;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Methods.Procedure;
import MadBasic.Semantic.Types.Type;
import MadBasic.Semantic.Types.TypeFalse;
import MadBasic.VMemory.Instance;

import java.util.HashMap;
import java.util.LinkedList;
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
    HashMap<String, Class> classHashMap;
    LinkedList<Operand> arrayIndexList;
    boolean params;
    boolean hasParent;
    String parent;
    boolean dot; // Flag used to know if the reading is in the middle of a concatenation of an object
    Type quickTypeSearch;
    boolean inMethod;
    boolean foundAReference;
    boolean isArray;
    boolean isArrayandDot;
    Instance instanceForArray;
    LinkedList<Variable> eraPrep;
    HashMap<String, Integer> eraHash;

    private BasicSemantic() {
        procedures = new LinkedList<>();
        variables = new LinkedList<>();
        scopes = new LinkedList<>();
        scopeStack = new Stack<>();
        typeStack = new Stack<>();
        classHashMap = new HashMap<>();
        paramList = new LinkedList<>();
        params = false;
        hasParent = false;
        parent = "";
        dot = false;
        inMethod = false;
        foundAReference = false;
        arrayIndexList = new LinkedList<>();
        isArray = false;
        isArrayandDot = false;
        instanceForArray = new Instance();
        eraPrep = new LinkedList<>();
        eraHash = new HashMap<>();

        // Add the global scope
        Scope global = new Scope("global");
        scopes.add(global);
        scopeStack.push(global);

        quickTypeSearch = new TypeFalse();

    }

    static public BasicSemantic getInstance() {
        if (instance == null) {
            instance = new BasicSemantic();
        }
        return instance;
    }

    public static void resetInstance() {
        instance = new BasicSemantic();
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

    public boolean isHasParent() {
        return hasParent;
    }

    public void setHasParent(boolean hasParent) {
        this.hasParent = hasParent;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public HashMap<String, Class> getClassHashMap() {
        return classHashMap;
    }

    public void setClassHashMap(HashMap<String, Class> classHashMap) {
        this.classHashMap = classHashMap;
    }

    public boolean isDot() {
        return dot;
    }

    public void setDot(boolean dot) {
        this.dot = dot;
    }

    public Type getActualType() {
        return this.quickTypeSearch;
    }

    public void setActualType(Type t) {
        this.quickTypeSearch = t;
    }

    public void resetActualType() {
        this.quickTypeSearch = new TypeFalse();
    }

    public boolean isInMethod() {
        return inMethod;
    }

    public void setInMethod(boolean inMethod) {
        this.inMethod = inMethod;
    }

    public boolean isFoundAReference() {
        return foundAReference;
    }

    public void setFoundAReference(boolean foundAReference) {
        this.foundAReference = foundAReference;
    }

    public LinkedList<Operand> getArrayIndexList() {
        return arrayIndexList;
    }

    public void setArrayIndexList(LinkedList<Operand> arrayIndexList) {
        this.arrayIndexList = arrayIndexList;
    }

    public boolean isArray() {
        return isArray;
    }

    public void setArray(boolean array) {
        isArray = array;
    }

    public boolean isArrayandDot() {
        return isArrayandDot;
    }

    public void setArrayandDot(boolean arrayandDot) {
        isArrayandDot = arrayandDot;
    }

    public Instance getInstanceForArray() {
        return instanceForArray;
    }

    public void setInstanceForArray(Instance instanceForArray) {
        this.instanceForArray = instanceForArray;
    }

    public LinkedList<Variable> getEraPrep() {
        return eraPrep;
    }

    public void setEraPrep(LinkedList<Variable> eraPrep) {
        this.eraPrep = eraPrep;
    }

    public HashMap<String, Integer> getEraHash() {
        return eraHash;
    }

    public void setEraHash(HashMap<String, Integer> eraHash) {
        this.eraHash = eraHash;
    }
}
