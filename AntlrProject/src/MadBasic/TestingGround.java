package MadBasic;

/**
 * Created by ahinojosa on 7/04/16.
 *
 * The purpose of this class is to help the testing process
 */
public class TestingGround {

    SemanticCube cube;
    BasicSemantic basicSemantic;

    public TestingGround() {
        this.cube = new SemanticCube();
        this.basicSemantic = BasicSemantic.getInstance();
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
        System.out.println(cube.getCubeType(0, 0, 0).getTypeValue());
        System.out.println(cube.getCubeType(0, 0, 1).getTypeValue());
        System.out.println(cube.getCubeType(0, 0, 2).getTypeValue());
        System.out.println(cube.getCubeType(0, 0, 3).getTypeValue());
        System.out.println(cube.getCubeType(0, 1, 0).getTypeValue());
        System.out.println(cube.getCubeType(0, 1, 1).getTypeValue());
        System.out.println(cube.getCubeType(0, 1, 2).getTypeValue());
        System.out.println(cube.getCubeType(0, 1, 3).getTypeValue());
        System.out.println(cube.getCubeType(1, 1, 0).getTypeValue());
        System.out.println(cube.getCubeType(1, 1, 1).getTypeValue());
        System.out.println(cube.getCubeType(1, 1, 2).getTypeValue());
        System.out.println(cube.getCubeType(1, 1, 3).getTypeValue());
        System.out.println(cube.getCubeType(2, 2, 0).getTypeValue());
        System.out.println(cube.getCubeType(2, 2, 1).getTypeValue());
        System.out.println(cube.getCubeType(2, 2, 4).getTypeValue());
        System.out.println(cube.getCubeType(3, 0, 0).getTypeValue());
        System.out.println(cube.getCubeType(3, 1, 0).getTypeValue());
        System.out.println(cube.getCubeType(3, 2, 0).getTypeValue());
        System.out.println(cube.getCubeType(3, 3, 0).getTypeValue());
        System.out.println("------------------------------------------------");
    }

    /**
     * This method run the specified tests, selected on the integer array.
     * @param tests each test on this class has a id number, to run that test
     *              send its number in the array. If index 0 is sent in the array
     *              then all tests will be executed.
     */
    public void testManager(int[] tests){

        for(int i = 0; i < tests.length; i++){
            switch (tests[i]){
                case 0:
                    printVariableTable();
                    printScopeTable();
                    printProcTable();
                    testSemanticCube();
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
            }
        }
    }
}
