package MadBasic;

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
}