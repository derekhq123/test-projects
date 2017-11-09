package testdata.L2T.init.instructionhandle.swapinstruction;

import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.ATHROW;
import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.Instruction;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        int i0 = 10;
        INVOKEVIRTUAL invokevirtual0 = new INVOKEVIRTUAL(i0);
        invokevirtual0.copy();
        DataOutputStream dataoutputstream0 = null;
        invokevirtual0.dump(dataoutputstream0);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        invokevirtual0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        invokevirtual0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        invokevirtual0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(invokevirtual0);
        ATHROW athrow0 = new ATHROW();
        DataOutputStream dataoutputstream1 = null;
        athrow0.dump(dataoutputstream1);
        athrow0.copy();
        ConstantPoolGen constantpoolgen2 = new ConstantPoolGen();
        int i1 = 196;
        constantpoolgen2.addInteger(i1);
        long l0 = 667l;
        constantpoolgen2.addLong(l0);
        athrow0.consumeStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = new ConstantPoolGen();
        int i2 = 99;
        constantpoolgen3.setIndex(i2);
        athrow0.produceStack(constantpoolgen3);
        Instruction instruction0 = instructionhandle0.swapInstruction(athrow0);
    }
}

