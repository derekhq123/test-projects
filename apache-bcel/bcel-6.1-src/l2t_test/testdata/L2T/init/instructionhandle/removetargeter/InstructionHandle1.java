package testdata.L2T.init.instructionhandle.removetargeter;

import org.apache.bcel.generic.DRETURN;
import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.DUP2_X1;
import org.junit.Test;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.L2I;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        DUP2_X1 dup2_x10 = new DUP2_X1();
        ConstantPoolGen constantpoolgen0 = null;
        dup2_x10.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        dup2_x10.consumeStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = new ConstantPoolGen();
        dup2_x10.produceStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = new ConstantPoolGen();
        ObjectType objecttype0 = null;
        constantpoolgen3.addClass(objecttype0);
        Constant[] arr0 = null;
        constantpoolgen3.setConstants(arr0);
        dup2_x10.consumeStack(constantpoolgen3);
        DataOutputStream dataoutputstream0 = null;
        dup2_x10.dump(dataoutputstream0);
        dup2_x10.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dup2_x10);
        DRETURN dreturn0 = new DRETURN();
        InstructionHandle instructionhandle1 = new InstructionHandle(dreturn0);
        int i0 = 1;
        instructionhandle1.setI_position(i0);
        int i1 = -18;
        int i2 = -1;
        instructionhandle1.updatePosition(i1, i2);
        instructionhandle1.removeAllTargeters();
        JSR_W jsr_w0 = new JSR_W(instructionhandle1);
        L2I l2i0 = new L2I();
        ConstantPoolGen constantpoolgen4 = null;
        l2i0.consumeStack(constantpoolgen4);
        DataOutputStream dataoutputstream1 = null;
        l2i0.dump(dataoutputstream1);
        InstructionHandle instructionhandle2 = new InstructionHandle(l2i0);
        jsr_w0.containsTarget(instructionhandle2);
        InstructionHandle instructionhandle3 = null;
        jsr_w0.containsTarget(instructionhandle3);
        InstructionHandle instructionhandle4 = null;
        InstructionHandle instructionhandle5 = null;
        jsr_w0.updateTarget(instructionhandle4, instructionhandle5);
        instructionhandle0.removeTargeter(jsr_w0);
    }
}

