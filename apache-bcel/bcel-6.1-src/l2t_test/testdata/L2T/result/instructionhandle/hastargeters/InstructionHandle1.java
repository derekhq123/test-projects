package testdata.L2T.result.instructionhandle.hastargeters;

import java.util.HashSet;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.LMUL;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        LMUL lmul0 = new LMUL();
        byte[] arr0 = new byte[2];
        byte byte0 = -55;
        arr0[0] = byte0;
        byte byte1 = -37;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        lmul0.initFromFile(bytesequence0, b0);
        lmul0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(lmul0);
        HashSet hashset0 = new HashSet();
        boolean b1 = instructionhandle0.hasTargeters();
    }
}

