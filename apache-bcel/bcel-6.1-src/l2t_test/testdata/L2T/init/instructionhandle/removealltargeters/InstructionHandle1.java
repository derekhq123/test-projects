package testdata.L2T.init.instructionhandle.removealltargeters;

import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Visitor;
import org.junit.Test;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;
import org.apache.bcel.generic.IRETURN;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        IRETURN ireturn0 = new IRETURN();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "WYxQ";
        constantpoolgen0.lookupClass(str0);
        Constant[] arr0 = null;
        constantpoolgen0.setConstants(arr0);
        String str1 = "LvXbYcN";
        String str2 = "HCxdpq";
        String str3 = "hjFggY";
        constantpoolgen0.lookupMethodref(str1, str2, str3);
        int i0 = 41;
        constantpoolgen0.addInteger(i0);
        String str4 = "rTZr";
        constantpoolgen0.lookupClass(str4);
        String str5 = "rlzDq";
        String str6 = "";
        constantpoolgen0.lookupNameAndType(str5, str6);
        ireturn0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        ireturn0.dump(dataoutputstream0);
        Visitor visitor0 = null;
        ireturn0.accept(visitor0);
        ireturn0.copy();
        Visitor visitor1 = null;
        ireturn0.accept(visitor1);
        InstructionHandle instructionhandle0 = new InstructionHandle(ireturn0);
        instructionhandle0.removeAllTargeters();
    }
}

