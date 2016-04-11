package MadBasic.Algrebra;

/**
 * Created by lsanchez on 3/29/16.
 */
public enum Operator {
    AND(0, 0), OR(0, 1), GREATER(1, 2), LESSER(1, 3), GREATEREQUAL(1, 4), LESSEREQUAL(1, 5), EQUALEQUAL(1, 6),
    NOTEQUAL(1, 7), PLUS(2, 8), MINUS(2, 9), MULTIPLICATION(3, 10), DIVISION(3, 11), CARET(4, 12), MINUSSOLO(5, 13),
    FALSE(-1, -1);

    int value;

    String operator;

    Operator(int x, int operator) {
        value = x;
        switch (operator) {
            case 0:
                this.operator = "&&";
                break;
            case 1:
                this.operator = "||";
                break;
            case 2:
                this.operator = ">";
                break;
            case 3:
                this.operator = "<";
                break;
            case 4:
                this.operator = ">=";
                break;
            case 5:
                this.operator = "<=";
                break;
            case 6:
                this.operator = "==";
                break;
            case 7:
                this.operator = "!=";
                break;
            case 8:
                this.operator = "+";
                break;
            case 9:
                this.operator = "-";
                break;
            case 10:
                this.operator = "*";
                break;
            case 11:
                this.operator = "/";
                break;
            case 12:
                this.operator = "^";
                break;
            case 13:
                this.operator = "-";
                break;
            default:
                break;
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "value=" + value +
                ", operator='" + operator + '\'' +
                '}';
    }
}
