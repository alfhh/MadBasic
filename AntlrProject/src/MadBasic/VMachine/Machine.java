package MadBasic.VMachine;

import MadBasic.Algrebra.Constant;
import MadBasic.Algrebra.Temporal;
import MadBasic.Algrebra.Variable;
import MadBasic.Quadruples.Gotos.Gosub;
import MadBasic.Quadruples.Gotos.GotoFalse;
import MadBasic.Semantic.Types.TypeInt;
import MadBasic.VMemory.Era;
import MadBasic.Algrebra.Operand;
import MadBasic.IDE.MainIDE;
import MadBasic.Quadruples.*;
import MadBasic.Quadruples.Gotos.Goto;
import MadBasic.VMemory.ReferencePair;
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

                    case "MadBasic.Quadruples.Gotos.GotoFalse":
                        if (processGotoFalse((GotoFalse) quadruple)) { // If is false, then jump
                            index = ((GotoFalse) quadruple).getJump();
                        } else {
                            index++;
                        }
                        break;

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

                    case "MadBasic.Quadruples.Read":
                        proccessRead((Read) quadruple);
                        break;

                    // Arrays
                    case "MadBasic.Quadruples.ArrayVerify":
                        if (!processArrayVerify((ArrayVerify) quadruple)) {
                            ideConnection = MainIDE.getInstance();
                            ideConnection.printError("Index out of bounds!");
                            return false;
                        }
                        break;


                    default:
                        return false;
                }

                // Avoid overwrite of the index when Goto
                if (!(quadruple instanceof Goto) && !(quadruple instanceof Gosub) &&
                        !(quadruple instanceof GotoFalse)) {
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
     * This function returns a true if the operand is false
     *
     * @param g
     * @return
     */
    public boolean processGotoFalse(GotoFalse g) {

        //int dirOp = vDirectory .get(Operand.getIdString(g.getCondition()));
        int dirOp = getDirectionFromVM(g.getCondition());


        boolean val = (boolean) vMemory.get(dirOp);

        return (val) ? false : true;
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
        virtualMemory.getEraStack().push(virtualMemory.getSecondaryEraStack().pop());
        virtualMemory.getEraStack().peek().setRetorno(dir);
        return virtualMemory.getEraStack().peek().getStart();
    }

    /**
     * This function checks if the value sent is inside the bounds of the array
     *
     * @param a
     * @return
     */
    public boolean processArrayVerify(ArrayVerify a) {
        Operand op = a.getOperand();
        int value = (Integer) vMemory.get(getDirectionFromVM(op));

        if (value >= a.getStart().getValue() && value <= a.getEnd().getValue())
            return true;
        else
            return false;

    }

    /**
     * Function that pushes an Era to the stack when a function/procedure is called
     *
     * @param qE
     */
    public void processBuildEra(QuadEra qE) {
        Era e = virtualMemory.getEraHashMap().get(qE.getProcedure().getID()).clone();
        //Era e = virtualMemory.getEraHashMap().get(qE.getProcedure().getID());
        e.setvMemoryStart(virtualMemory.getStackVariableCount());
        Set<String> k = e.getvDirectory().keySet();
        Object[] keys = k.toArray();
        for (Object key : keys) {
            if (e.getvDirectory().get(key) == null) {
                e.getvDirectory().put((String) key, virtualMemory.getStackVariableCount());
                vMemory.put(virtualMemory.getStackVariableCount(), null);
                virtualMemory.addStackVariableCount();
            }
        }
        virtualMemory.getSecondaryEraStack().push(e);
    }

    public void processParameter(Parameter p) {
        // Add the parameter to the Era
        Operand tempOp = p.getArgument();
        //int dirArg = vDirectory .get(Operand.getIdString(tempOp));
        int dirArg = getDirectionFromVM(tempOp);
        Variable varParam = virtualMemory.getSecondaryEraStack().peek().getParams().get(p.getParameterNum());
        int dirParam = virtualMemory.getSecondaryEraStack().peek().getvDirectory().get(varParam.getID());
        vMemory.put(dirParam, vMemory.get(dirArg));

        // Add if param by reference
        if (varParam.isByReference()) {
            ReferencePair r = new ReferencePair(dirArg, dirParam);
            virtualMemory.getSecondaryEraStack().peek().getReferencePairList().push(r);
        }

    }

    /**
     * Functions that pops an Era from the Stack and returns the "retorno" value of the Era
     *
     * @return the index of the next quadruple
     */
    public int processReturn() {
        virtualMemory.setStackVariableCount(virtualMemory.getEraStack().peek().getvMemoryStart());

        // Check if there are values by ref, then asign the correct values
        for (ReferencePair rp : virtualMemory.getEraStack().peek().getReferencePairList()) {
            Object val = vMemory.get(rp.getRefDir());
            vMemory.put(rp.getOrgDir(), val);
        }

        return virtualMemory.getEraStack().pop().getRetorno();
    }

    /**
     * This function sets the Object of the value to the result
     *
     * @param a
     * @return
     */
    public boolean proccessQuadruple(Assignment a) {
        int dirValue = getDirectionFromVM((Operand) a.getValue());
        Object value = vMemory.get(dirValue);

        int dirResult = getDirectionFromVM((Operand) a.getResult());
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


    public int getDirectionFromVM(Operand o) {
        // TODO: 1/05/16 HANDLE IS POINTER, TEMPORAL PONITER
        Integer dir;
        if (((o instanceof Temporal) && ((Temporal) o).isPointer())) {
            if (virtualMemory.getEraStack().isEmpty()) {
                dir = (Integer) vMemory.get(vDirectory.get(Operand.getIdString(o).replace("(", "").replace(")", ""))); // Operand 1

            } else {
                // First check if the values are present in the Era param list
                dir = (Integer) vMemory.get(virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(o)
                        .replace("(", "").replace(")", "")));

                if (dir == null) {
                    dir = (Integer) vMemory.get(vDirectory.get(Operand.getIdString(o).replace("(", "").replace(")", ""))); // Operand 1
                }
            }
        } else if((o instanceof Variable) && (((Variable) o).isAddress())){
            if (virtualMemory.getEraStack().isEmpty()) {
                dir = (Integer) vMemory.get(vDirectory.get(Operand.getIdString(o).replace("@", ""))); // Operand 1

            } else {
                // First check if the values are present in the Era param list
                dir = (Integer) vMemory.get(virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(o)
                        .replace("@", "")));

                if (dir == null) {
                    dir = (Integer) vMemory.get(vDirectory.get(Operand.getIdString(o).replace("@", ""))); // Operand 1
                }
            }
            Constant<Integer> cDir = new Constant<>(dir, new TypeInt());
            if(vDirectory.containsKey(Operand.getIdString(cDir))){
                dir = vDirectory.get(Operand.getIdString(cDir));
            } else {
                vMemory.put(virtualMemory.getConstBoolCount(), cDir.getValue());
                dir = virtualMemory.getConstBoolCount();
                virtualMemory.addConstIntCount();
            }
        } else {
            if (virtualMemory.getEraStack().isEmpty()) {
                dir = vDirectory.get(Operand.getIdString(o)); // Operand 1

            } else {
                // First check if the values are present in the Era param list
                dir = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(o));

                if (dir == null) {
                    dir = vDirectory.get(Operand.getIdString(o)); // Operand 1
                }
            }
        }
        return dir;
    }

    public boolean arithmeticExpression(Expression e) {
        int dirOp1 = getDirectionFromVM(e.getOperand1());
        int dirOp2 = getDirectionFromVM(e.getOperand2());

        int tempDir = getDirectionFromVM(e.getResult()); // Result

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


        if (virtualMemory.getEraStack().isEmpty()) {
            dirOp1 = getDirectionFromVM(e.getOperand1()); // Operand 1
            dirOp2 = getDirectionFromVM(e.getOperand2()); //Operand 2

        } else {
            // First check if the values are present in the Era param list
            dirOp1 = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(e.getOperand1()));
            dirOp2 = virtualMemory.getEraStack().peek().getvDirectory().get(Operand.getIdString(e.getOperand2()));

            if (dirOp1 == null) {
                dirOp1 = getDirectionFromVM(e.getOperand1()); // Operand 1
            }

            if (dirOp2 == null) {
                dirOp2 = getDirectionFromVM(e.getOperand2()); //Operand 2
            }
        }


        int tempDir = getDirectionFromVM(e.getResult()); // Result

        String x = String.valueOf(vMemory.get(dirOp1));
        String y = String.valueOf(vMemory.get(dirOp2));

        vMemory.put(tempDir, x + y);

        return true;
    }


    /**
     * This function returns a boolean value after evaluating both operands
     * THIS FUNCTION SWAPS THE POSITION OF THE OPERAND 1 AND 2 IN ORDER TO DO THE
     * CORRECT OPERATION
     *
     * @param operatorCode
     * @param op2
     * @param op1
     * @return boolean value after evaluation
     */
    public boolean evalCondition(int operatorCode, float op2, float op1) {
        switch (operatorCode) {
            case 2:
                return op1 > op2;
            case 3:
                return op1 < op2;
            case 4:
                return op1 >= op2;
            case 5:
                return op1 <= op2;
            default:
                return false;
        }
    }

    public boolean evalAdvancedCondition(int operatorCode, float op1, float op2) {
        switch (operatorCode) {
            case 6:
                return op1 == op2;
            case 7:
                return op1 != op2;
            default:
                return false;
        }
    }

    public boolean evalAdvancedCondition(int operatorCode, boolean op1, boolean op2) {
        switch (operatorCode) {
            case 6:
                return op1 == op2;
            case 7:
                return op1 != op2;
            default:
                return false;
        }
    }

    public boolean evalAdvancedCondition(int operatorCode, String op1, String op2) {
        switch (operatorCode) {
            case 6:
                return op1.equals(op2);
            case 7:
                return !(op1.equals(op2));
            default:
                return false;
        }
    }


    public void conditionExpression(Expression e) {
        int operatorCode = e.getOper().ordinal();

        int op1Type = e.getOperand1().getType().getTypeValue();
        int op2Type = e.getOperand2().getType().getTypeValue();

        int dirOp1 = getDirectionFromVM(e.getOperand1());
        int dirOp2 = getDirectionFromVM(e.getOperand2());
        int tempDir = getDirectionFromVM(e.getResult());


        // TODO: 30/04/16 CHECK 3 == TRUE
        // TODO: 2/05/16 CHECK VALUES DIFFERENT THAN ZERO SHOULD BE TRUE

        if (operatorCode == 6 || operatorCode == 7) { // == OR !=

            if (op1Type == 0 && op2Type == 0) { // Both integers
                int x = (int) vMemory.get(dirOp1);
                int y = (int) vMemory.get(dirOp2);
                vMemory.put(tempDir, evalAdvancedCondition(operatorCode, x, y));

            } else if (op1Type == 1 && op2Type == 0) { // Op1 float Op2 int
                float x = (float) vMemory.get(dirOp1);
                int y = (int) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalAdvancedCondition(operatorCode, x, y));


            } else if (op1Type == 0 && op2Type == 1) { // Op1 int Op2 float
                int x = (int) vMemory.get(dirOp1);
                float y = (float) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalAdvancedCondition(operatorCode, x, y));


            } else if (op1Type == 1 && op2Type == 1) { // Both floats
                float x = (float) vMemory.get(dirOp1);
                float y = (float) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalAdvancedCondition(operatorCode, x, y));

            } else if (op1Type == 2 && op2Type == 2) { // Both Strings
                String x = (String) vMemory.get(dirOp1);
                String y = (String) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalAdvancedCondition(operatorCode, x, y));

            } else if (op1Type == 3 && op2Type == 3) { // Both booleans
                boolean x = (boolean) vMemory.get(dirOp1);
                boolean y = (boolean) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalAdvancedCondition(operatorCode, x, y));
            }

        } else { // <, <=, >, >=

            if (op1Type == 0 && op2Type == 0) { // Both integers
                int x = (int) vMemory.get(dirOp1);
                int y = (int) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalCondition(operatorCode, x, y));

            } else if (op1Type == 1 && op2Type == 0) { // Op1 float Op2 int
                float x = (float) vMemory.get(dirOp1);
                int y = (int) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalCondition(operatorCode, x, y));


            } else if (op1Type == 0 && op2Type == 1) { // Op1 int Op2 float
                int x = (int) vMemory.get(dirOp1);
                float y = (float) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalCondition(operatorCode, x, y));


            } else if (op1Type == 1 && op2Type == 1) { // Both floats
                float x = (float) vMemory.get(dirOp1);
                float y = (float) vMemory.get(dirOp2);

                vMemory.put(tempDir, evalCondition(operatorCode, x, y));

            }

        }

    }

    public boolean proccessQuadruple(Expression e) {
        if (e.getOper().getValue() == 0) {
            andOrCondition(e);
        } else if (e.getOper().getValue() == 1) { // >, <, ==, != operations
            conditionExpression(e);
        } else if (e.getOper().getValue() == 4) { // String concatenation
            stringConcatExpression(e);
        } else {
            arithmeticExpression(e);
        }

        return true;
    }

    public void andOrCondition(Expression e) {
        int dirOp1 = getDirectionFromVM(e.getOperand1());
        int dirOp2 = getDirectionFromVM(e.getOperand2());

        int tempDir = getDirectionFromVM(e.getResult()); // Result
        int operatorCode = e.getOper().ordinal();

        boolean op1 = (Boolean) vMemory.get(dirOp1);
        boolean op2 = (Boolean) vMemory.get(dirOp2);

        if (operatorCode == 0) {
            vMemory.put(tempDir, op1 && op2);
        } else {
            vMemory.put(tempDir, op1 || op2);
        }

    }

    public boolean proccessQuadruple(Write w) {
        ideConnection = MainIDE.getInstance();
        int dir = getDirectionFromVM(w.getOutput());
        ideConnection.print(String.valueOf(vMemory.get(dir)));
        return true;
    }

    public void proccessRead(Read r) {
        ideConnection = MainIDE.getInstance();
        String value = ideConnection.read("Input var");

        int dirResult = getDirectionFromVM(r.getValue());

        // Int = 0 Float = 1 Boolean = 2
        int type = r.getValue().getType().getTypeValue();


        switch (type) {
            case 0:
                vMemory.put(dirResult, new Integer(value));
                break;
            case 1:
                vMemory.put(dirResult, new Float(value));
                break;
            case 2:
                vMemory.put(dirResult, new Boolean(value));
                break;
        }


    }

    public boolean proccessQuadruple(Goto g) {
        return true;
    }

}
