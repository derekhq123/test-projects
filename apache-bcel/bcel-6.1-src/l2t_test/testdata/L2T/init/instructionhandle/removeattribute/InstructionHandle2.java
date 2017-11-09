package testdata.L2T.init.instructionhandle.removeattribute;

import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;
import java.lang.Byte;
import org.apache.bcel.generic.DALOAD;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        DALOAD daload0 = new DALOAD();
        ConstantPoolGen constantpoolgen0 = null;
        daload0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "nFbrYZA";
        String str1 = "s";
        String str2 = "NqFKq";
        constantpoolgen1.lookupMethodref(str0, str1, str2);
        daload0.consumeStack(constantpoolgen1);
        daload0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(daload0);
        Byte byte0 = 92;
        instructionhandle0.removeAttribute(byte0);
    }
}

