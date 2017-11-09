package testdata.L2T.init.instructionhandle.getinstruction;

import org.apache.bcel.generic.DRETURN;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.junit.Test;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        DRETURN dreturn0 = new DRETURN();
        ConstantPoolGen constantpoolgen0 = null;
        dreturn0.consumeStack(constantpoolgen0);
        byte[] arr0 = new byte[2];
        byte byte0 = -96;
        arr0[0] = byte0;
        byte byte1 = 32;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        dreturn0.initFromFile(bytesequence0, b0);
        dreturn0.copy();
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        constantpoolgen1.adjustSize();
        int i0 = 108;
        constantpoolgen1.addInteger(i0);
        MethodGen methodgen0 = null;
        constantpoolgen1.addInterfaceMethodref(methodgen0);
        int i1 = 0;
        Constant constant0 = null;
        constantpoolgen1.setConstant(i1, constant0);
        long l0 = -622l;
        constantpoolgen1.addLong(l0);
        dreturn0.produceStack(constantpoolgen1);
        dreturn0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dreturn0);
        Instruction instruction0 = instructionhandle0.getInstruction();
    }
}

