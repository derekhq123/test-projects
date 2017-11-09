package testdata.L2T.init.instructionhandle.accept;

import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.ISTORE;
import org.apache.bcel.generic.PopInstruction;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.generic.LALOAD;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        ARRAYLENGTH arraylength0 = new ARRAYLENGTH();
        InstructionHandle instructionhandle0 = new InstructionHandle(arraylength0);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        PopInstruction popinstruction0 = null;
        executionvisitor0.visitPopInstruction(popinstruction0);
        int i0 = 1;
        ISTORE istore0 = new ISTORE(i0);
        Visitor visitor0 = null;
        istore0.accept(visitor0);
        executionvisitor0.visitISTORE(istore0);
        LALOAD laload0 = new LALOAD();
        executionvisitor0.visitLALOAD(laload0);
        instructionhandle0.accept(executionvisitor0);
    }
}

