package MadBasic.Algrebra;

import MadBasic.Semantic.Type;

/**
 * Created by lsanchez on 4/6/16.
 */
public class Operand {
    Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public String toString(){
        return  "Type: " + this.type.getTypeValue();
    }
}
