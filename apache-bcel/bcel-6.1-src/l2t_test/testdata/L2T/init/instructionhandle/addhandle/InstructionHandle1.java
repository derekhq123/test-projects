package testdata.L2T.init.instructionhandle.addhandle;

import org.apache.bcel.generic.D2F;
import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        D2F d2f0 = new D2F();
        ConstantPoolGen constantpoolgen0 = null;
        d2f0.produceStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        d2f0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream0 = null;
        d2f0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = null;
        d2f0.consumeStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(d2f0);
        instructionhandle0.addHandle();
    }
}

