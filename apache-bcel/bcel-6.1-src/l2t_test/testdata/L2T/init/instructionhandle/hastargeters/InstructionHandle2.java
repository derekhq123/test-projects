package testdata.L2T.init.instructionhandle.hastargeters;

import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.DLOAD;
import java.lang.String;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        int i0 = 146;
        DLOAD dload0 = new DLOAD(i0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        int i1 = 50;
        constantpoolgen0.setSize(i1);
        String str0 = "";
        String str1 = "";
        String str2 = "ZhGPD";
        constantpoolgen0.lookupInterfaceMethodref(str0, str1, str2);
        long l0 = 380l;
        constantpoolgen0.lookupLong(l0);
        String str3 = "lAKJLv";
        String str4 = "vWMqc";
        constantpoolgen0.addNameAndType(str3, str4);
        dload0.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(dload0);
        boolean b0 = instructionhandle0.hasTargeters();
    }
}

