package testdata.L2T.result.instructionhandle.setinstruction;

import org.apache.bcel.generic.I2S;
import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.LXOR;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.LAND;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.DSTORE;
import org.apache.bcel.generic.LLOAD;
import org.apache.bcel.generic.FASTORE;
import java.io.DataOutputStream;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.IALOAD;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.LOOKUPSWITCH;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.SWAP;
import org.apache.bcel.generic.IADD;
import org.apache.bcel.generic.DUP_X1;
import org.apache.bcel.generic.DUP_X2;
import org.apache.bcel.generic.FADD;
import org.apache.bcel.generic.GETFIELD;
import org.apache.bcel.generic.LocalVariableInstruction;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.FCMPG;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.IF_ICMPLE;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.LADD;
import org.apache.bcel.generic.DUP2;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.MONITOREXIT;
import org.apache.bcel.generic.FSUB;
import org.apache.bcel.generic.FALOAD;
import org.apache.bcel.generic.IF_ICMPGT;
import org.apache.bcel.generic.NEWARRAY;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.DCMPG;
import java.lang.String;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.POP2;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.LNEG;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.FRETURN;
import org.junit.Test;
import org.apache.bcel.generic.IXOR;
import org.apache.bcel.generic.F2D;
import org.apache.bcel.generic.L2D;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.generic.F2L;
import org.apache.bcel.generic.L2F;
import org.apache.bcel.generic.FSTORE;

@SuppressWarnings("deprecation")
public class InstructionHandle3 {

    @Test
    public void test1() throws Throwable {
        FALOAD faload0 = new FALOAD();
        short s0 = 8;
        int i0 = 1;
        LLOAD lload0 = new LLOAD(i0);
        lload0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(lload0);
        MONITOREXIT monitorexit0 = new MONITOREXIT();
        instructionhandle0.setInstruction(monitorexit0);
        instructionhandle0.setInstruction(faload0);
    }

    @Test
    public void test2() throws Throwable {
        DUP_X1 dup_x10 = new DUP_X1();
        short s0 = 18;
        byte byte0 = -25;
        NEWARRAY newarray0 = new NEWARRAY(byte0);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        newarray0.initFromFile(bytesequence0, b0);
        Visitor visitor0 = null;
        newarray0.accept(visitor0);
        DataOutputStream dataoutputstream0 = null;
        newarray0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(newarray0);
        instructionhandle0.setInstruction(dup_x10);
    }

    @Test
    public void test3() throws Throwable {
        FADD fadd0 = new FADD();
        short s0 = 80;
        F2L f2l0 = new F2L();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.addMethodref(methodgen0);
        MethodGen methodgen1 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen1);
        f2l0.produceStack(constantpoolgen0);
        Visitor visitor0 = null;
        f2l0.accept(visitor0);
        Visitor visitor1 = null;
        f2l0.accept(visitor1);
        f2l0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(f2l0);
        MONITOREXIT monitorexit0 = new MONITOREXIT();
        instructionhandle0.setInstruction(monitorexit0);
        instructionhandle0.setInstruction(fadd0);
    }

    @Test
    public void test4() throws Throwable {
        FASTORE fastore0 = new FASTORE();
        short s0 = -93;
        IASTORE iastore0 = new IASTORE();
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        iastore0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(iastore0);
        instructionhandle0.setInstruction(fastore0);
    }

    @Test
    public void test5() throws Throwable {
        BREAKPOINT breakpoint0 = new BREAKPOINT();
        short s0 = 12;
        POP2 pop20 = new POP2();
        pop20.copy();
        pop20.copy();
        ConstantPoolGen constantpoolgen0 = null;
        pop20.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(pop20);
        int i0 = 113;
        INVOKEDYNAMIC invokedynamic0 = new INVOKEDYNAMIC(i0);
        instructionhandle0.setInstruction(invokedynamic0);
        instructionhandle0.setInstruction(breakpoint0);
    }

    @Test
    public void test6() throws Throwable {
        LCMP lcmp0 = new LCMP();
        short s0 = 41;
        IMPDEP2 impdep20 = new IMPDEP2();
        impdep20.copy();
        DataOutputStream dataoutputstream0 = null;
        impdep20.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        impdep20.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        impdep20.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        impdep20.produceStack(constantpoolgen2);
        InstructionHandle instructionhandle0 = new InstructionHandle(impdep20);
        LXOR lxor0 = new LXOR();
        instructionhandle0.setInstruction(lxor0);
        instructionhandle0.setInstruction(lcmp0);
    }

    @Test
    public void test7() throws Throwable {
        L2F l2f0 = new L2F();
        short s0 = -4;
        I2S i2s0 = new I2S();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        ACONST_NULL aconst_null0 = null;
        instconstraintvisitor0.visitACONST_NULL(aconst_null0);
        F2D f2d0 = null;
        instconstraintvisitor0.visitF2D(f2d0);
        i2s0.accept(instconstraintvisitor0);
        DataOutputStream dataoutputstream0 = null;
        i2s0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "VzCQFpWGj";
        constantpoolgen0.addUtf8(str0);
        String str1 = "xmWTeHf";
        String str2 = "";
        String str3 = "F";
        constantpoolgen0.lookupFieldref(str1, str2, str3);
        String str4 = "tj";
        String str5 = "rwn";
        constantpoolgen0.lookupNameAndType(str4, str5);
        double d0 = 92.35019028030305;
        constantpoolgen0.addDouble(d0);
        float f0 = 0.01f;
        constantpoolgen0.lookupFloat(f0);
        String str6 = "Dz";
        constantpoolgen0.addClass(str6);
        i2s0.produceStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        i2s0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2s0);
        DUP2 dup20 = new DUP2();
        instructionhandle0.setInstruction(dup20);
        instructionhandle0.setInstruction(l2f0);
    }

    @Test
    public void test8() throws Throwable {
        FALOAD faload0 = new FALOAD();
        short s0 = 49;
        FCMPG fcmpg0 = new FCMPG();
        fcmpg0.copy();
        ConstantPoolGen constantpoolgen0 = null;
        fcmpg0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(fcmpg0);
        instructionhandle0.setInstruction(faload0);
    }

    @Test
    public void test9() throws Throwable {
        CALOAD caload0 = new CALOAD();
        short s0 = 1;
        int i0 = 1;
        GETFIELD getfield0 = new GETFIELD(i0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        getfield0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        getfield0.consumeStack(constantpoolgen1);
        getfield0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(getfield0);
        I2S i2s0 = new I2S();
        instructionhandle0.setInstruction(i2s0);
        instructionhandle0.setInstruction(caload0);
    }

    @Test
    public void test10() throws Throwable {
        short s0 = -179;
        SIPUSH sipush0 = new SIPUSH(s0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        sipush0.initFromFile(bytesequence0, b0);
        Visitor visitor0 = null;
        sipush0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(sipush0);
        IF_ICMPGT if_icmpgt0 = new IF_ICMPGT(instructionhandle0);
        short s1 = 82;
        DUP_X2 dup_x20 = new DUP_X2();
        InstructionHandle instructionhandle1 = new InstructionHandle(dup_x20);
        instructionhandle1.setInstruction(if_icmpgt0);
    }

    @Test
    public void test11() throws Throwable {
        NOP nop0 = new NOP();
        short s0 = 77;
        IXOR ixor0 = new IXOR();
        Visitor visitor0 = null;
        ixor0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(ixor0);
        instructionhandle0.setInstruction(nop0);
    }

    @Test
    public void test12() throws Throwable {
        BREAKPOINT breakpoint0 = new BREAKPOINT();
        short s0 = 23;
        IALOAD iaload0 = new IALOAD();
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        iaload0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(iaload0);
        instructionhandle0.setInstruction(breakpoint0);
    }

    @Test
    public void test13() throws Throwable {
        SWAP swap0 = new SWAP();
        short s0 = 3;
        DUP dup0 = new DUP();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        ObjectType objecttype0 = null;
        constantpoolgen0.addClass(objecttype0);
        int i0 = 0;
        Constant constant0 = null;
        constantpoolgen0.setConstant(i0, constant0);
        dup0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        dup0.consumeStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        dup0.consumeStack(constantpoolgen2);
        dup0.copy();
        ConstantPoolGen constantpoolgen3 = null;
        dup0.produceStack(constantpoolgen3);
        InstructionHandle instructionhandle0 = new InstructionHandle(dup0);
        instructionhandle0.setInstruction(swap0);
    }

    @Test
    public void test14() throws Throwable {
        int i0 = 171;
        FSTORE fstore0 = new FSTORE(i0);
        short s0 = 73;
        LNEG lneg0 = new LNEG();
        byte[] arr0 = new byte[1];
        byte byte0 = 39;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        lneg0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        long l0 = 1l;
        constantpoolgen0.lookupLong(l0);
        String str0 = "RaJI";
        String str1 = "";
        String str2 = "ccfVJgLN";
        constantpoolgen0.addFieldref(str0, str1, str2);
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupInterfaceMethodref(methodgen0);
        MethodGen methodgen1 = null;
        constantpoolgen0.lookupMethodref(methodgen1);
        float f0 = 66.5132f;
        constantpoolgen0.addFloat(f0);
        String str3 = "DCBBJ";
        constantpoolgen0.addClass(str3);
        ObjectType objecttype0 = null;
        constantpoolgen0.addClass(objecttype0);
        lneg0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        lneg0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(lneg0);
        instructionhandle0.setInstruction(fstore0);
    }

    @Test
    public void test15() throws Throwable {
        FASTORE fastore0 = new FASTORE();
        short s0 = 47;
        DREM drem0 = new DREM();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        double d0 = 0.0;
        constantpoolgen0.addDouble(d0);
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupInterfaceMethodref(methodgen0);
        Constant constant0 = null;
        ConstantPoolGen constantpoolgen1 = null;
        constantpoolgen0.addConstant(constant0, constantpoolgen1);
        drem0.produceStack(constantpoolgen0);
        drem0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(drem0);
        instructionhandle0.setInstruction(fastore0);
    }

    @Test
    public void test16() throws Throwable {
        int i0 = 0;
        INVOKESTATIC invokestatic0 = new INVOKESTATIC(i0);
        short s0 = 5;
        NOP nop0 = new NOP();
        nop0.copy();
        Visitor visitor0 = null;
        nop0.accept(visitor0);
        ConstantPoolGen constantpoolgen0 = null;
        nop0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(nop0);
        instructionhandle0.setInstruction(invokestatic0);
    }

    @Test
    public void test17() throws Throwable {
        FRETURN freturn0 = new FRETURN();
        short s0 = 49;
        ARETURN areturn0 = new ARETURN();
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        areturn0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        areturn0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(areturn0);
        FRETURN freturn1 = new FRETURN();
        instructionhandle0.setInstruction(freturn1);
        instructionhandle0.setInstruction(freturn0);
    }

    @Test
    public void test18() throws Throwable {
        DUP dup0 = new DUP();
        short s0 = 72;
        int i0 = 90;
        FLOAD fload0 = new FLOAD(i0);
        InstructionHandle instructionhandle0 = new InstructionHandle(fload0);
        IADD iadd0 = new IADD();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        iadd0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        iadd0.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle1 = new InstructionHandle(iadd0);
        DCMPG dcmpg0 = new DCMPG();
        DataOutputStream dataoutputstream0 = null;
        dcmpg0.dump(dataoutputstream0);
        dcmpg0.copy();
        DataOutputStream dataoutputstream1 = null;
        dcmpg0.dump(dataoutputstream1);
        InstructionHandle instructionhandle2 = new InstructionHandle(dcmpg0);
        Instruction instruction0 = null;
        instructionhandle2.setInstruction(instruction0);
        instructionhandle1.setIh_list(instructionhandle2);
        int i1 = 0;
        instructionhandle1.setI_position(i1);
        Visitor visitor0 = null;
        instructionhandle1.accept(visitor0);
        instructionhandle1.removeAllTargeters();
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        L2D l2d0 = null;
        executionvisitor0.visitL2D(l2d0);
        SIPUSH sipush0 = null;
        executionvisitor0.visitSIPUSH(sipush0);
        LOOKUPSWITCH lookupswitch0 = null;
        executionvisitor0.visitLOOKUPSWITCH(lookupswitch0);
        LOOKUPSWITCH lookupswitch1 = null;
        executionvisitor0.visitLOOKUPSWITCH(lookupswitch1);
        MONITOREXIT monitorexit0 = null;
        executionvisitor0.visitMONITOREXIT(monitorexit0);
        LocalVariableInstruction localvariableinstruction0 = null;
        executionvisitor0.visitLocalVariableInstruction(localvariableinstruction0);
        instructionhandle1.accept(executionvisitor0);
        IF_ICMPLE if_icmple0 = new IF_ICMPLE(instructionhandle1);
        instructionhandle0.setInstruction(if_icmple0);
        instructionhandle0.setInstruction(dup0);
    }

    @Test
    public void test19() throws Throwable {
        SWAP swap0 = new SWAP();
        short s0 = 81;
        int i0 = 126;
        DSTORE dstore0 = new DSTORE(i0);
        DataOutputStream dataoutputstream0 = null;
        dstore0.dump(dataoutputstream0);
        dstore0.copy();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        dstore0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        dstore0.produceStack(constantpoolgen0);
        dstore0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dstore0);
        float f0 = 0.0f;
        FCONST fconst0 = new FCONST(f0);
        instructionhandle0.setInstruction(fconst0);
        instructionhandle0.setInstruction(swap0);
    }

    @Test
    public void test20() throws Throwable {
        F2L f2l0 = new F2L();
        short s0 = 30;
        FSUB fsub0 = new FSUB();
        byte[] arr0 = new byte[2];
        byte byte0 = -88;
        arr0[0] = byte0;
        byte byte1 = -115;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        fsub0.initFromFile(bytesequence0, b0);
        byte[] arr1 = new byte[2];
        byte byte2 = 108;
        arr1[0] = byte2;
        byte byte3 = -12;
        arr1[1] = byte3;
        ByteSequence bytesequence1 = new ByteSequence(arr1);
        boolean b1 = true;
        fsub0.initFromFile(bytesequence1, b1);
        byte[] arr2 = new byte[1];
        byte byte4 = -119;
        arr2[0] = byte4;
        ByteSequence bytesequence2 = new ByteSequence(arr2);
        boolean b2 = false;
        fsub0.initFromFile(bytesequence2, b2);
        ConstantPoolGen constantpoolgen0 = null;
        fsub0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "";
        constantpoolgen1.addUtf8(str0);
        String str1 = "RasKGr";
        String str2 = "YICb";
        String str3 = "D";
        constantpoolgen1.addFieldref(str1, str2, str3);
        fsub0.consumeStack(constantpoolgen1);
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        LOOKUPSWITCH lookupswitch0 = null;
        instconstraintvisitor0.visitLOOKUPSWITCH(lookupswitch0);
        RET ret0 = null;
        instconstraintvisitor0.visitRET(ret0);
        LADD ladd0 = null;
        instconstraintvisitor0.visitLADD(ladd0);
        LAND land0 = null;
        instconstraintvisitor0.visitLAND(land0);
        fsub0.accept(instconstraintvisitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(fsub0);
        ARRAYLENGTH arraylength0 = new ARRAYLENGTH();
        instructionhandle0.setInstruction(arraylength0);
        instructionhandle0.setInstruction(f2l0);
    }
}

