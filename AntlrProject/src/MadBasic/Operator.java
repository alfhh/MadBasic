package MadBasic;

/**
 * Created by lsanchez on 3/29/16.
 */
public enum Operator {
    AND(0, 0), OR(0, 1), GREATER(1, 2), LESSER(1, 3), GREATEREQUAL(1, 4), LESSEREQUAL(1, 5), EQUAL(1, 6),
    NOTEQUAL(1, 7), ADD(2, 8), MINUS(2, 9), MULTIPLICATION(3, 10), DIVISION(3, 11), CARET(4, 12);

    int value;

    String type;

    Operator(int x, int type) {
        value = x;
        switch (type) {
            case 0:
                this.type = "&&";
                break;
            case 1:
                this.type = "||";
                break;
            case 2:
                this.type = ">";
                break;
            case 3:
                this.type = "<";
                break;
            case 4:
                this.type = ">=";
                break;
            case 5:
                this.type = "<=";
                break;
            case 6:
                this.type = "==";
                break;
            case 7:
                this.type = "!=";
                break;
            case 8:
                this.type = "+";
                break;
            case 9:
                this.type = "-";
                break;
            case 10:
                this.type = "*";
                break;
            case 11:
                this.type = "/";
                break;
            case 12:
                this.type = "^";
                break;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
