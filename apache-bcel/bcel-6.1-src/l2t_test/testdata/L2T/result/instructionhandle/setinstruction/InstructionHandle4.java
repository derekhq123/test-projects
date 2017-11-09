package testdata.L2T.result.instructionhandle.setinstruction;

import org.apache.bcel.generic.ACONST_NULL;
import org.apache.bcel.generic.LXOR;
import org.apache.bcel.generic.RETURN;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.BALOAD;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.MULTIANEWARRAY;
import org.apache.bcel.generic.IRETURN;
import org.apache.bcel.generic.IMPDEP2;
import org.apache.bcel.generic.ANEWARRAY;
import org.apache.bcel.generic.FASTORE;
import java.io.DataOutputStream;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.IFNE;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.generic.InstructionTargeter;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.DUP_X1;
import org.apache.bcel.generic.I2B;
import org.apache.bcel.generic.DUP_X2;
import org.apache.bcel.generic.GETFIELD;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.DALOAD;
import org.apache.bcel.generic.LSTORE;
import org.apache.bcel.generic.FCMPG;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.DNEG;
import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.DREM;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.INSTANCEOF;
import org.apache.bcel.generic.INVOKEVIRTUAL;
import org.apache.bcel.generic.FALOAD;
import org.apache.bcel.classfile.Constant;
import org.apache.bcel.generic.DCMPG;
import java.lang.String;
import org.apache.bcel.generic.LSHL;
import org.apache.bcel.generic.LDC_W;
import org.junit.Test;
import org.apache.bcel.generic.IXOR;
import org.apache.bcel.generic.LSHR;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.generic.IUSHR;
import org.apache.bcel.generic.F2L;
import org.apache.bcel.generic.L2I;

@SuppressWarnings("deprecation")
public class InstructionHandle4 {

    @Test
    public void test1() throws Throwable {
        F2L f2l0 = new F2L();
        short s0 = 100;
        int i0 = 18;
        INVOKESTATIC invokestatic0 = new INVOKESTATIC(i0);
        ConstantPoolGen constantpoolgen0 = null;
        invokestatic0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        invokestatic0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(invokestatic0);
        instructionhandle0.setInstruction(f2l0);
    }

    @Test
    public void test2() throws Throwable {
        F2I f2i0 = new F2I();
        short s0 = 63;
        IUSHR iushr0 = new IUSHR();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        I2C i2c0 = null;
        instconstraintvisitor0.visitI2C(i2c0);
        MULTIANEWARRAY multianewarray0 = null;
        instconstraintvisitor0.visitMULTIANEWARRAY(multianewarray0);
        GOTO_W goto_w0 = null;
        instconstraintvisitor0.visitGOTO_W(goto_w0);
        ANEWARRAY anewarray0 = null;
        instconstraintvisitor0.visitANEWARRAY(anewarray0);
        iushr0.accept(instconstraintvisitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(iushr0);
        instructionhandle0.setInstruction(f2i0);
    }

    @Test
    public void test3() throws Throwable {
        ISHL ishl0 = new ISHL();
        short s0 = 54;
        IRETURN ireturn0 = new IRETURN();
        ireturn0.copy();
        Visitor visitor0 = null;
        ireturn0.accept(visitor0);
        Visitor visitor1 = null;
        ireturn0.accept(visitor1);
        InstructionHandle instructionhandle0 = new InstructionHandle(ireturn0);
        LXOR lxor0 = new LXOR();
        instructionhandle0.setInstruction(lxor0);
        instructionhandle0.setInstruction(ishl0);
    }

    @Test
    public void test4() throws Throwable {
        I2C i2c0 = new I2C();
        short s0 = 44;
        int i0 = 24;
        LSTORE lstore0 = new LSTORE(i0);
        ConstantPoolGen constantpoolgen0 = null;
        lstore0.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(lstore0);
        instructionhandle0.setInstruction(i2c0);
    }

    @Test
    public void test5() throws Throwable {
        LSHR lshr0 = new LSHR();
        short s0 = -62;
        FALOAD faload0 = new FALOAD();
        Visitor visitor0 = null;
        faload0.accept(visitor0);
        ConstantPoolGen constantpoolgen0 = null;
        faload0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        faload0.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        faload0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(faload0);
        instructionhandle0.setInstruction(lshr0);
    }

    @Test
    public void test6() throws Throwable {
        int i0 = 186;
        PUTSTATIC putstatic0 = new PUTSTATIC(i0);
        ConstantPoolGen constantpoolgen0 = null;
        putstatic0.consumeStack(constantpoolgen0);
        Visitor visitor0 = null;
        putstatic0.accept(visitor0);
        DataOutputStream dataoutputstream0 = null;
        putstatic0.dump(dataoutputstream0);
        putstatic0.copy();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        putstatic0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream1 = null;
        putstatic0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(putstatic0);
        JSR_W jsr_w0 = new JSR_W(instructionhandle0);
        short s0 = -57;
        IXOR ixor0 = new IXOR();
        ixor0.copy();
        InstructionHandle instructionhandle1 = new InstructionHandle(ixor0);
        IUSHR iushr0 = new IUSHR();
        instructionhandle1.setInstruction(iushr0);
        instructionhandle1.setInstruction(jsr_w0);
    }

    @Test
    public void test7() throws Throwable {
        CALOAD caload0 = new CALOAD();
        DataOutputStream dataoutputstream0 = null;
        caload0.dump(dataoutputstream0);
        Visitor visitor0 = null;
        caload0.accept(visitor0);
        caload0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(caload0);
        Visitor visitor1 = null;
        instructionhandle0.accept(visitor1);
        instructionhandle0.addHandle();
        JSR_W jsr_w0 = new JSR_W(instructionhandle0);
        short s0 = -33;
        int i0 = 0;
        LDC_W ldc_w0 = new LDC_W(i0);
        DataOutputStream dataoutputstream1 = null;
        ldc_w0.dump(dataoutputstream1);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        ldc_w0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        ldc_w0.produceStack(constantpoolgen0);
        Visitor visitor2 = null;
        ldc_w0.accept(visitor2);
        InstructionHandle instructionhandle1 = new InstructionHandle(ldc_w0);
        instructionhandle1.setInstruction(jsr_w0);
    }

    @Test
    public void test8() throws Throwable {
        ACONST_NULL aconst_null0 = new ACONST_NULL();
        short s0 = -45;
        IXOR ixor0 = new IXOR();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        GETFIELD getfield0 = null;
        instconstraintvisitor0.visitGETFIELD(getfield0);
        ixor0.accept(instconstraintvisitor0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.addMethodref(methodgen0);
        String str0 = "fM";
        String str1 = "";
        String str2 = "cwVdt";
        constantpoolgen0.addInterfaceMethodref(str0, str1, str2);
        String str3 = "sYNNXTYHB";
        String str4 = "G";
        constantpoolgen0.addNameAndType(str3, str4);
        long l0 = 0l;
        constantpoolgen0.addLong(l0);
        String str5 = "Gy";
        String str6 = "muygJoltn";
        String str7 = "SJsoKDwNX";
        constantpoolgen0.addMethodref(str5, str6, str7);
        int i0 = 1;
        Constant constant0 = null;
        constantpoolgen0.setConstant(i0, constant0);
        Constant[] arr0 = null;
        constantpoolgen0.setConstants(arr0);
        ixor0.consumeStack(constantpoolgen0);
        ixor0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(ixor0);
        instructionhandle0.setInstruction(aconst_null0);
    }

    @Test
    public void test9() throws Throwable {
        InstructionHandle instructionhandle0 = null;
        IFNE ifne0 = new IFNE(instructionhandle0);
        short s0 = -57;
        LCMP lcmp0 = new LCMP();
        ConstantPoolGen constantpoolgen0 = null;
        lcmp0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        long l0 = -657l;
        constantpoolgen1.addLong(l0);
        String str0 = "oZzp";
        constantpoolgen1.addClass_(str0);
        int i0 = -1;
        Constant constant0 = null;
        constantpoolgen1.setConstant(i0, constant0);
        lcmp0.consumeStack(constantpoolgen1);
        InstructionHandle instructionhandle1 = new InstructionHandle(lcmp0);
        instructionhandle1.setInstruction(ifne0);
    }

    @Test
    public void test10() throws Throwable {
        F2I f2i0 = new F2I();
        short s0 = -23;
        int i0 = 111;
        ASTORE astore0 = new ASTORE(i0);
        astore0.copy();
        byte[] arr0 = new byte[2];
        byte byte0 = 12;
        arr0[0] = byte0;
        byte byte1 = -18;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        astore0.initFromFile(bytesequence0, b0);
        ByteSequence bytesequence1 = null;
        boolean b1 = false;
        astore0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle0 = new InstructionHandle(astore0);
        instructionhandle0.setInstruction(f2i0);
    }

    @Test
    public void test11() throws Throwable {
        F2I f2i0 = new F2I();
        short s0 = 12;
        int i0 = 1;
        INSTANCEOF instanceof0 = new INSTANCEOF(i0);
        DataOutputStream dataoutputstream0 = null;
        instanceof0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(instanceof0);
        instructionhandle0.setInstruction(f2i0);
    }

    @Test
    public void test12() throws Throwable {
        L2I l2i0 = new L2I();
        ConstantPoolGen constantpoolgen0 = null;
        l2i0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        l2i0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = new ConstantPoolGen();
        String str0 = "ulG";
        String str1 = "RsZvhdnLj";
        constantpoolgen2.addNameAndType(str0, str1);
        String str2 = "wRYp";
        String str3 = "C";
        constantpoolgen2.addNameAndType(str2, str3);
        int i0 = 112;
        Constant constant0 = null;
        constantpoolgen2.setConstant(i0, constant0);
        long l0 = -24l;
        constantpoolgen2.lookupLong(l0);
        l2i0.produceStack(constantpoolgen2);
        InstructionHandle instructionhandle0 = new InstructionHandle(l2i0);
        Instruction instruction0 = null;
        instructionhandle0.setInstruction(instruction0);
        GOTO goto0 = new GOTO(instructionhandle0);
        short s0 = 69;
        int i1 = 0;
        RET ret0 = new RET(i1);
        DataOutputStream dataoutputstream0 = null;
        ret0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen3 = null;
        ret0.consumeStack(constantpoolgen3);
        ConstantPoolGen constantpoolgen4 = null;
        ret0.consumeStack(constantpoolgen4);
        InstructionHandle instructionhandle1 = new InstructionHandle(ret0);
        I2B i2b0 = new I2B();
        instructionhandle1.setInstruction(i2b0);
        instructionhandle1.setInstruction(goto0);
    }

    @Test
    public void test13() throws Throwable {
        int i0 = 0;
        INSTANCEOF instanceof0 = new INSTANCEOF(i0);
        short s0 = -69;
        int i1 = 80;
        INVOKEDYNAMIC invokedynamic0 = new INVOKEDYNAMIC(i1);
        invokedynamic0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupInterfaceMethodref(methodgen0);
        long l0 = -656l;
        constantpoolgen0.addLong(l0);
        String str0 = "WwvN";
        String str1 = "oqrJD";
        constantpoolgen0.addNameAndType(str0, str1);
        String str2 = "jWO";
        String str3 = "zhha";
        String str4 = "Kvy";
        constantpoolgen0.addInterfaceMethodref(str2, str3, str4);
        invokedynamic0.produceStack(constantpoolgen0);
        invokedynamic0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(invokedynamic0);
        DNEG dneg0 = new DNEG();
        instructionhandle0.setInstruction(dneg0);
        instructionhandle0.setInstruction(instanceof0);
    }

    @Test
    public void test14() throws Throwable {
        DUP_X2 dup_x20 = new DUP_X2();
        short s0 = -67;
        RETURN return0 = new RETURN();
        DataOutputStream dataoutputstream0 = null;
        return0.dump(dataoutputstream0);
        return0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        return0.produceStack(constantpoolgen0);
        return0.copy();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        return0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream1 = null;
        return0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(return0);
        DALOAD daload0 = new DALOAD();
        instructionhandle0.setInstruction(daload0);
        instructionhandle0.setInstruction(dup_x20);
    }

    @Test
    public void test15() throws Throwable {
        ARETURN areturn0 = new ARETURN();
        short s0 = 14;
        ACONST_NULL aconst_null0 = new ACONST_NULL();
        byte[] arr0 = new byte[1];
        byte byte0 = 31;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        aconst_null0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen0);
        String str0 = "Pi";
        constantpoolgen0.lookupString(str0);
        aconst_null0.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(aconst_null0);
        int i0 = 1;
        FLOAD fload0 = new FLOAD(i0);
        instructionhandle0.setInstruction(fload0);
        instructionhandle0.setInstruction(areturn0);
    }

    @Test
    public void test16() throws Throwable {
        DUP_X1 dup_x10 = new DUP_X1();
        short s0 = 94;
        DREM drem0 = new DREM();
        byte[] arr0 = new byte[2];
        byte byte0 = -13;
        arr0[0] = byte0;
        byte byte1 = -67;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        drem0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream0 = null;
        drem0.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        drem0.dump(dataoutputstream1);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "VPXoc";
        constantpoolgen0.addUtf8(str0);
        String str1 = "qCuw";
        String str2 = "";
        String str3 = "jmOefb";
        constantpoolgen0.lookupInterfaceMethodref(str1, str2, str3);
        drem0.consumeStack(constantpoolgen0);
        Visitor visitor0 = null;
        drem0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(drem0);
        instructionhandle0.setInstruction(dup_x10);
    }

    @Test
    public void test17() throws Throwable {
        FASTORE fastore0 = new FASTORE();
        DataOutputStream dataoutputstream0 = null;
        fastore0.dump(dataoutputstream0);
        Visitor visitor0 = null;
        fastore0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(fastore0);
        instructionhandle0.hasTargeters();
        JSR jsr0 = new JSR(instructionhandle0);
        short s0 = -82;
        DALOAD daload0 = new DALOAD();
        byte[] arr0 = new byte[2];
        byte byte0 = -127;
        arr0[0] = byte0;
        byte byte1 = -71;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        daload0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        daload0.produceStack(constantpoolgen0);
        ByteSequence bytesequence1 = null;
        boolean b1 = false;
        daload0.initFromFile(bytesequence1, b1);
        Visitor visitor1 = null;
        daload0.accept(visitor1);
        ConstantPoolGen constantpoolgen1 = null;
        daload0.produceStack(constantpoolgen1);
        ByteSequence bytesequence2 = null;
        boolean b2 = true;
        daload0.initFromFile(bytesequence2, b2);
        InstructionHandle instructionhandle1 = new InstructionHandle(daload0);
        LSHL lshl0 = new LSHL();
        instructionhandle1.setInstruction(lshl0);
        instructionhandle1.setInstruction(jsr0);
    }

    @Test
    public void test18() throws Throwable {
        InstructionHandle instructionhandle0 = null;
        GOTO_W goto_w0 = new GOTO_W(instructionhandle0);
        short s0 = -46;
        CALOAD caload0 = new CALOAD();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "w";
        String str1 = "vtu";
        String str2 = "MybHHe";
        constantpoolgen0.lookupInterfaceMethodref(str0, str1, str2);
        float f0 = 89.53058f;
        constantpoolgen0.lookupFloat(f0);
        String str3 = "GXFdZC";
        String str4 = "yVjHTN";
        constantpoolgen0.lookupNameAndType(str3, str4);
        int i0 = 58;
        constantpoolgen0.lookupInteger(i0);
        String str5 = "ILpy";
        constantpoolgen0.lookupUtf8(str5);
        String str6 = "DDB";
        String str7 = "aHpecrFo";
        String str8 = "CneMmex";
        constantpoolgen0.addInterfaceMethodref(str6, str7, str8);
        caload0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        caload0.dump(dataoutputstream0);
        InstructionHandle instructionhandle1 = new InstructionHandle(caload0);
        BALOAD baload0 = new BALOAD();
        baload0.copy();
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        baload0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str9 = "Kgom";
        String str10 = "SJQJvMDel";
        constantpoolgen1.addNameAndType(str9, str10);
        int i1 = 158;
        constantpoolgen1.setIndex(i1);
        baload0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream1 = null;
        baload0.dump(dataoutputstream1);
        baload0.copy();
        baload0.copy();
        InstructionHandle instructionhandle2 = new InstructionHandle(baload0);
        InstructionTargeter instructiontargeter0 = null;
        instructionhandle2.addTargeter(instructiontargeter0);
        JSR_W jsr_w0 = new JSR_W(instructionhandle2);
        instructionhandle1.setInstruction(jsr_w0);
        instructionhandle1.setInstruction(goto_w0);
    }

    @Test
    public void test19() throws Throwable {
        FCMPG fcmpg0 = new FCMPG();
        short s0 = 6;
        DCMPG dcmpg0 = new DCMPG();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        float f0 = 0.0f;
        constantpoolgen0.lookupFloat(f0);
        long l0 = 0l;
        constantpoolgen0.addLong(l0);
        MethodGen methodgen0 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen0);
        String str0 = "XooLniUEE";
        constantpoolgen0.addString(str0);
        String str1 = "PY";
        String str2 = "fo";
        constantpoolgen0.lookupNameAndType(str1, str2);
        MethodGen methodgen1 = null;
        constantpoolgen0.addMethodref(methodgen1);
        dcmpg0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        dcmpg0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(dcmpg0);
        IMPDEP2 impdep20 = new IMPDEP2();
        instructionhandle0.setInstruction(impdep20);
        instructionhandle0.setInstruction(fcmpg0);
    }

    @Test
    public void test20() throws Throwable {
        int i0 = 179;
        INVOKEVIRTUAL invokevirtual0 = new INVOKEVIRTUAL(i0);
        short s0 = 77;
        LXOR lxor0 = new LXOR();
        lxor0.copy();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        lxor0.accept(instconstraintvisitor0);
        ConstantPoolGen constantpoolgen0 = null;
        lxor0.produceStack(constantpoolgen0);
        lxor0.copy();
        ConstantPoolGen constantpoolgen1 = null;
        lxor0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream0 = null;
        lxor0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(lxor0);
        instructionhandle0.setInstruction(invokevirtual0);
    }
}

