package testdata.L2T.init.instructionhandle.addtargeter;

import org.apache.bcel.generic.IFGE;
import org.apache.bcel.generic.MONITORENTER;
import org.apache.bcel.generic.Instruction;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.IREM;
import org.apache.bcel.util.ByteSequence;
import java.lang.Byte;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        IREM irem0 = new IREM();
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        irem0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(irem0);
        MONITORENTER monitorenter0 = new MONITORENTER();
        InstructionHandle instructionhandle1 = new InstructionHandle(monitorenter0);
        int i0 = -1;
        instructionhandle1.setI_position(i0);
        Byte byte0 = 45;
        instructionhandle1.removeAttribute(byte0);
        Instruction instruction0 = null;
        instructionhandle1.setInstruction(instruction0);
        IFGE ifge0 = new IFGE(instructionhandle1);
        instructionhandle0.addTargeter(ifge0);
    }
}

