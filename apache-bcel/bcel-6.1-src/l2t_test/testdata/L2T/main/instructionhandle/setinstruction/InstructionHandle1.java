package testdata.L2T.main.instructionhandle.setinstruction;

import org.apache.bcel.generic.IMUL;
import java.io.DataOutputStream;
import org.apache.bcel.generic.LDC2_W;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    public static void main(String[] args) throws Throwable {
        IMUL imul0 = new IMUL();
        short s0 = 1;
        int i0 = 1;
        LDC2_W ldc2_w0 = new LDC2_W(i0);
        DataOutputStream dataoutputstream0 = null;
        ldc2_w0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(ldc2_w0);
        instructionhandle0.setInstruction(imul0);
    }
}

