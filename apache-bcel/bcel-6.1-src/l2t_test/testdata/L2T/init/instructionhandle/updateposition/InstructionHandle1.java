package testdata.L2T.init.instructionhandle.updateposition;

import java.io.DataOutputStream;
import org.apache.bcel.generic.CHECKCAST;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        int i0 = 139;
        CHECKCAST checkcast0 = new CHECKCAST(i0);
        DataOutputStream dataoutputstream0 = null;
        checkcast0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(checkcast0);
        int i1 = -94;
        int i2 = instructionhandle0.updatePosition(i0, i1);
    }
}

