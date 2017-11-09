package testdata.L2T.main.instructionhandle.getattribute;

import org.apache.bcel.generic.IMUL;
import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import java.lang.Long;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.Object;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    public static void main(String[] args) throws Throwable {
        Long l0 = -999l;
        IMUL imul0 = new IMUL();
        imul0.copy();
        DataOutputStream dataoutputstream0 = null;
        imul0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = null;
        imul0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream1 = null;
        imul0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(imul0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }
}

