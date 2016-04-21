package MadBasic.Semantic.Types;

import MadBasic.Semantic.Class;

/**
 * Created by ahinojosa on 6/04/16.
 */
//    INT(0), FLOAT(1), STRING(2), BOOL(3), LIST(4), OBJECT(5), FALSE(-1);

public class TypeObject extends Type{
    Class classe;

    public TypeObject() {
        value = 5;
    }

    public TypeObject(Class classe) {
        value = 5;
        this.classe = classe;
    }

    public Class getClasse() {
        return classe;
    }

    public void setClasse(Class classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        String classStr = "";

        return "Object{Class: " + classe.getName() + "}";
    }
}