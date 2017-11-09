package testdata.L2T.init.instructionhandle.addattribute;

import java.lang.Short;
import org.junit.Test;
import org.apache.bcel.generic.InstructionHandle;
import java.lang.String;
import org.apache.bcel.generic.IADD;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        IADD iadd0 = new IADD();
        InstructionHandle instructionhandle0 = new InstructionHandle(iadd0);
        String str0 = "qVwS";
        Short s0 = -76;
        instructionhandle0.addAttribute(str0, s0);
    }
}

