package MadBasic.VMemory;

import java.util.HashMap;

/**
 * Created by lsanchez on 4/28/16.
 */
public class Era {

    HashMap<String, Integer> vDirectory;
    int start;
    int retorno;

    public Era() {
        vDirectory = new HashMap<>();
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

    public void setStart(int start) {
        this.start = start;
    }

    public int getRetorno() {
        return retorno;
    }

    public void setRetorno(int retorno) {
        this.retorno = retorno;
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
