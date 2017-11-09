package testdata.L2T.main.instructionhandle.gettargeters;

import org.apache.bcel.generic.I2B;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Visitor;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionTargeter;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    public static void main(String[] args) throws Throwable {
        I2B i2b0 = new I2B();
        Visitor visitor0 = null;
        i2b0.accept(visitor0);
        ConstantPoolGen constantpoolgen0 = null;
        i2b0.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2b0);
        InstructionTargeter[] arr0 = instructionhandle0.getTargeters();
    }
}

