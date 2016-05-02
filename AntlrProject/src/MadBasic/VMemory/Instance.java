package MadBasic.VMemory;

import java.util.HashMap;

/**
 * Created by lsanchez on 4/17/16.
 */
public class Instance {

    HashMap<String, Integer> vDirectory;
    HashMap<String, Era> eraHashMap;

    public Instance() {
        vDirectory = new HashMap<>();
        eraHashMap = new HashMap<>();
    }

    public HashMap<String, Integer> getvDirectory() {
        return vDirectory;
    }

    public void setvDirectory(HashMap<String, Integer> vDirectory) {
        this.vDirectory = vDirectory;
    }

    public HashMap<String, Era> getEraHashMap() {
        return eraHashMap;
    }

    public void setEraHashMap(HashMap<String, Era> eraHashMap) {
        this.eraHashMap = eraHashMap;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "vDirectory=" + vDirectory +
                ", eraHashMap=" + eraHashMap +
                '}';
    }
}
