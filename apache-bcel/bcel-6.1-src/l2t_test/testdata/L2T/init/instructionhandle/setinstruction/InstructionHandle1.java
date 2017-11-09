package testdata.L2T.init.instructionhandle.setinstruction;

import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LSHL;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;
import org.apache.bcel.generic.SWAP;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        LSHL lshl0 = new LSHL();
        lshl0.copy();
        lshl0.copy();
        ConstantPoolGen constantpoolgen0 = null;
        lshl0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(lshl0);
        SWAP swap0 = new SWAP();
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "BvFzIc";
        String str1 = "TeoVK";
        String str2 = "BNbuHYAOy";
        constantpoolgen1.addMethodref(str0, str1, str2);
        String str3 = "NMBDiX";
        constantpoolgen1.lookupClass(str3);
        long l0 = 989l;
        constantpoolgen1.lookupLong(l0);
        int i0 = 0;
        constantpoolgen1.setSize(i0);
        String str4 = "BRtFtdG";
        constantpoolgen1.addClass(str4);
        String str5 = "hPM";
        constantpoolgen1.lookupString(str5);
        String str6 = "xFIhQ";
        String str7 = "";
        constantpoolgen1.lookupNameAndType(str6, str7);
        swap0.consumeStack(constantpoolgen1);
        instructionhandle0.setInstruction(swap0);
    }
}

