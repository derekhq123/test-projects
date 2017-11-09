package testdata.L2T.init.instructionhandle.getprev;

import org.apache.bcel.generic.LADD;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        LADD ladd0 = new LADD();
        InstructionHandle instructionhandle0 = new InstructionHandle(ladd0);
        InstructionHandle instructionhandle1 = instructionhandle0.getPrev();
    }
}

