package testdata.L2T.init.instructionhandle.setih_list;

import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IOR;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        IOR ior0 = new IOR();
        ConstantPoolGen constantpoolgen0 = null;
        ior0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "FRiecyw";
        constantpoolgen1.addClass(str0);
        String str1 = "cTKus";
        String str2 = "uf";
        String str3 = "QOc";
        constantpoolgen1.addMethodref(str1, str2, str3);
        String str4 = "";
        String str5 = "G";
        String str6 = "T";
        constantpoolgen1.lookupMethodref(str4, str5, str6);
        double d0 = 0.01;
        constantpoolgen1.lookupDouble(d0);
        constantpoolgen1.adjustSize();
        ior0.consumeStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        ior0.consumeStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = null;
        ior0.produceStack(constantpoolgen3);
        ConstantPoolGen constantpoolgen4 = new ConstantPoolGen();
        int i0 = 0;
        constantpoolgen4.lookupInteger(i0);
        MethodGen methodgen0 = null;
        constantpoolgen4.lookupInterfaceMethodref(methodgen0);
        ior0.consumeStack(constantpoolgen4);
        ior0.copy();
        ConstantPoolGen constantpoolgen5 = new ConstantPoolGen();
        ior0.consumeStack(constantpoolgen5);
        InstructionHandle instructionhandle0 = new InstructionHandle(ior0);
        instructionhandle0.setIh_list(instructionhandle0);
    }
}

