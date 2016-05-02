package MadBasic.Algrebra;

import MadBasic.Semantic.Types.Type;

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

    static public String getIdString(Operand o){
        String res;
        if(o instanceof Variable){
            res = ((Variable) o).getID();
        } else if(o instanceof Constant){
            res = ((Constant) o).getValue().toString();
        } else {
            if (((Temporal) o).isPointer()){
                res = "(t#" + ((Temporal) o).getID() + ")";
            } else {
                res = "t#" + ((Temporal) o).getID();
            }
        }
        return res;
    }

    public String toString(){
        return  "Type: " + this.type.getTypeValue();
    }
}
