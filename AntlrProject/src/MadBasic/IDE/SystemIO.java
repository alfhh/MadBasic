package MadBasic.IDE;


/**
 * Created by ahinojosa on 20/04/16.
 */
public interface SystemIO {

    void print(String message);

    void printError(String message);

    String read(String requestMessage);


}
