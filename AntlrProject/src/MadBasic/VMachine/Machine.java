package MadBasic.VMachine;

import MadBasic.VMemory.Era;
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
                    case "MadBasic.Quadruples.Retorno":
                        System.out.println("On return!"); // TODO: 28/04/16 CLEAN
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
        // TODO: 21/04/16 CHECK SPECIAL CASE OF BY REFERENCE
        int dirValue = vDirectory.get(Operand.getIdString(a.getValue()));
        Object value = vMemory.get(dirValue);

        int dirResult = vDirectory.get(Operand.getIdString(a.getResult()));
        vMemory.put(dirResult, value);

        return true;
    }

    public float doArithmeticOperation(int operatorCode, float x, float y){
        switch (operatorCode){
            case 8: // +
                return x + y;

            case 9: // -
                return  y - x;

            case 10: // *
                return x * y;

            case 11: // /
                return y / x;

            default:
                return 0;
        }
    }

    public boolean arithmeticExpression(Expression e){
        int dirOp1 = vDirectory.get(Operand.getIdString(e.getOperand1())); // Operand 1
        int dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2())); //Operand 2
        int tempDir = vDirectory.get(Operand.getIdString(e.getResult())); // Result

        int operatorCode = e.getOper().ordinal();
        int op1Type = e.getOperand1().getType().getTypeValue();
        int op2Type = e.getOperand2().getType().getTypeValue();
        int resultType = e.getResult().getType().getTypeValue();


        if(op1Type == 0 && op2Type == 0){ // Both integers
            int x = (int) vMemory.get(dirOp1);
            int y = (int) vMemory.get(dirOp2);

            // Math round to just get the integer part
            vMemory.put(tempDir, Math.round(doArithmeticOperation(operatorCode, x, y)));

        } else if(op1Type == 1 && op2Type == 0){ // Op1 float Op2 int
            float x = (float) vMemory.get(dirOp1);
            int y = (int) vMemory.get(dirOp2);

            if(resultType == 1){
                vMemory.put(tempDir, Math.round(doArithmeticOperation(operatorCode, x, y)));
            } else {
                vMemory.put(tempDir, doArithmeticOperation(operatorCode, x, y));
            }

        } else if(op1Type == 0 && op2Type == 1){ // Op1 int Op2 float
            int x = (int) vMemory.get(dirOp1);
            float y = (float) vMemory.get(dirOp2);

            if(resultType == 1){
                vMemory.put(tempDir, Math.round(doArithmeticOperation(operatorCode, x, y)));
            } else {
                vMemory.put(tempDir, doArithmeticOperation(operatorCode, x, y));
            }

        } else if(op1Type == 1 && op2Type == 1){ // Both floats
            float x = (float) vMemory.get(dirOp1);
            float y = (float) vMemory.get(dirOp2);

            // Math round to just get the integer part
            vMemory.put(tempDir, doArithmeticOperation(operatorCode, x, y));
        }

        return true;
    }

    public boolean stringConcatExpression(Expression e){
        int dirOp1 = vDirectory.get(Operand.getIdString(e.getOperand1())); // Operand 1
        int dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2())); //Operand 2
        int tempDir = vDirectory.get(Operand.getIdString(e.getResult())); // Result

        String x = String.valueOf(vMemory.get(dirOp1));
        String y = String.valueOf(vMemory.get(dirOp2));

        vMemory.put(tempDir, y + x);

        return true;
    }

    public boolean proccessQuadruple(Expression e){
        if(e.getOper().getValue() == 4){ // String concatenation
            stringConcatExpression(e);
        } else {
            arithmeticExpression(e);
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

    // FIXME: 28/04/16 PRINTED IN WRONG ORDER
    public boolean proccessQuadruple(Write w){
        ideConnection = MainIDE.getInstance();
        int dir = vDirectory.get(Operand.getIdString(w.getOutput()));
        ideConnection.print(String.valueOf(vMemory.get(dir)));
        return true;
    }

    public boolean proccessQuadruple(Goto g){
        return true;
    }

}
