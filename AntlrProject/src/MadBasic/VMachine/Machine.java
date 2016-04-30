package MadBasic.VMachine;

import MadBasic.Algrebra.Variable;
import MadBasic.Quadruples.Gotos.Gosub;
import MadBasic.VMemory.Era;
import MadBasic.Algrebra.Operand;
import MadBasic.IDE.MainIDE;
import MadBasic.Quadruples.*;
import MadBasic.Quadruples.Gotos.Goto;
import MadBasic.VMemory.Instance;
import MadBasic.VMemory.VirtualMemory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;

/**
 * Created by ahinojosa on 20/04/16.
 */
public class Machine {

    private static Machine instance;
    public MainIDE ideConnection;
    public VirtualMemory virtualMemory;

    LinkedList<Quadruple> quadruples;
    HashMap<String, Integer> vDirectory;
    HashMap<Integer, Object> vMemory;

    private Machine() {
        virtualMemory = null;
        quadruples = null;
        vDirectory = null;
        vMemory = null;
    }

    /**
     * Singleton
     *
     * @return
     */
    static public Machine getInstance() {
        if (instance == null) {
            instance = new Machine();
        }
        return instance;
    }

    /**
     * Get the compilation data
     *
     * @param q
     * @param vD
     * @param vM
     */
    public void getCompiledData(LinkedList<Quadruple> q, VirtualMemory vMem, HashMap<String, Integer> vD, HashMap<Integer, Object> vM) {
        this.quadruples = q;
        this.virtualMemory = vMem;
        this.vDirectory = vD;
        this.vMemory = vM;
    }

    /**
     * Run the program reading the values of compilation
     */
    public boolean run() {
        if (quadruples != null && vDirectory != null && vMemory != null) {

            int index = 0;
            Quadruple quadruple;

            while (index < quadruples.size()) {
                quadruple = quadruples.get(index);
                switch (quadruple.getClass().getName()) {


                    // Movements
                    case "MadBasic.Quadruples.Gotos.Goto":
                        index = processGoto((Goto) quadruple);
                        break;

                    case "MadBasic.Quadruples.Retorno":
                        index = processReturn();
                        break;

                    case "MadBasic.Quadruples.Gotos.End":
                        return true;

                    case "MadBasic.Quadruples.Gotos.Gosub":
                        index = processGotoSub((Gosub) quadruple);
                        break;


                    // Era
                    case "MadBasic.Quadruples.QuadEra":
                        processBuildEra((QuadEra) quadruple);
                        break;

                    case "MadBasic.Quadruples.Parameter":
                        processParameter((Parameter) quadruple);
                        break;


                    // Operations
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

                // Avoid overwrite of the index when Goto
                if(!(quadruple instanceof  Goto) && !(quadruple instanceof  Gosub) ){
                    index++;
                }
            }
            return true;
        } else {
            return false;
        }

    }

    /**
     * Returns the jump according to a Goto
     *
     * @param g
     * @return int equal to the next Quadruple that should be executed
     */
    public int processGoto(Goto g) {
        return g.getJump();
    }

    /**
     * Function that returns the number of the first quadruple of a function, procedure.
     * This function also sets the correcto number of quadruple to return when the procedure ends.
     *
     * @param g
     * @return the number of the first quadruple of the function
     */
    public int processGotoSub(Gosub g) {
        int dir = g.getJump();
        Era temp = virtualMemory.getEraHashMap().get(g.getProcedure().getID());
        temp.setRetorno(dir);

        return temp.getStart();
    }

    /**
     * Function that pushes an Era to the stack when a function/procedure is called
     *
     * @param qE
     */
    public void processBuildEra(QuadEra qE) {
        Era e = virtualMemory.getEraHashMap().get(qE.getProcedure().getID());
        e.setvMemoryStart(virtualMemory.getStackVariableCount());
        Set<String> k = e.getvDirectory().keySet();
        Object[] keys = k.toArray();
        for (Object key : keys) {
            if(e.getvDirectory().get(key) == null){
                e.getvDirectory().put((String)key, virtualMemory.getStackVariableCount());
                virtualMemory.addStackVariableCount();
            }
        }
        virtualMemory.getEraStack().push(e);
    }

    public void processParameter(Parameter p) {
        // Add the parameter to the Era
        Operand tempOp = p.getArgument();
        int dirArg = vDirectory.get(Operand.getIdString(tempOp));
        Variable varParam = virtualMemory.getEraStack().peek().getParams().get(p.getParameterNum());
        int dirParam = virtualMemory.getEraStack().peek().getvDirectory().get(varParam.getID());
        vMemory.put(dirParam, vMemory.get(dirArg));
    }

    /**
     * Functions that pops an Era from the Stack and returns the "retorno" value of the Era
     *
     * @return the index of the next quadruple
     */
    public int processReturn() {
        virtualMemory.setStackVariableCount(virtualMemory.getEraStack().peek().getvMemoryStart());
        return virtualMemory.getEraStack().pop().getRetorno();
    }

    /**
     * This function sets the Object of the value to the result
     * @param a
     * @return
     */
    public boolean proccessQuadruple(Assignment a) {
        // TODO: 21/04/16 CHECK SPECIAL CASE OF BY REFERENCE
        int dirValue = vDirectory.get(Operand.getIdString(a.getValue()));
        Object value = vMemory.get(dirValue);

        int dirResult = vDirectory.get(Operand.getIdString(a.getResult()));
        vMemory.put(dirResult, value);

        return true;
    }

    public float doArithmeticOperation(int operatorCode, float x, float y) {
        switch (operatorCode) {
            case 8: // +
                return x + y;

            case 9: // -
                return y - x;

            case 10: // *
                return x * y;

            case 11: // /
                return y / x;

            default:
                return 0;
        }
    }

    public boolean arithmeticExpression(Expression e) {
        Integer dirOp1;
        Integer dirOp2;


        if(virtualMemory.getEraStack().isEmpty()){
            dirOp1 =  vDirectory.get(Operand.getIdString(e.getOperand1())); // Operand 1
            dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2())); //Operand 2

        } else {
            // First check if the values are present in the Era param list
            dirOp1 = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(e.getOperand1()));
            dirOp2 = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(e.getOperand2()));

            if(dirOp1 == null){
                dirOp1 =  vDirectory.get(Operand.getIdString(e.getOperand1())); // Operand 1
            }

            if(dirOp2 == null){
                dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2())); //Operand 2
            }
        }

        int tempDir = vDirectory.get(Operand.getIdString(e.getResult())); // Result

        int operatorCode = e.getOper().ordinal();
        int op1Type = e.getOperand1().getType().getTypeValue();
        int op2Type = e.getOperand2().getType().getTypeValue();
        int resultType = e.getResult().getType().getTypeValue();


        if (op1Type == 0 && op2Type == 0) { // Both integers
            int x = (int) vMemory.get(dirOp1);
            int y = (int) vMemory.get(dirOp2);

            // Math round to just get the integer part
            vMemory.put(tempDir, Math.round(doArithmeticOperation(operatorCode, x, y)));

        } else if (op1Type == 1 && op2Type == 0) { // Op1 float Op2 int
            float x = (float) vMemory.get(dirOp1);
            int y = (int) vMemory.get(dirOp2);

            if (resultType == 1) {
                vMemory.put(tempDir, Math.round(doArithmeticOperation(operatorCode, x, y)));
            } else {
                vMemory.put(tempDir, doArithmeticOperation(operatorCode, x, y));
            }

        } else if (op1Type == 0 && op2Type == 1) { // Op1 int Op2 float
            int x = (int) vMemory.get(dirOp1);
            float y = (float) vMemory.get(dirOp2);

            if (resultType == 1) {
                vMemory.put(tempDir, Math.round(doArithmeticOperation(operatorCode, x, y)));
            } else {
                vMemory.put(tempDir, doArithmeticOperation(operatorCode, x, y));
            }

        } else if (op1Type == 1 && op2Type == 1) { // Both floats
            float x = (float) vMemory.get(dirOp1);
            float y = (float) vMemory.get(dirOp2);

            // Math round to just get the integer part
            vMemory.put(tempDir, doArithmeticOperation(operatorCode, x, y));
        }

        return true;
    }

    public boolean stringConcatExpression(Expression e) {
        Integer dirOp1;
        Integer dirOp2;


        if(virtualMemory.getEraStack().isEmpty()){
            dirOp1 =  vDirectory.get(Operand.getIdString(e.getOperand1())); // Operand 1
            dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2())); //Operand 2

        } else {
            // First check if the values are present in the Era param list
            dirOp1 = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(e.getOperand1()));
            dirOp2 = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(e.getOperand2()));

            if(dirOp1 == null){
                dirOp1 =  vDirectory.get(Operand.getIdString(e.getOperand1())); // Operand 1
            }

            if(dirOp2 == null){
                dirOp2 = vDirectory.get(Operand.getIdString(e.getOperand2())); //Operand 2
            }
        }


        int tempDir = vDirectory.get(Operand.getIdString(e.getResult())); // Result

        String x = String.valueOf(vMemory.get(dirOp1));
        String y = String.valueOf(vMemory.get(dirOp2));

        vMemory.put(tempDir, x + y);

        return true;
    }

    public boolean proccessQuadruple(Expression e) {
        if (e.getOper().getValue() == 4) { // String concatenation
            stringConcatExpression(e);
        } else {
            arithmeticExpression(e);
        }

        return true;
    }

    public boolean proccessQuadruple(Retorno r) {
        return true;
    }

    public boolean proccessQuadruple(Era e) {
        return true;
    }

    public boolean proccessQuadruple(Parameter p) {
        return true;
    }

    public boolean proccessQuadruple(Read r) {
        return true;
    }

    // FIXME: 28/04/16 PRINTED IN WRONG ORDER
    public boolean proccessQuadruple(Write w) {
        ideConnection = MainIDE.getInstance();
        int dir = vDirectory.get(Operand.getIdString(w.getOutput()));
        ideConnection.print(String.valueOf(vMemory.get(dir)));
        return true;
    }

    public boolean proccessQuadruple(Goto g) {
        return true;
    }

}
