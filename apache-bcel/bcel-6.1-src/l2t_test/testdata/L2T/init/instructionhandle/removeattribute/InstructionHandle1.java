package testdata.L2T.init.instructionhandle.removeattribute;

import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import java.lang.Short;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.LNEG;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        LNEG lneg0 = new LNEG();
        DataOutputStream dataoutputstream0 = null;
        lneg0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = null;
        lneg0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        lneg0.consumeStack(constantpoolgen1);
        lneg0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(lneg0);
        Short s0 = 104;
        instructionhandle0.removeAttribute(s0);
    }
}

