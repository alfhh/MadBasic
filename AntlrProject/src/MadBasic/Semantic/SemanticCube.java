package MadBasic.Semantic;

import MadBasic.Semantic.Types.*;

/**
 * Created by ahinojosa on 6/04/16.
 */
public class SemanticCube {

    static public Type[][][] cube =
            {
                    {
                            { new TypeBool(), new TypeBool(), new TypeInt(), new TypeInt(), new TypeFalse(), new TypeFalse() },
                            { new TypeBool(), new TypeBool(), new TypeFloat(), new TypeFloat(), new TypeFalse(), new TypeFalse() },
                            { new TypeInt(), new TypeFloat(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeInt(), new TypeFloat(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() }
                    }, // Index: 0
                    {
                            { new TypeFalse(), new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeBool(), new TypeBool(), new TypeFloat(), new TypeFloat(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFloat(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFloat(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() }
                    }, // Index: 1
                    {
                            { new TypeFalse(), new TypeFalse(), new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeBool(), new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeString(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeString(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() }
                    }, // Index: 2
                    {
                            { new TypeBool(), new TypeBool(), new TypeBool(), new TypeBool(), new TypeFalse(), new TypeFalse() },
                            { new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeBool(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() }
                    }, // Index: 3
                    {
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() }
                    }, // Index: 4
                    {
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() },
                            { new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse(), new TypeFalse() }
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
