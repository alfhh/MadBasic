package MadBasic.Quadruples;

import MadBasic.Algrebra.Operand;
import MadBasic.Algrebra.Operator;

/**
 * Created by lsanchez on 4/11/16.
 */
public class Parameter extends Quadruple {
    Operand argument;
    int parameterNum;

    public Parameter(Operand argument, int parameterNum) {
        this.argument = argument;
        this.parameterNum = parameterNum;
    }

    public Operand getArgument() {
        return argument;
    }

    public void setArgument(Operand argument) {
        this.argument = argument;
    }

    public int getParameterNum() {
        return parameterNum;
    }

    public void setParameterNum(int parameterNum) {
        this.parameterNum = parameterNum;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "param" +
                ",\t" + Operand.getIdString(argument) +
                ",\t" +
                ",\t param" + parameterNum +
                '}';
    }
}
