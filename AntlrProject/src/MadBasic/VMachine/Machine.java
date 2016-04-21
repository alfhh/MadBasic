package MadBasic.VMachine;

import MadBasic.IDE.MainIDE;

/**
 * Created by ahinojosa on 20/04/16.
 */
public class Machine {

    private static Machine instance;
    public MainIDE ideConnection;

    private Machine(){
        
    }

    // Singleton..
    static public Machine getInstance(){
        if(instance == null){
            instance = new Machine();
        }
        return instance;
    }

    public void run(){
    }
}
