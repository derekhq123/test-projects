package testdata.L2T.init.instructionhandle.getnext;

import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.FieldInstruction;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.ISUB;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        ISUB isub0 = new ISUB();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        FieldInstruction fieldinstruction0 = null;
        instconstraintvisitor0.visitFieldInstruction(fieldinstruction0);
        isub0.accept(instconstraintvisitor0);
        ConstantPoolGen constantpoolgen0 = null;
        isub0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(isub0);
        InstructionHandle instructionhandle1 = instructionhandle0.getNext();
    }
}

