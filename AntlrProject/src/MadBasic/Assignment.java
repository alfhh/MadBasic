package MadBasic;

/**
 * Created by lsanchez on 3/29/16.
 */
public class Assignment<T> extends Quadruple{
    T value;
    T result;

    public Assignment() {
    }

    public Assignment(T value, T result) {
        this.value = value;
        this.result = result;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
