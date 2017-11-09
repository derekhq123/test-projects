package testdata.L2T.init.instructionhandle.getattributes;

import java.io.DataOutputStream;
import org.apache.bcel.generic.I2F;
import java.util.Collection;
import org.apache.bcel.generic.Visitor;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        I2F i2f0 = new I2F();
        i2f0.copy();
        Visitor visitor0 = null;
        i2f0.accept(visitor0);
        DataOutputStream dataoutputstream0 = null;
        i2f0.dump(dataoutputstream0);
        i2f0.copy();
        DataOutputStream dataoutputstream1 = null;
        i2f0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2f0);
        Collection collection0 = instructionhandle0.getAttributes();
    }
}

