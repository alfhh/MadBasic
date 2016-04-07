package MadBasic;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Read<T> extends Quadruple {
    T value;

    public Read() {
    }

    public Read(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
