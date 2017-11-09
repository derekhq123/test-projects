package testdata.L2T.init.instructionhandle.gettargeters;

import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.ISHR;
import org.apache.bcel.generic.Visitor;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.InstructionTargeter;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        ISHR ishr0 = new ISHR();
        ishr0.copy();
        DataOutputStream dataoutputstream0 = null;
        ishr0.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        ishr0.dump(dataoutputstream1);
        Visitor visitor0 = null;
        ishr0.accept(visitor0);
        ConstantPoolGen constantpoolgen0 = null;
        ishr0.produceStack(constantpoolgen0);
        ishr0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(ishr0);
        InstructionTargeter[] arr0 = instructionhandle0.getTargeters();
    }
}

