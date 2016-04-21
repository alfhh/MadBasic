package MadBasic.VMachine;

import MadBasic.Algrebra.Constant;
import MadBasic.Algrebra.Operand;
import MadBasic.IDE.MainIDE;
import MadBasic.Quadruples.*;
import MadBasic.Quadruples.Gotos.Goto;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by ahinojosa on 20/04/16.
 */
public class Machine {

    private static Machine instance;
    public MainIDE ideConnection;

    LinkedList<Quadruple> quadruples;
    HashMap<String, Integer> vDirectory;
    HashMap<Integer, Object> vMemory;

    private Machine(){
        quadruples = null;
        vDirectory = null;
        vMemory = null;
    }

    /**
     * Singleton
     * @return
     */
    static public Machine getInstance(){
        if(instance == null){
            instance = new Machine();
        }
        return instance;
    }

    /**
     * Get the compilation data
     * @param q
     * @param vD
     * @param vM
     */
    public void getCompiledData(LinkedList<Quadruple> q, HashMap<String, Integer> vD, HashMap<Integer, Object> vM){
        this.quadruples = q;
        this.vDirectory = vD;
        this.vMemory = vM;
    }

    /**
     * Run the program reading the values of compilation
     */
    public boolean run(){
        if(quadruples != null && vDirectory != null && vMemory != null){

            // Process all the quadruples
            for(Quadruple quadruple : quadruples){
                switch (quadruple.getClass().getName()){

                    case "MadBasic.Quadruples.Assignment":
                        proccessQuadruple((Assignment) quadruple);
                        break;

                    case "MadBasic.Quadruples.Expression":
                        proccessQuadruple((Expression) quadruple);
                        break;

                    case "MadBasic.Quadruples.Write":
                        proccessQuadruple((Write) quadruple);
                        break;
                    default:
                        return false;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * This function sets the Object of the value to the result
     *
     * @param a
     * @return
     */
    public boolean proccessQuadruple(Assignment a){
        int dirValue = vDirectory.get(Operand.getIdString(a.getValue()));
        Object value = vMemory.get(dirValue);

        int dirResult = vDirectory.get(Operand.getIdString(a.getResult()));
        vMemory.put(dirResult, value);

        return true;
    }

    public boolean proccessQuadruple(Expression e){
        int operatorCode = e.getOper().ordinal();

        // Operand 1
        int dirOp1 = vDirectory.get(Operand.getIdString(e.getOperand1()));

        //Operand 2
        int dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2()));

        // Result
        int tempDir = vDirectory.get(Operand.getIdString(e.getResult()));

        switch (operatorCode){

            case 10: // *
                int x = (int) vMemory.get(dirOp1);
                int y = (int) vMemory.get(dirOp2);
                vMemory.put(tempDir, x * y);
                break;
        }

        return true;
    }

    public boolean proccessQuadruple(Retorno r){
        return true;
    }

    public boolean proccessQuadruple(Era e){
        return true;
    }

    public boolean proccessQuadruple(Parameter p){
        return true;
    }

    public boolean proccessQuadruple(Read r){
        return true;
    }

    public boolean proccessQuadruple(Write w){
        int dir = vDirectory.get(Operand.getIdString(w.getOutput()));
        ideConnection.print((String) vMemory.get(dir));
        return true;
    }

    public boolean proccessQuadruple(Goto g){
        return true;
    }

}
