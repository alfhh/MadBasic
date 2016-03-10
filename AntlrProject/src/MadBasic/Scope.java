package MadBasic;

/**
 * Created by lsanchez on 3/10/16.
 */
public class Scope {
    String name;
    Scope parent;

    public Scope(String name) {
        this.name = name;
        this.parent = null;
    }

    public Scope(String name, Scope parent) {
        this.name = name;
        this.parent = parent;
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

    @Override
    public String toString() {
        return "SCOPE{name:" + name + ", parent:" + parent + "}";
    }
}
