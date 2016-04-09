package MadBasic.Semantic;

/**
 * Created by ahinojosa on 6/04/16.
 */
public class SemanticCube {

    static public Type[][][] cube =
            {
                    {
                            { Type.BOOL, Type.BOOL, Type.INT, Type.INT, Type.FALSE, Type.FALSE },
                            { Type.BOOL, Type.BOOL, Type.FLOAT, Type.FLOAT, Type.FALSE, Type.FALSE },
                            { Type.INT, Type.FLOAT, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.INT, Type.FLOAT, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE }
                    }, // Index: 0
                    {
                            { Type.FALSE, Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.BOOL, Type.BOOL, Type.FLOAT, Type.FLOAT, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FLOAT, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FLOAT, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE }
                    }, // Index: 1
                    {
                            { Type.FALSE, Type.FALSE, Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.BOOL, Type.BOOL, Type.FALSE, Type.FALSE, Type.STRING, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.STRING, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE }
                    }, // Index: 2
                    {
                            { Type.BOOL, Type.BOOL, Type.BOOL, Type.BOOL, Type.FALSE, Type.FALSE },
                            { Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE }
                    }, // Index: 3
                    {
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE }
                    }, // Index: 4
                    {
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE },
                            { Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE }
                    } // Index: 5
            };

    static public Type getCubeType(int i, int j, int k) {
        return cube[i][j][k];
    }

    static public void printCube(){

        String output = "{\n";

        // Level [x][][]
        for(int i = 0; i < 6; i++){
            output += "\t{\n";

            // Level [][x][]
            for(int j = 0; j < 6; j++){
                output +="\t\t{";
                for(int k = 0; k < 6; k++){
                    output += " " + cube[i][j][k];

                    if(k != 5){
                        output += ",";
                    } else {
                        output += " ";
                    }
                }

                if(j != 5){
                    output += "},\n";
                } else {
                    output += "}\n";
                }
            }

            if(i != 5){
                output += "\t}, // Index: " + i +"\n";
            } else {
                output += "\t} // Index: " + i +"\n";
            }

        }

        output += "};";
        System.out.println(output);
    }
}
