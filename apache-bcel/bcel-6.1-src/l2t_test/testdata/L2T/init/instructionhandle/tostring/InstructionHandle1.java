package testdata.L2T.init.instructionhandle.tostring;

import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.BIPUSH;
import org.apache.bcel.generic.LocalVariableInstruction;
import org.apache.bcel.generic.BASTORE;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.IDIV;
import org.apache.bcel.generic.LNEG;
import org.apache.bcel.generic.L2I;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        IDIV idiv0 = new IDIV();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        LNEG lneg0 = null;
        instconstraintvisitor0.visitLNEG(lneg0);
        L2I l2i0 = null;
        instconstraintvisitor0.visitL2I(l2i0);
        BASTORE bastore0 = null;
        instconstraintvisitor0.visitBASTORE(bastore0);
        LocalVariableInstruction localvariableinstruction0 = null;
        instconstraintvisitor0.visitLocalVariableInstruction(localvariableinstruction0);
        BIPUSH bipush0 = null;
        instconstraintvisitor0.visitBIPUSH(bipush0);
        idiv0.accept(instconstraintvisitor0);
        ConstantPoolGen constantpoolgen0 = null;
        idiv0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        idiv0.produceStack(constantpoolgen1);
        idiv0.copy();
        byte[] arr0 = new byte[1];
        byte byte0 = 86;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        idiv0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(idiv0);
        String str0 = instructionhandle0.toString(b0);
    }
}

