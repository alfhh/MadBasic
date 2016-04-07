package MadBasic;

/**
 * Created by ahinojosa on 6/04/16.
 */
public class SemanticCube {

    static public Type[][][] cube =
            {
                    {
                            {Type.BOOL, Type.BOOL, Type.INT, Type.INT, Type.FALSE, Type.FALSE},
                            {Type.BOOL, Type.BOOL, Type.FLOAT, Type.FLOAT, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE}
                    }, // Index: 0
                    {
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.BOOL, Type.BOOL, Type.FLOAT, Type.FLOAT, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE}
                    }, // Index: 1
                    {
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.BOOL, Type.BOOL, Type.FALSE, Type.FALSE, Type.STRING, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE}
                    }, // Index: 2
                    {
                            {Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.BOOL, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE}
                    }, // Index: 3
                    {
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE}
                    }, // Index: 4
                    {
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE},
                            {Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE, Type.FALSE}
                    } // Index: 5
            };

    static public Type getCubeType(int i, int j, int k) {
        return cube[i][j][k];
    }
}
