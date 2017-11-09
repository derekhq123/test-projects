package testdata.L2T.init.instructionhandle.getposition;

import org.apache.bcel.generic.LUSHR;
import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        LUSHR lushr0 = new LUSHR();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        lushr0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "Tej";
        String str1 = "tTRwliP";
        constantpoolgen1.lookupNameAndType(str0, str1);
        String str2 = "FIeOqPdX";
        constantpoolgen1.lookupString(str2);
        Constant constant0 = null;
        ConstantPoolGen constantpoolgen2 = null;
        constantpoolgen1.addConstant(constant0, constantpoolgen2);
        lushr0.consumeStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(lushr0);
        int i0 = instructionhandle0.getPosition();
    }
}

