package testdata.L2T.init.instructionhandle.hastargeters;

import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.Visitor;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        short s0 = 1;
        SIPUSH sipush0 = new SIPUSH(s0);
        sipush0.copy();
        Visitor visitor0 = null;
        sipush0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(sipush0);
        boolean b0 = instructionhandle0.hasTargeters();
    }
}

