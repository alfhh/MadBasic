package MadBasic.VMemory;

import MadBasic.Quadruples.Quadruple;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by lsanchez on 4/17/16.
 */
public class VirtualMemory {
    LinkedList<Quadruple> quadruples;
    HashMap<Integer, Object> vMemory;
    HashMap<String, Integer> vDirectory;
    HashMap<String, Era> eraHashMap;
    Integer instanceCount;
    Integer intCount;
    Integer floatCount;
    Integer stringCount;
    Integer boolCount;
    Integer tempIntCount;
    Integer tempFloatCount;
    Integer tempStringCount;
    Integer tempBoolCount;
    Integer constIntCount;
    Integer constFloatCount;
    Integer constStringCount;
    Integer constBoolCount;
    Integer stackVariableCount;
    Stack<Era> eraStack;
    Stack<Instance> instanceStack;
    Stack<Era> secondaryEraStack;

    static VirtualMemory instance;

    private VirtualMemory() {
        quadruples = new LinkedList<>();
        vMemory = new HashMap<>();
        vDirectory = new HashMap<>();
        eraHashMap = new HashMap<>();
        eraStack = new Stack<>();
        secondaryEraStack = new Stack<>();
        instanceStack = new Stack<>();
        instanceCount = 0;
        intCount = 1000;
        floatCount = 1500;
        stringCount = 2000;
        boolCount = 2500;
        tempIntCount = 3000;
        tempFloatCount = 3500;
        tempStringCount = 4000;
        tempBoolCount = 4500;
        constIntCount = 5000;
        constFloatCount = 5250;
        constStringCount = 5500;
        constBoolCount = 5750;
        stackVariableCount = 6000;
    }

    public static VirtualMemory getInstance() {
        if (instance == null) {
            instance = new VirtualMemory();
        }
        return instance;
    }

    public static void resetInstance() {
        instance = new VirtualMemory();
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

    public Integer getConstIntCount() {
        return constIntCount;
    }

    public Integer getConstFloatCount() {
        return constFloatCount;
    }

    public Integer getConstStringCount() {
        return constStringCount;
    }

    public Integer getConstBoolCount() {
        return constBoolCount;
    }

    public Integer getStackVariableCount() {
        return this.stackVariableCount;
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

    public void setConstIntCount(Integer constIntCount) {
        this.constIntCount = constIntCount;
    }

    public void setConstFloatCount(Integer constFloatCount) {
        this.constFloatCount = constFloatCount;
    }

    public void setConstStringCount(Integer constStringCount) {
        this.constStringCount = constStringCount;
    }

    public void setConstBoolCount(Integer constBoolCount) {
        this.constBoolCount = constBoolCount;
    }

    public void setStackVariableCount(Integer stackVariableCount) {
        this.stackVariableCount = stackVariableCount;
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

    public void addConstIntCount() {
        this.constIntCount++;
    }

    public void addConstFloatCount() {
        this.constFloatCount++;
    }

    public void addConstStringCount() {
        this.constStringCount++;
    }

    public void addConstBoolCount() {
        this.constBoolCount++;
    }

    public void addStackVariableCount() {
        this.stackVariableCount++;
    }

    public HashMap<String, Era> getEraHashMap() {
        return eraHashMap;
    }

    public Stack<Era> getEraStack() {
        return eraStack;
    }

    public Stack<Era> getSecondaryEraStack() {
        return secondaryEraStack;
    }

    public void setSecondaryEraStack(Stack<Era> secondaryEraStack) {
        this.secondaryEraStack = secondaryEraStack;
    }

    public void setEraHashMap(HashMap<String, Era> eraHashMap) {
        this.eraHashMap = eraHashMap;
    }

    public Stack<Instance> getInstanceStack() {
        return instanceStack;
    }

    public void setInstanceStack(Stack<Instance> instanceStack) {
        this.instanceStack = instanceStack;
    }

    @Override
    public String toString() {
        return "VirtualMemory{" +
                "vDirectory=" + vDirectory +
                ", vMemory=" + vMemory +
                ", quadruples=" + quadruples +
                ", eras=" + eraHashMap +
                "}";
    }
}
