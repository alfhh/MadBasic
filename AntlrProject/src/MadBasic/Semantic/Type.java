package MadBasic.Semantic;

/**
 * Created by ahinojosa on 6/04/16.
 */
public enum Type {
    INT(0), FLOAT(1), STRING(2), BOOL(3), LIST(4), OBJECT(5), FALSE(-1);

    private int value;
    private Type type;

    private void setTypeNull() {
        type = Type.FALSE;
    }

    Type(int x) {
        value = x;
        setTypeNull();
    }

    public int getTypeValue() {
        return value;
    }

    @Override
    public String toString() {
//        return "Type{" +
//                "value=" + value +
//                '}';
        switch (this.value) {
            case 0:
                return "Type.INT";
            case 1:
                return "Type.FLOAT";
            case 2:
                return "Type.STRING";
            case 3:
                return "Type.BOOL";
            case 4:
                return "Type.LIST<" + type + ">";
            case 5:
                return "Type.OBJECT";
            default:
                return "Type.FALSE";

        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        if(this == this.LIST) {
            if (this.type != null) {
//            System.out.println(type);
                this.type.setType(type);
            } else {
                this.type = type;
            }
        }
    }
}