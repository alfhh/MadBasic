package MadBasic.VMemory;

import MadBasic.Algrebra.Variable;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by lsanchez on 4/28/16.
 */
public class Era {

    HashMap<String, Integer> vDirectory;
    int start;
    int retorno;
    LinkedList<Variable> params;
    int vMemoryStart;

    public Era() {
        vDirectory = new HashMap<>();
        params = new LinkedList<>();
    }

    public HashMap<String, Integer> getvDirectory() {
        return vDirectory;
    }

    public void setvDirectory(HashMap<String, Integer> vDirectory) {
        this.vDirectory = vDirectory;
    }

    public int getStart() {
        return start;
    }

    public Era clone(){
        Era e = new Era();
        e.setParams(new LinkedList<>());
        e.getParams().addAll(params);
        e.setvDirectory(new HashMap<>());
        e.getvDirectory().putAll(vDirectory);
        e.setStart(start);
        return e;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getRetorno() {
        return retorno;
    }

    public void setRetorno(int retorno) {
        this.retorno = retorno;
    }

    public LinkedList<Variable> getParams() {
        return params;
    }

    public void setParams(LinkedList<Variable> params) {
        this.params = params;
    }

    public int getvMemoryStart() {
        return vMemoryStart;
    }

    public void setvMemoryStart(int vMemoryStart) {
        this.vMemoryStart = vMemoryStart;
    }

    @Override
    public String toString() {
        return "Era{" +
                "vDirectory=" + vDirectory +
                ", start=" + start +
                ", retorno=" + retorno +
                '}';
    }
}
