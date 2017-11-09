package testdata.L2T.result.instructionhandle.getposition;

import org.apache.bcel.generic.I2D;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        I2D i2d0 = new I2D();
        InstructionHandle instructionhandle0 = new InstructionHandle(i2d0);
        int i0 = instructionhandle0.getPosition();
    }
}
