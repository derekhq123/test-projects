package testdata.L2T.main.instructionhandle.removeattribute;

import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.IREM;
import org.apache.bcel.util.ByteSequence;
import java.lang.String;
import java.lang.Integer;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    public static void main(String[] args) throws Throwable {
        IREM irem0 = new IREM();
        ConstantPoolGen constantpoolgen0 = null;
        irem0.consumeStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        irem0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen1 = null;
        irem0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream0 = null;
        irem0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen2 = new ConstantPoolGen();
        String str0 = "xE";
        constantpoolgen2.addUtf8(str0);
        irem0.consumeStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = null;
        irem0.consumeStack(constantpoolgen3);
        ByteSequence bytesequence1 = null;
        boolean b1 = false;
        irem0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle0 = new InstructionHandle(irem0);
        Integer i0 = 1;
        instructionhandle0.removeAttribute(i0);
    }
}

