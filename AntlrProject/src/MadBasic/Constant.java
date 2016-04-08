package MadBasic;

/**
 * Created by lsanchez on 4/7/16.
 */
public class Constant<T> extends Operand {
    T value;

    public Constant(T value, Type type) {
        this.value = value;
        this.type = type;
    }

    public String toString(){
        return "Constant: " + this.value + " of Type: " + this.type.getTypeValue();
    }
}
