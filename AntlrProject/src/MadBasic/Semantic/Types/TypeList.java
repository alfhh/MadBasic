package MadBasic.Semantic.Types;

/**
 * Created by ahinojosa on 6/04/16.
 */
//    INT(0), FLOAT(1), STRING(2), BOOL(3), LIST(4), OBJECT(5), FALSE(-1);

public class TypeList extends Type {
    private Type type;

    public TypeList() {
        value = 4;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if (this.type == null) {
            this.type = type;
        } else if(this.type instanceof TypeList){
            ((TypeList)this.type).setType(type);
        }
        else {
        }
    }

    @Override
    public boolean equals(Type type) {
        return super.equals(type) && this.type.equals(((TypeList)type).getType());
    }

    @Override
    public String toString() {
        return "List<" +
                type +
                '>';
    }
}