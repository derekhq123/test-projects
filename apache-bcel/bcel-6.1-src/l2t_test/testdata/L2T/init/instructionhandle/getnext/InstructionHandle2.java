package testdata.L2T.init.instructionhandle.getnext;

import org.apache.bcel.generic.IALOAD;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        IALOAD iaload0 = new IALOAD();
        InstructionHandle instructionhandle0 = new InstructionHandle(iaload0);
        InstructionHandle instructionhandle1 = instructionhandle0.getNext();
    }
}

