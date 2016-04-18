package MadBasic.VM;

import java.util.HashMap;

/**
 * Created by lsanchez on 4/17/16.
 */
public class Instance {
    HashMap<String, Integer> vDirectory;

    public Instance() {
        vDirectory = new HashMap<>();
    }

    public HashMap<String, Integer> getvDirectory() {
        return vDirectory;
    }

    public void setvDirectory(HashMap<String, Integer> vDirectory) {
        this.vDirectory = vDirectory;
    }

    @Override
    public String toString() {
        return "Instance{" +
                "vDirectory=" + vDirectory +
                '}';
    }
}
