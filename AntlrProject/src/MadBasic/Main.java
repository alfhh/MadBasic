package MadBasic;


import MadBasic.IDE.MainIDE;
import MadBasic.VMachine.Machine;

/**
 * Created by lsanchez on 3/9/16.
 */
public class Main  {


    public static void main(String [] args){
        MainIDE ide = MainIDE.getInstance();
        Machine vmachine = Machine.getInstance();
    }
}
