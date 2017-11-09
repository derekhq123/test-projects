package testdata.L2T.main.instructionhandle.setinstruction;

import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.IF_ICMPEQ;
import org.apache.bcel.generic.SIPUSH;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.MONITOREXIT;
import org.apache.bcel.generic.LSUB;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    public static void main(String[] args) throws Throwable {
        MONITOREXIT monitorexit0 = new MONITOREXIT();
        DataOutputStream dataoutputstream0 = null;
        monitorexit0.dump(dataoutputstream0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        monitorexit0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        monitorexit0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        monitorexit0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream1 = null;
        monitorexit0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(monitorexit0);
        instructionhandle0.addHandle();
        LSUB lsub0 = new LSUB();
        DataOutputStream dataoutputstream2 = null;
        lsub0.dump(dataoutputstream2);
        ConstantPoolGen constantpoolgen2 = null;
        lsub0.consumeStack(constantpoolgen2);
        ByteSequence bytesequence1 = null;
        boolean b1 = true;
        lsub0.initFromFile(bytesequence1, b1);
        ByteSequence bytesequence2 = null;
        boolean b2 = false;
        lsub0.initFromFile(bytesequence2, b2);
        instructionhandle0.setInstruction(lsub0);
        int i0 = -40;
        int i1 = -151;
        instructionhandle0.updatePosition(i0, i1);
        InstructionHandle instructionhandle1 = null;
        instructionhandle0.setIh_list(instructionhandle1);
        instructionhandle0.addHandle();
        IF_ICMPEQ if_icmpeq0 = new IF_ICMPEQ(instructionhandle0);
        short s0 = 1;
        short s1 = 0;
        SIPUSH sipush0 = new SIPUSH(s1);
        InstructionHandle instructionhandle2 = new InstructionHandle(sipush0);
        instructionhandle2.setInstruction(if_icmpeq0);
    }
}

