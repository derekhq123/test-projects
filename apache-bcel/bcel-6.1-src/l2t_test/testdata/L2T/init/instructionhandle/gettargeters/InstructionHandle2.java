package testdata.L2T.init.instructionhandle.gettargeters;

import org.apache.bcel.generic.IMUL;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.InstructionTargeter;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        IMUL imul0 = new IMUL();
        byte[] arr0 = new byte[2];
        byte byte0 = -42;
        arr0[0] = byte0;
        byte byte1 = 79;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        imul0.initFromFile(bytesequence0, b0);
        imul0.copy();
        ByteSequence bytesequence1 = null;
        boolean b1 = false;
        imul0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle0 = new InstructionHandle(imul0);
        InstructionTargeter[] arr1 = instructionhandle0.getTargeters();
    }
}

