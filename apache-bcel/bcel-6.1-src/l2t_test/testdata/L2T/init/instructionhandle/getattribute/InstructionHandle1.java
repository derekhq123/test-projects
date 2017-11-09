package testdata.L2T.init.instructionhandle.getattribute;

import org.apache.bcel.generic.L2D;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.Object;
import java.lang.String;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        L2D l2d0 = new L2D();
        l2d0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(l2d0);
        String str0 = "qOD";
        Object obj0 = instructionhandle0.getAttribute(str0);
    }
}

