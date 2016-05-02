package MadBasic.Semantic;

import MadBasic.Algrebra.Variable;
import MadBasic.Semantic.Methods.Function;
import MadBasic.Semantic.Methods.Procedure;

import java.util.LinkedList;
import java.util.Set;

/**
 * Created by lsanchez on 4/13/16.
 */
public class Class {
    String name;
    Scope scope;
    Class parent;

    public Class(String name, Scope scope) {
        this.name = name;
        this.scope = scope;
    }

    public Class(String name, Scope scope, Class parent) {
        this.name = name;
        this.scope = scope;
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Scope getScope() {
        return scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

    public Class getParent() {
        return parent;
    }

    public void setParent(Class parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", scope=" + scope +
                ", parent=" + parent +
                '}';
    }
}
