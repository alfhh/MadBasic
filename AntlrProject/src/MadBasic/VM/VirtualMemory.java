package MadBasic.VM;

import MadBasic.Quadruples.Quadruple;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by lsanchez on 4/17/16.
 */
public class VirtualMemory {
    LinkedList<Quadruple> quadruples;
    HashMap<Integer, Object> vMemory;
    HashMap<String, Integer> vDirectory;
    Integer instanceCount;
    Integer intCount;
    Integer floatCount;
    Integer stringCount;
    Integer boolCount;
    Integer tempIntCount;
    Integer tempFloatCount;
    Integer tempStringCount;
    Integer tempBoolCount;

    static VirtualMemory instance;
    
    private VirtualMemory() {
        quadruples = new LinkedList<>();
        vMemory = new HashMap<>();
        vDirectory = new HashMap<>();
        instanceCount = 0;
        intCount = 1000;
        floatCount = 1500;
        stringCount = 2000;
        boolCount = 2500;
        tempIntCount = 3000;
        tempFloatCount = 3500;
        tempStringCount = 4000;
        tempBoolCount = 4500;
    }
    
    public static VirtualMemory getInstance(){
        if(instance == null){
            instance = new VirtualMemory();
        }
        return instance;
    }

    public LinkedList<Quadruple> getQuadruples() {
        return quadruples;
    }

    public void setQuadruples(LinkedList<Quadruple> quadruples) {
        this.quadruples = quadruples;
    }

    public HashMap<Integer, Object> getvMemory() {
        return vMemory;
    }

    public void setvMemory(HashMap<Integer, Object> vMemory) {
        this.vMemory = vMemory;
    }

    public HashMap<String, Integer> getvDirectory() {
        return vDirectory;
    }

    public void setvDirectory(HashMap<String, Integer> vDirectory) {
        this.vDirectory = vDirectory;
    }

    public Integer getInstanceCount() {
        return instanceCount;
    }

    public Integer getIntCount() {
        return intCount;
    }

    public Integer getFloatCount() {
        return floatCount;
    }

    public Integer getStringCount() {
        return stringCount;
    }

    public Integer getBoolCount() {
        return boolCount;
    }

    public Integer getTempIntCount() {
        return tempIntCount;
    }

    public Integer getTempFloatCount() {
        return tempFloatCount;
    }

    public Integer getTempStringCount() {
        return tempStringCount;
    }

    public Integer getTempBoolCount() {
        return tempBoolCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public void setIntCount(Integer intCount) {
        this.intCount = intCount;
    }

    public void setFloatCount(Integer floatCount) {
        this.floatCount = floatCount;
    }

    public void setStringCount(Integer stringCount) {
        this.stringCount = stringCount;
    }

    public void setBoolCount(Integer boolCount) {
        this.boolCount = boolCount;
    }

    public void setTempIntCount(Integer tempIntCount) {
        this.tempIntCount = tempIntCount;
    }

    public void setTempFloatCount(Integer tempFloatCount) {
        this.tempFloatCount = tempFloatCount;
    }

    public void setTempStringCount(Integer tempStringCount) {
        this.tempStringCount = tempStringCount;
    }

    public void setTempBoolCount(Integer tempBoolCount) {
        this.tempBoolCount = tempBoolCount;
    }

    public void addInstanceCount() {
        this.instanceCount++;
    }

    public void addIntCount() {
        this.intCount++;
    }

    public void addFloatCount() {
        this.floatCount++;
    }

    public void addStringCount() {
        this.stringCount++;
    }

    public void addBoolCount() {
        this.boolCount++;
    }

    public void addTempIntCount() {
        this.tempIntCount++;
    }

    public void addTempFloatCount() {
        this.tempFloatCount++;
    }

    public void addTempStringCount() {
        this.tempStringCount++;
    }

    public void addTempBoolCount() {
        this.tempBoolCount++;
    }

    @Override
    public String toString() {
        return "VirtualMemory{" +
                "vDirectory=" + vDirectory +
                ", vMemory=" + vMemory +
                ", quadruples=" + quadruples +
                '}';
    }
}
