package testdata.L2T.main.instructionhandle.hastargeters;

import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.AALOAD;
import org.apache.bcel.generic.Visitor;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.util.ByteSequence;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    public static void main(String[] args) throws Throwable {
        AALOAD aaload0 = new AALOAD();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        aaload0.initFromFile(bytesequence0, b0);
        ByteSequence bytesequence1 = null;
        boolean b1 = false;
        aaload0.initFromFile(bytesequence1, b1);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen0);
        aaload0.consumeStack(constantpoolgen0);
        Visitor visitor0 = null;
        aaload0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(aaload0);
        boolean b2 = instructionhandle0.hasTargeters();
    }
}

