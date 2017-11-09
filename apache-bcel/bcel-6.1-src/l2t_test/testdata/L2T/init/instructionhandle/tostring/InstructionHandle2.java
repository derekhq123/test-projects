package testdata.L2T.init.instructionhandle.tostring;

import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ISHR;
import org.junit.Test;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;
import java.lang.String;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        ISHR ishr0 = new ISHR();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "pHXgiHQ";
        constantpoolgen0.addClass(str0);
        int i0 = 55;
        constantpoolgen0.setSize(i0);
        String str1 = "PqpLkWQa";
        constantpoolgen0.lookupClass(str1);
        String str2 = "VDPEUtYSM";
        String str3 = "k";
        String str4 = "XTpDfs";
        constantpoolgen0.lookupMethodref(str2, str3, str4);
        String str5 = "";
        String str6 = "RHpV";
        constantpoolgen0.addNameAndType(str5, str6);
        ishr0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        ishr0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = new ConstantPoolGen();
        double d0 = 23.594822180641728;
        constantpoolgen2.addDouble(d0);
        String str7 = "oPQL";
        constantpoolgen2.addUtf8(str7);
        double d1 = 0.0;
        constantpoolgen2.addDouble(d1);
        Constant[] arr0 = null;
        constantpoolgen2.setConstants(arr0);
        ishr0.consumeStack(constantpoolgen2);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        ishr0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen3 = null;
        ishr0.consumeStack(constantpoolgen3);
        InstructionHandle instructionhandle0 = new InstructionHandle(ishr0);
        String str8 = instructionhandle0.toString();
    }
}

