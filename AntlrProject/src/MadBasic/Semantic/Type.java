package MadBasic.Semantic;

/**
 * Created by ahinojosa on 6/04/16.
 */
public enum Type {
    INT(0), FLOAT(1), STRING(2), BOOL(3), LIST(4), OBJECT(5), FALSE(-1);

    private int value;

    Type(int x) {
        value = x;
    }

    public int getTypeValue() {
        return value;
    }

    @Override
    public String toString() {
//        return "Type{" +
//                "value=" + value +
//                '}';
        switch(this.value){
            case 0:
                return "Type.INT";
            case 1:
                return "Type.FLOAT";
            case 2:
                return "Type.STRING";
            case 3:
                return "Type.BOOL";
            case 4:
                return "Type.LIST";
            case 5:
                return "Type.OBJECT";
            default:
                return "Type.FALSE";

        }
    }
}