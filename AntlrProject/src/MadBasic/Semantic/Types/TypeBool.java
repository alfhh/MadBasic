package MadBasic.Semantic.Types;

/**
 * Created by ahinojosa on 6/04/16.
 */
//    INT(0), FLOAT(1), STRING(2), BOOL(3), LIST(4), OBJECT(5), FALSE(-1);

public class TypeBool extends Type{
    public TypeBool() {
        value = 3;
    }

    @Override
    public String toString() {
        return "Bool";
    }
}