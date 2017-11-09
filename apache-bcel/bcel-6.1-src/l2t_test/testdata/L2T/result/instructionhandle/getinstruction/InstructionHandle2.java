package testdata.L2T.result.instructionhandle.getinstruction;

import org.apache.bcel.generic.Instruction;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.LRETURN;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        LRETURN lreturn0 = new LRETURN();
        lreturn0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(lreturn0);
        Instruction instruction0 = instructionhandle0.getInstruction();
    }
}
