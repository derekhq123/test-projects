package testdata.L2T.init.instructionhandle.addhandle;

import org.apache.bcel.generic.INVOKESTATIC;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        int i0 = 1;
        INVOKESTATIC invokestatic0 = new INVOKESTATIC(i0);
        InstructionHandle instructionhandle0 = new InstructionHandle(invokestatic0);
        instructionhandle0.addHandle();
    }
}

