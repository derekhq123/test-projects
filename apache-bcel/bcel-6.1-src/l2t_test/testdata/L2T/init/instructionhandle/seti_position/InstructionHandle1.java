package testdata.L2T.init.instructionhandle.seti_position;

import org.apache.bcel.generic.MethodGen;
import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;
import org.apache.bcel.generic.MONITOREXIT;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        MONITOREXIT monitorexit0 = new MONITOREXIT();
        DataOutputStream dataoutputstream0 = null;
        monitorexit0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        float f0 = 14.656212f;
        constantpoolgen0.lookupFloat(f0);
        MethodGen methodgen0 = null;
        constantpoolgen0.addMethodref(methodgen0);
        String str0 = "IZSreK";
        constantpoolgen0.addString(str0);
        monitorexit0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(monitorexit0);
        int i0 = 0;
        instructionhandle0.setI_position(i0);
    }
}

