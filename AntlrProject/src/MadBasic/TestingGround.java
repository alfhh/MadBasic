package MadBasic;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Variable;
import MadBasic.Quadruples.Quadruple;
import MadBasic.Quadruples.QuadrupleSemantic;
import MadBasic.Semantic.BasicSemantic;
import MadBasic.Semantic.Methods.Procedure;
import MadBasic.Semantic.Scope;
import MadBasic.Semantic.SemanticCube;
import MadBasic.VMemory.Era;
import MadBasic.VMemory.Instance;
import MadBasic.VMemory.VirtualMemory;

import java.util.*;

/**
 * Created by ahinojosa on 7/04/16.
 * <p>
 * The purpose of this class is to help the testing process
 */
public class TestingGround {

    SemanticCube cube;
    BasicSemantic basicSemantic;
    QuadrupleSemantic quadrupleSemantic;
    VirtualMemory virtualMemory;

    public TestingGround() {
        this.cube = new SemanticCube();
        this.basicSemantic = BasicSemantic.getInstance();
        this.quadrupleSemantic = QuadrupleSemantic.getInstance();
        this.virtualMemory = VirtualMemory.getInstance();
    }

    /**
     * ID: 1
     * Function that prints the table of variables..
     */
    public void printVariableTable() {
        System.out.println("------------------------------------------------");
        System.out.println("Tabla de variables");
        for (Variable variable : basicSemantic.getVariables()) {
            System.out.println(variable);
        }
        System.out.println();
        System.out.println("Directorio de variables");
        Collection<Integer> valuess = virtualMemory.getvDirectory().values();
        Object[] values = valuess.toArray();
        Arrays.sort(values);
        for (Object value : values) {
            Object keys[] = virtualMemory.getvDirectory().keySet().toArray();
            Object key = "";
            for (int i = 0; i < keys.length; i++) {
                if (value == virtualMemory.getvDirectory().get(keys[i])) {
                    key = keys[i];
                    break;
                }
            }
            System.out.println(key + ": " + value);
            if ((Integer) value < 1000 && (Integer) value >= 0) {
                System.out.println("Begin Obj---------------------------");
                for (String k : ((Instance) virtualMemory.getvMemory().get(value)).getvDirectory().keySet()) {
                    Integer v = ((Instance) virtualMemory.getvMemory().get(value)).getvDirectory().get(k);
                    System.out.println(k + ": " + v);
                }
                System.out.println("End Obj--------------------------");
            }
        }
        System.out.println();
        System.out.println("Memoria Virtual");
        Set<Integer> keys = virtualMemory.getvMemory().keySet();
        Object ks[] = keys.toArray();
        Arrays.sort(ks);
        for (Object key : ks) {
            System.out.println(key + ": " + virtualMemory.getvMemory().get(key));
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 2
     * Function that prints the table of scopes
     */
    public void printScopeTable() {
        System.out.println("------------------------------------------------");
        System.out.println("Tabla de Scopes");
        for (Scope scope : basicSemantic.getScopes()) {
            System.out.println(scope);
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 3
     * Function that prints the table of processes
     */
    public void printProcTable() {
        System.out.println("------------------------------------------------");
        System.out.println("Tabla de procedimientos");
        for (Procedure procedure : basicSemantic.getProcedures()) {
            System.out.println(procedure);
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 4
     * Run the basic tests on the Semantic Cube
     */
    public void testSemanticCube() {
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
    public void printOperandStack() {
        System.out.println("------------------------------------------------");
        System.out.println("Operand Stack: ");
        for (Operand op : quadrupleSemantic.getOperandStack()) {
            System.out.println(op.toString());
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 6
     * Function that prints the quadruple list of the QuadrupleSemantic class
     */
    public void printQuadruplelist() {
        System.out.println("------------------------------------------------");
        System.out.println("Quadruple List: ");
        int count = 0;
        for (Quadruple quadruple : quadrupleSemantic.getQuadrupleList()) {
            System.out.println(count + "\t" + quadruple.toString());
            count++;
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 7
     * Function that prints the Operand list of the QuadrupleSemantic class
     */
    public void printOperandlist() {
        System.out.println("------------------------------------------------");
        System.out.println("Operand List: ");
        for (Operand op : quadrupleSemantic.getOperandSList()) {
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
     * ID: 9
     */
    public void printEras() {
        System.out.println("------------------------------------------------");
        System.out.println("Eras: ");
        Set<String> keys = virtualMemory.getEraHashMap().keySet();
        Object ks[] = keys.toArray();
        Arrays.sort(ks);
        for (Object key : ks) {
            System.out.println(key + ": " + virtualMemory.getEraHashMap().get(key));
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * ID: 10
     */
    public void printClasses() {
        System.out.println("------------------------------------------------");
        System.out.println("Classes: ");
        Set<String> keys = basicSemantic.getClassHashMap().keySet();
        Object ks[] = keys.toArray();
        Arrays.sort(ks);
        for (Object key : ks) {
            System.out.println(key + ": " + basicSemantic.getClassHashMap().get(key));
        }
        System.out.println("------------------------------------------------");
    }

    /**
     * This method run the specified tests, selected on the integer array.
     *
     * @param tests each test on this class has a id number, to run that test
     *              send its number in the array. If index 0 is sent in the array
     *              then all tests will be executed.
     */
    public void testManager(TestNum[] tests) {

        for (int i = 0; i < tests.length; i++) {
            switch (tests[i].getNum()) {
                case 0:
                    printVariableTable();
                    printScopeTable();
                    printProcTable();
                    testSemanticCube();
                    printOperandStack();
                    printOperandlist();
                    printTheSemanticCube();
                    printEras();
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
                case 9:
                    printEras();
                    break;
                case 10:
                    printClasses();
                    break;
            }
        }
    }

    public enum TestNum {
        ALL(0), VARIABLE_TABLE(1), SCOPETABLE(2), PROC_TABLE(3), SEMANTIC_CUBE_TEST(4), OPERANDSTACK(5),
        QUADRUPLELIST(6), OPERAND_LIST(7), SEMANTIC_CUBE_PRINT(8), ERAS(9), CLASSES(10);
        private int num;

        TestNum(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }
    }

}
