package MadBasic.Semantic.Types;

/**
 * Created by ahinojosa on 6/04/16.
 */
public class Type {
    protected int value;

    public int getTypeValue() {
        return value;
    }

    public boolean equals(Type type){
        return value == type.value;
    }
}