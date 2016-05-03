package MadBasic.VMemory;

/**
 * Created by ahinojosa on 1/05/16.
 */
public class ReferencePair{

    int orgDir;
    int refDir;

    public ReferencePair(int orgDir, int refDir) {
        this.orgDir = orgDir;
        this.refDir = refDir;
    }

    public int getOrgDir() {
        return orgDir;
    }

    public void setOrgDir(int orgDir) {
        this.orgDir = orgDir;
    }

    public int getRefDir() {
        return refDir;
    }

    public void setRefDir(int refDir) {
        this.refDir = refDir;
    }
}