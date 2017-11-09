package testdata.L2T.result.instructionhandle.gettargeters;

import java.util.HashSet;
import org.apache.bcel.generic.DSUB;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.ConstantPoolGen;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.DUP;
import java.lang.Byte;
import org.apache.bcel.generic.InstructionTargeter;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        DSUB dsub0 = new DSUB();
        ConstantPoolGen constantpoolgen0 = null;
        dsub0.consumeStack(constantpoolgen0);
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        DUP dup0 = null;
        instconstraintvisitor0.visitDUP(dup0);
        dsub0.accept(instconstraintvisitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(dsub0);
        HashSet hashset0 = new HashSet();
        Byte byte0 = -39;
        hashset0.add(byte0);
        InstructionTargeter[] arr0 = instructionhandle0.getTargeters();
    }
}

