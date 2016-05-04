package MadBasic.VMemory;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Variable;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by lsanchez on 4/28/16.
 */
public class Era {

    HashMap<String, Integer> vDirectory;
    HashMap<String, Operand> varHashMap;
    int start;
    int retorno;
    LinkedList<Variable> params;
    int vMemoryStart;
    LinkedList<ReferencePair> referencePairList;
    Instance instance;

    public Era() {
        referencePairList = new LinkedList<>();
        vDirectory = new HashMap<>();
        params = new LinkedList<>();
        varHashMap = new HashMap<>();
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

    public LinkedList<ReferencePair> getReferencePairList() {
        return referencePairList;
    }

    public void setReferencePairList(LinkedList<ReferencePair> referencePairList) {
        this.referencePairList = referencePairList;
    }

    public Era clone(){
        Era e = new Era();
        e.setParams(new LinkedList<>());
        e.getParams().addAll(params);
        e.setvDirectory(new HashMap<>());
        e.getvDirectory().putAll(vDirectory);
        e.setStart(start);
        e.setReferencePairList(new LinkedList<>());
        e.setVarHashMap(new HashMap<>());
        e.getVarHashMap().putAll(varHashMap);
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

    public HashMap<String, Operand> getVarHashMap() {
        return varHashMap;
    }

    public void setVarHashMap(HashMap<String, Operand> varHashMap) {
        this.varHashMap = varHashMap;
    }
    public Instance getInstance() {
        return instance;
    }

    public void setInstance(Instance instance) {
        this.instance = instance;
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
