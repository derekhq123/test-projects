package testdata.L2T.result.instructionhandle.swapinstruction;

import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.Instruction;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.INEG;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        ISHL ishl0 = new ISHL();
        ishl0.copy();
        ishl0.copy();
        ishl0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(ishl0);
        INEG ineg0 = new INEG();
        Instruction instruction0 = instructionhandle0.swapInstruction(ineg0);
    }
}
