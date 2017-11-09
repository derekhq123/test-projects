package testdata.L2T.result.instructionhandle.setinstruction;

import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.IOR;
import org.apache.bcel.generic.LDC2_W;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.FREM;
import org.apache.bcel.generic.IMPDEP2;
import java.io.DataOutputStream;
import org.apache.bcel.generic.CALOAD;
import org.apache.bcel.generic.ConstantPoolGen;
import java.lang.Long;
import org.apache.bcel.generic.LCMP;
import java.lang.Short;
import org.apache.bcel.generic.Instruction;
import org.apache.bcel.generic.GOTO;
import org.apache.bcel.generic.JSR_W;
import org.apache.bcel.generic.NEW;
import org.apache.bcel.generic.ICONST;
import java.lang.Byte;
import org.apache.bcel.generic.IFLT;
import org.apache.bcel.generic.ARRAYLENGTH;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.generic.VariableLengthInstruction;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.IREM;
import org.apache.bcel.generic.InstructionTargeter;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.generic.IADD;
import org.apache.bcel.generic.I2C;
import org.apache.bcel.generic.I2B;
import org.apache.bcel.generic.FADD;
import org.apache.bcel.generic.I2F;
import org.apache.bcel.generic.AALOAD;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.INEG;
import org.apache.bcel.generic.DALOAD;
import org.apache.bcel.generic.I2L;
import org.apache.bcel.generic.JSR;
import org.apache.bcel.generic.DDIV;
import org.apache.bcel.generic.BREAKPOINT;
import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.ISHR;
import org.apache.bcel.generic.POP;
import org.apache.bcel.generic.LOR;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.generic.ISUB;
import org.apache.bcel.generic.ConstantPushInstruction;
import org.apache.bcel.generic.IFNULL;
import org.apache.bcel.generic.ASTORE;
import org.apache.bcel.generic.SASTORE;
import org.apache.bcel.generic.IFNONNULL;
import org.apache.bcel.generic.ATHROW;
import org.apache.bcel.generic.ArrayInstruction;
import org.apache.bcel.generic.FMUL;
import org.apache.bcel.generic.INVOKEINTERFACE;
import org.apache.bcel.generic.MONITORENTER;
import org.apache.bcel.generic.AASTORE;
import org.apache.bcel.generic.LDIV;
import org.apache.bcel.generic.LALOAD;
import org.apache.bcel.classfile.Constant;
import java.lang.String;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.POP2;
import org.apache.bcel.generic.FCONST;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.bcel.generic.FRETURN;
import org.apache.bcel.generic.DCMPL;
import org.apache.bcel.generic.BASTORE;
import org.apache.bcel.generic.LDC_W;
import org.junit.Test;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.LSHR;
import org.apache.bcel.generic.LSUB;
import org.apache.bcel.generic.IFGE;
import org.apache.bcel.generic.IMUL;
import org.apache.bcel.generic.F2D;
import org.apache.bcel.generic.PUTFIELD;
import org.apache.bcel.generic.L2D;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.D2I;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.generic.IF_ACMPNE;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        FRETURN freturn0 = new FRETURN();
        short s0 = -100;
        IOR ior0 = new IOR();
        byte[] arr0 = new byte[2];
        byte byte0 = -71;
        arr0[0] = byte0;
        byte byte1 = -63;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        ior0.initFromFile(bytesequence0, b0);
        ior0.copy();
        ConstantPoolGen constantpoolgen0 = null;
        ior0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        ior0.produceStack(constantpoolgen1);
        Visitor visitor0 = null;
        ior0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(ior0);
        instructionhandle0.setInstruction(freturn0);
    }

    @Test
    public void test2() throws Throwable {
        IMUL imul0 = new IMUL();
        ConstantPoolGen constantpoolgen0 = null;
        imul0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        imul0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = null;
        imul0.consumeStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        imul0.consumeStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = null;
        imul0.produceStack(constantpoolgen3);
        ConstantPoolGen constantpoolgen4 = null;
        imul0.produceStack(constantpoolgen4);
        imul0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(imul0);
        IF_ACMPEQ if_acmpeq0 = new IF_ACMPEQ(instructionhandle0);
        short s0 = -100;
        IASTORE iastore0 = new IASTORE();
        ConstantPoolGen constantpoolgen5 = null;
        iastore0.consumeStack(constantpoolgen5);
        DataOutputStream dataoutputstream1 = null;
        iastore0.dump(dataoutputstream1);
        ConstantPoolGen constantpoolgen6 = null;
        iastore0.consumeStack(constantpoolgen6);
        InstructionHandle instructionhandle1 = new InstructionHandle(iastore0);
        DALOAD daload0 = new DALOAD();
        instructionhandle1.setInstruction(daload0);
        instructionhandle1.setInstruction(if_acmpeq0);
    }

    @Test
    public void test3() throws Throwable {
        FMUL fmul0 = new FMUL();
        short s0 = -52;
        F2I f2i0 = new F2I();
        InstructionHandle instructionhandle0 = new InstructionHandle(f2i0);
        ARRAYLENGTH arraylength0 = new ARRAYLENGTH();
        instructionhandle0.setInstruction(arraylength0);
        instructionhandle0.setInstruction(fmul0);
    }

    @Test
    public void test4() throws Throwable {
        int i0 = 58;
        PUTFIELD putfield0 = new PUTFIELD(i0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        putfield0.initFromFile(bytesequence0, b0);
        Visitor visitor0 = null;
        putfield0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(putfield0);
        instructionhandle0.removeAllTargeters();
        instructionhandle0.removeAllTargeters();
        InstructionTargeter instructiontargeter0 = null;
        instructionhandle0.addTargeter(instructiontargeter0);
        instructionhandle0.removeAllTargeters();
        JSR jsr0 = new JSR(instructionhandle0);
        short s0 = 4;
        L2D l2d0 = new L2D();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        IFNULL ifnull0 = null;
        instconstraintvisitor0.visitIFNULL(ifnull0);
        LDC2_W ldc2_w0 = null;
        instconstraintvisitor0.visitLDC2_W(ldc2_w0);
        POP pop0 = null;
        instconstraintvisitor0.visitPOP(pop0);
        LOR lor0 = null;
        instconstraintvisitor0.visitLOR(lor0);
        ISHR ishr0 = null;
        instconstraintvisitor0.visitISHR(ishr0);
        l2d0.accept(instconstraintvisitor0);
        InstConstraintVisitor instconstraintvisitor1 = new InstConstraintVisitor();
        FMUL fmul0 = null;
        instconstraintvisitor1.visitFMUL(fmul0);
        IREM irem0 = null;
        instconstraintvisitor1.visitIREM(irem0);
        LALOAD laload0 = null;
        instconstraintvisitor1.visitLALOAD(laload0);
        I2L i2l0 = null;
        instconstraintvisitor1.visitI2L(i2l0);
        l2d0.accept(instconstraintvisitor1);
        l2d0.copy();
        ByteSequence bytesequence1 = null;
        boolean b1 = true;
        l2d0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle1 = new InstructionHandle(l2d0);
        instructionhandle1.setInstruction(jsr0);
    }

    @Test
    public void test5() throws Throwable {
        IADD iadd0 = new IADD();
        short s0 = -8;
        I2B i2b0 = new I2B();
        i2b0.copy();
        i2b0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        ObjectType objecttype0 = null;
        constantpoolgen0.addClass(objecttype0);
        String str0 = "qwJtyaR";
        constantpoolgen0.lookupString(str0);
        i2b0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2b0);
        instructionhandle0.setInstruction(iadd0);
    }

    @Test
    public void test6() throws Throwable {
        POP pop0 = new POP();
        short s0 = 64;
        short s1 = -25;
        SIPUSH sipush0 = new SIPUSH(s1);
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        INVOKESTATIC invokestatic0 = null;
        instconstraintvisitor0.visitINVOKESTATIC(invokestatic0);
        I2F i2f0 = null;
        instconstraintvisitor0.visitI2F(i2f0);
        FADD fadd0 = null;
        instconstraintvisitor0.visitFADD(fadd0);
        DCONST dconst0 = null;
        instconstraintvisitor0.visitDCONST(dconst0);
        sipush0.accept(instconstraintvisitor0);
        sipush0.copy();
        sipush0.copy();
        DataOutputStream dataoutputstream0 = null;
        sipush0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(sipush0);
        F2I f2i0 = new F2I();
        instructionhandle0.setInstruction(f2i0);
        instructionhandle0.setInstruction(pop0);
    }

    @Test
    public void test7() throws Throwable {
        LCMP lcmp0 = new LCMP();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        lcmp0.initFromFile(bytesequence0, b0);
        lcmp0.copy();
        Visitor visitor0 = null;
        lcmp0.accept(visitor0);
        lcmp0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(lcmp0);
        Byte byte0 = 62;
        instructionhandle0.removeAttribute(byte0);
        Long l0 = 641l;
        Short s0 = -1;
        instructionhandle0.addAttribute(l0, s0);
        instructionhandle0.addHandle();
        IF_ACMPNE if_acmpne0 = new IF_ACMPNE(instructionhandle0);
        short s1 = -1;
        DALOAD daload0 = new DALOAD();
        InstructionHandle instructionhandle1 = new InstructionHandle(daload0);
        F2D f2d0 = new F2D();
        instructionhandle1.setInstruction(f2d0);
        instructionhandle1.setInstruction(if_acmpne0);
    }

    @Test
    public void test8() throws Throwable {
        BREAKPOINT breakpoint0 = new BREAKPOINT();
        short s0 = 52;
        DCMPL dcmpl0 = new DCMPL();
        dcmpl0.copy();
        DataOutputStream dataoutputstream0 = null;
        dcmpl0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "jGJNZ";
        constantpoolgen0.lookupClass(str0);
        dcmpl0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(dcmpl0);
        instructionhandle0.setInstruction(breakpoint0);
    }

    @Test
    public void test9() throws Throwable {
        ATHROW athrow0 = new ATHROW();
        ConstantPoolGen constantpoolgen0 = null;
        athrow0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(athrow0);
        InstructionHandle instructionhandle1 = null;
        IFGE ifge0 = new IFGE(instructionhandle1);
        InstructionHandle instructionhandle2 = null;
        InstructionHandle instructionhandle3 = null;
        ifge0.updateTarget(instructionhandle2, instructionhandle3);
        instructionhandle0.addTargeter(ifge0);
        JSR_W jsr_w0 = new JSR_W(instructionhandle0);
        short s0 = 19;
        DDIV ddiv0 = new DDIV();
        byte[] arr0 = new byte[1];
        byte byte0 = -114;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        ddiv0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle4 = new InstructionHandle(ddiv0);
        instructionhandle4.setInstruction(jsr_w0);
    }

    @Test
    public void test10() throws Throwable {
        ISHR ishr0 = new ISHR();
        short s0 = -61;
        ISHL ishl0 = new ISHL();
        ishl0.copy();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        ishl0.initFromFile(bytesequence0, b0);
        ishl0.copy();
        DataOutputStream dataoutputstream0 = null;
        ishl0.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        ishl0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(ishl0);
        FRETURN freturn0 = new FRETURN();
        instructionhandle0.setInstruction(freturn0);
        instructionhandle0.setInstruction(ishr0);
    }

    @Test
    public void test11() throws Throwable {
        LSUB lsub0 = new LSUB();
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        INVOKEINTERFACE invokeinterface0 = null;
        executionvisitor0.visitINVOKEINTERFACE(invokeinterface0);
        ArrayInstruction arrayinstruction0 = null;
        executionvisitor0.visitArrayInstruction(arrayinstruction0);
        F2I f2i0 = null;
        executionvisitor0.visitF2I(f2i0);
        ICONST iconst0 = null;
        executionvisitor0.visitICONST(iconst0);
        SASTORE sastore0 = null;
        executionvisitor0.visitSASTORE(sastore0);
        GOTO goto0 = null;
        executionvisitor0.visitGOTO(goto0);
        IF_ACMPEQ if_acmpeq0 = null;
        executionvisitor0.visitIF_ACMPEQ(if_acmpeq0);
        lsub0.accept(executionvisitor0);
        ConstantPoolGen constantpoolgen0 = null;
        lsub0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        lsub0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream0 = null;
        lsub0.dump(dataoutputstream0);
        lsub0.copy();
        ConstantPoolGen constantpoolgen2 = null;
        lsub0.consumeStack(constantpoolgen2);
        lsub0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(lsub0);
        InstructionTargeter instructiontargeter0 = null;
        instructionhandle0.removeTargeter(instructiontargeter0);
        instructionhandle0.removeAllTargeters();
        Instruction instruction0 = null;
        instructionhandle0.swapInstruction(instruction0);
        JSR_W jsr_w0 = new JSR_W(instructionhandle0);
        short s0 = -54;
        POP2 pop20 = new POP2();
        Visitor visitor0 = null;
        pop20.accept(visitor0);
        ConstantPoolGen constantpoolgen3 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen3.lookupInterfaceMethodref(methodgen0);
        int i0 = -126;
        Constant constant0 = null;
        constantpoolgen3.setConstant(i0, constant0);
        long l0 = 1l;
        constantpoolgen3.addLong(l0);
        String str0 = "ZoXd";
        String str1 = "zIPSFDiRV";
        String str2 = "w";
        constantpoolgen3.addFieldref(str0, str1, str2);
        String str3 = "YeVj";
        constantpoolgen3.addUtf8(str3);
        double d0 = 75.90461716103644;
        constantpoolgen3.lookupDouble(d0);
        double d1 = 32.20168298838922;
        constantpoolgen3.addDouble(d1);
        pop20.produceStack(constantpoolgen3);
        pop20.copy();
        ConstantPoolGen constantpoolgen4 = new ConstantPoolGen();
        pop20.consumeStack(constantpoolgen4);
        InstructionHandle instructionhandle1 = new InstructionHandle(pop20);
        instructionhandle1.setInstruction(jsr_w0);
    }

    @Test
    public void test12() throws Throwable {
        D2I d2i0 = new D2I();
        short s0 = 68;
        DADD dadd0 = new DADD();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        int i0 = 64;
        constantpoolgen0.addInteger(i0);
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupMethodref(methodgen0);
        MethodGen methodgen1 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen1);
        ArrayType arraytype0 = null;
        constantpoolgen0.addArrayClass(arraytype0);
        ArrayType arraytype1 = null;
        constantpoolgen0.addArrayClass(arraytype1);
        MethodGen methodgen2 = null;
        constantpoolgen0.addMethodref(methodgen2);
        String str0 = "yFuDRZD";
        String str1 = "";
        String str2 = "r";
        constantpoolgen0.lookupFieldref(str0, str1, str2);
        dadd0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        dadd0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str3 = "AKyqii";
        String str4 = "JLA";
        String str5 = "";
        constantpoolgen1.addInterfaceMethodref(str3, str4, str5);
        dadd0.produceStack(constantpoolgen1);
        dadd0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dadd0);
        instructionhandle0.setInstruction(d2i0);
    }

    @Test
    public void test13() throws Throwable {
        DDIV ddiv0 = new DDIV();
        short s0 = 98;
        FREM frem0 = new FREM();
        Visitor visitor0 = null;
        frem0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(frem0);
        INEG ineg0 = new INEG();
        instructionhandle0.setInstruction(ineg0);
        instructionhandle0.setInstruction(ddiv0);
    }

    @Test
    public void test14() throws Throwable {
        LSHR lshr0 = new LSHR();
        short s0 = -94;
        I2B i2b0 = new I2B();
        i2b0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "yHBHFOV";
        String str1 = "wJz";
        constantpoolgen0.addNameAndType(str0, str1);
        String str2 = "ASwcED";
        String str3 = "vL";
        String str4 = "ufdaMIRvl";
        constantpoolgen0.addInterfaceMethodref(str2, str3, str4);
        String str5 = "gkqCBki";
        String str6 = "ZPZQfOy";
        String str7 = "khogxe";
        constantpoolgen0.lookupFieldref(str5, str6, str7);
        String str8 = "jFQ";
        String str9 = "hZ";
        constantpoolgen0.lookupNameAndType(str8, str9);
        i2b0.produceStack(constantpoolgen0);
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        IREM irem0 = null;
        instconstraintvisitor0.visitIREM(irem0);
        CALOAD caload0 = null;
        instconstraintvisitor0.visitCALOAD(caload0);
        VariableLengthInstruction variablelengthinstruction0 = null;
        instconstraintvisitor0.visitVariableLengthInstruction(variablelengthinstruction0);
        NEW new0 = null;
        instconstraintvisitor0.visitNEW(new0);
        IMPDEP2 impdep20 = null;
        instconstraintvisitor0.visitIMPDEP2(impdep20);
        PUTSTATIC putstatic0 = null;
        instconstraintvisitor0.visitPUTSTATIC(putstatic0);
        i2b0.accept(instconstraintvisitor0);
        InstConstraintVisitor instconstraintvisitor1 = new InstConstraintVisitor();
        i2b0.accept(instconstraintvisitor1);
        DataOutputStream dataoutputstream0 = null;
        i2b0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2b0);
        instructionhandle0.setInstruction(lshr0);
    }

    @Test
    public void test15() throws Throwable {
        I2C i2c0 = new I2C();
        short s0 = -60;
        ISUB isub0 = new ISUB();
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        isub0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream0 = null;
        isub0.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        isub0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(isub0);
        instructionhandle0.setInstruction(i2c0);
    }

    @Test
    public void test16() throws Throwable {
        int i0 = 1;
        LDC_W ldc_w0 = new LDC_W(i0);
        short s0 = 46;
        L2D l2d0 = new L2D();
        DataOutputStream dataoutputstream0 = null;
        l2d0.dump(dataoutputstream0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        l2d0.initFromFile(bytesequence0, b0);
        Visitor visitor0 = null;
        l2d0.accept(visitor0);
        DataOutputStream dataoutputstream1 = null;
        l2d0.dump(dataoutputstream1);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        ConstantPushInstruction constantpushinstruction0 = null;
        executionvisitor0.visitConstantPushInstruction(constantpushinstruction0);
        FRETURN freturn0 = null;
        executionvisitor0.visitFRETURN(freturn0);
        AASTORE aastore0 = null;
        executionvisitor0.visitAASTORE(aastore0);
        AASTORE aastore1 = null;
        executionvisitor0.visitAASTORE(aastore1);
        IASTORE iastore0 = null;
        executionvisitor0.visitIASTORE(iastore0);
        l2d0.accept(executionvisitor0);
        DataOutputStream dataoutputstream2 = null;
        l2d0.dump(dataoutputstream2);
        InstructionHandle instructionhandle0 = new InstructionHandle(l2d0);
        IMPDEP1 impdep10 = new IMPDEP1();
        ConstantPoolGen constantpoolgen0 = null;
        impdep10.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        impdep10.consumeStack(constantpoolgen1);
        DataOutputStream dataoutputstream3 = null;
        impdep10.dump(dataoutputstream3);
        DataOutputStream dataoutputstream4 = null;
        impdep10.dump(dataoutputstream4);
        Visitor visitor1 = null;
        impdep10.accept(visitor1);
        InstructionHandle instructionhandle1 = new InstructionHandle(impdep10);
        instructionhandle1.hasTargeters();
        IFNONNULL ifnonnull0 = new IFNONNULL(instructionhandle1);
        instructionhandle0.setInstruction(ifnonnull0);
        instructionhandle0.setInstruction(ldc_w0);
    }

    @Test
    public void test17() throws Throwable {
        MONITORENTER monitorenter0 = new MONITORENTER();
        short s0 = 35;
        int i0 = 17;
        DLOAD dload0 = new DLOAD(i0);
        ConstantPoolGen constantpoolgen0 = null;
        dload0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        dload0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        dload0.produceStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = new ConstantPoolGen();
        String str0 = "t";
        String str1 = "";
        String str2 = "xAF";
        constantpoolgen3.lookupFieldref(str0, str1, str2);
        Constant constant0 = null;
        ConstantPoolGen constantpoolgen4 = null;
        constantpoolgen3.addConstant(constant0, constantpoolgen4);
        constantpoolgen3.adjustSize();
        String str3 = "pGFnP";
        String str4 = "AZt";
        String str5 = "";
        constantpoolgen3.addFieldref(str3, str4, str5);
        int i1 = -111;
        constantpoolgen3.addInteger(i1);
        String str6 = "bfAVl";
        String str7 = "uPnpr";
        String str8 = "bWi";
        constantpoolgen3.lookupMethodref(str6, str7, str8);
        String str9 = "OOb";
        constantpoolgen3.addClass(str9);
        dload0.produceStack(constantpoolgen3);
        DataOutputStream dataoutputstream0 = null;
        dload0.dump(dataoutputstream0);
        dload0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dload0);
        AALOAD aaload0 = new AALOAD();
        instructionhandle0.setInstruction(aaload0);
        instructionhandle0.setInstruction(monitorenter0);
    }

    @Test
    public void test18() throws Throwable {
        LALOAD laload0 = new LALOAD();
        laload0.copy();
        Visitor visitor0 = null;
        laload0.accept(visitor0);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        laload0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        laload0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        laload0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        laload0.consumeStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = null;
        laload0.produceStack(constantpoolgen3);
        InstructionHandle instructionhandle0 = new InstructionHandle(laload0);
        Byte byte0 = -10;
        instructionhandle0.removeAttribute(byte0);
        instructionhandle0.hasTargeters();
        IFLT iflt0 = new IFLT(instructionhandle0);
        short s0 = -43;
        BASTORE bastore0 = new BASTORE();
        ConstantPoolGen constantpoolgen4 = new ConstantPoolGen();
        float f0 = 48.41658f;
        constantpoolgen4.addFloat(f0);
        ArrayType arraytype0 = null;
        constantpoolgen4.addArrayClass(arraytype0);
        String str0 = "hSh";
        constantpoolgen4.lookupString(str0);
        long l0 = -683l;
        constantpoolgen4.lookupLong(l0);
        int i0 = -128;
        constantpoolgen4.setSize(i0);
        ArrayType arraytype1 = null;
        constantpoolgen4.addArrayClass(arraytype1);
        long l1 = -43l;
        constantpoolgen4.addLong(l1);
        bastore0.consumeStack(constantpoolgen4);
        InstructionHandle instructionhandle1 = new InstructionHandle(bastore0);
        instructionhandle1.setInstruction(iflt0);
    }

    @Test
    public void test19() throws Throwable {
        float f0 = 0.0f;
        FCONST fconst0 = new FCONST(f0);
        short s0 = 6;
        AALOAD aaload0 = new AALOAD();
        byte[] arr0 = new byte[2];
        byte byte0 = 21;
        arr0[0] = byte0;
        byte byte1 = 79;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        aaload0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(aaload0);
        instructionhandle0.setInstruction(fconst0);
    }

    @Test
    public void test20() throws Throwable {
        POP pop0 = new POP();
        short s0 = -79;
        int i0 = 134;
        ASTORE astore0 = new ASTORE(i0);
        InstructionHandle instructionhandle0 = new InstructionHandle(astore0);
        LDIV ldiv0 = new LDIV();
        instructionhandle0.setInstruction(ldiv0);
        instructionhandle0.setInstruction(pop0);
    }
}

