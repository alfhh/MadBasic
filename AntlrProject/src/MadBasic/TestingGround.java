package MadBasic;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Variable;
import MadBasic.Quadruples.Quadruple;
import MadBasic.Quadruples.QuadrupleSemantic;
import MadBasic.Semantic.BasicSemantic;
import MadBasic.Semantic.Methods.Procedure;
import MadBasic.Semantic.Scope;
import MadBasic.Semantic.SemanticCube;

/**
 * Created by ahinojosa on 7/04/16.
 *
 * The purpose of this class is to help the testing process
 */
public class TestingGround {

    SemanticCube cube;
    BasicSemantic basicSemantic;
    QuadrupleSemantic quadrupleSemantic;

    public TestingGround() {
        this.cube = new SemanticCube();
        this.basicSemantic = BasicSemantic.getInstance();
        this.quadrupleSemantic = QuadrupleSemantic.getInstance();
    }

    /**
     * ID: 1
     * Function that prints the table of variables..
     */
    public void printVariableTable(){
        System.out.println("------------------------------------------------");
        System.out.println("Tabla de variables");
        for (Variable variable: basicSemantic.getVariables()) {
            System.out.println(variable);
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 2
     * Function that prints the table of scopes
     */
    public void printScopeTable(){
        System.out.println("------------------------------------------------");
        System.out.println("Tabla de Scopes");
        for (Scope scope: basicSemantic.getScopes()) {
            System.out.println(scope);
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 3
     * Function that prints the table of processes
     */
    public void printProcTable(){
        System.out.println("------------------------------------------------");
        System.out.println("Tabla de procedimientos");
        for (Procedure procedure: basicSemantic.getProcedures()) {
            System.out.println(procedure);
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 4
     * Run the basic tests on the Semantic Cube
     */
    public void testSemanticCube(){
        System.out.println("------------------------------------------------");
        System.out.println("Basic semantic cube test");
        System.out.println(cube.getCubeType(0, 0, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(0, 0, 1).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(0, 0, 2).getTypeValue() + " should be: " + 0);
        System.out.println(cube.getCubeType(0, 0, 3).getTypeValue() + " should be: " + 0);
        System.out.println(cube.getCubeType(0, 1, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(0, 1, 1).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(0, 1, 2).getTypeValue() + " should be: " + 1);
        System.out.println(cube.getCubeType(0, 1, 3).getTypeValue() + " should be: " + 1);
        System.out.println(cube.getCubeType(1, 1, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(1, 1, 1).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(1, 1, 2).getTypeValue() + " should be: " + 1);
        System.out.println(cube.getCubeType(1, 1, 3).getTypeValue() + " should be: " + 1);
        System.out.println(cube.getCubeType(2, 2, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(2, 2, 1).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(2, 2, 4).getTypeValue() + " should be: " + 2);
        System.out.println(cube.getCubeType(3, 0, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(3, 1, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(3, 2, 0).getTypeValue() + " should be: " + 3);
        System.out.println(cube.getCubeType(3, 3, 0).getTypeValue() + " should be: " + 3);
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 5
     * Function that prints the operand stack of the QuadrupleSemantic class
     */
    public void printOperandStack(){
        System.out.println("------------------------------------------------");
        System.out.println("Operand Stack: ");
        for(Operand op : quadrupleSemantic.getOperandStack()){
            System.out.println(op.toString());
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 6
     * Function that prints the quadruple list of the QuadrupleSemantic class
     */
    public void printQuadruplelist(){
        System.out.println("------------------------------------------------");
        System.out.println("Quadruple List: ");
        int count = 0;
        for(Quadruple quadruple : quadrupleSemantic.getQuadrupleList()){
            System.out.println(count + "\t" + quadruple.toString());
            count++;
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 7
     * Function that prints the Operand list of the QuadrupleSemantic class
     */
    public void printOperandlist(){
        System.out.println("------------------------------------------------");
        System.out.println("Operand List: ");
        for(Operand op : quadrupleSemantic.getOperandSList()){
            System.out.println(op.toString());
        }
    }

    /**
     * ID: 8
     */
    public void printTheSemanticCube() {
        System.out.println("------------------------------------------------");
        System.out.println("Semantic Cube: ");
        cube.printCube();
        System.out.println("------------------------------------------------");
    }

    /**
     * This method run the specified tests, selected on the integer array.
     * @param tests each test on this class has a id number, to run that test
     *              send its number in the array. If index 0 is sent in the array
     *              then all tests will be executed.
     */
    public void testManager(TestNum[] tests){

        for(int i = 0; i < tests.length; i++){
            switch (tests[i].getNum()){
                case 0:
                    printVariableTable();
                    printScopeTable();
                    printProcTable();
                    testSemanticCube();
                    printOperandStack();
                    printOperandlist();
                    printTheSemanticCube();
                    break;
                case 1:
                    printVariableTable();
                    break;
                case 2:
                    printScopeTable();
                    break;
                case 3:
                    printProcTable();
                    break;
                case 4:
                    testSemanticCube();
                    break;
                case 5:
                    printOperandStack();
                    break;
                case 6:
                    printQuadruplelist();
                    break;
                case 7:
                    printOperandlist();
                    break;
                case 8:
                    printTheSemanticCube();
                    break;
            }
        }
    }

    public enum TestNum {
        ALL(0), VARIABLE_TABLE(1), SCOPETABLE(2), PROC_TABLE(3), SEMANTIC_CUBE_TEST(4), OPERANDSTACK(5),
        QUADRUPLELIST(6), OPERAND_LIST(7), SEMANTIC_CUBE_PRINT(8);
        private int num;

        TestNum(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }
    }

}
