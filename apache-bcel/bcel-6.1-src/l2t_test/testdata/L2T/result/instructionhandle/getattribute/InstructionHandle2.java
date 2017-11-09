package testdata.L2T.result.instructionhandle.getattribute;

import org.apache.bcel.generic.IMPDEP1;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.INVOKESTATIC;
import org.apache.bcel.generic.InvokeInstruction;
import java.lang.Integer;
import org.apache.bcel.generic.IRETURN;
import java.io.DataOutputStream;
import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.ConstantPoolGen;
import java.lang.Long;
import org.apache.bcel.generic.SALOAD;
import java.lang.Short;
import org.apache.bcel.generic.RET;
import org.apache.bcel.generic.ICONST;
import java.lang.Byte;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.CHECKCAST;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.PUTSTATIC;
import org.apache.bcel.generic.I2B;
import org.apache.bcel.generic.DUP2_X1;
import org.apache.bcel.generic.GOTO_W;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.ALOAD;
import org.apache.bcel.generic.LREM;
import org.apache.bcel.generic.IF_ICMPLE;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.ISHL;
import org.apache.bcel.generic.LADD;
import java.util.HashMap;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.ISUB;
import org.apache.bcel.generic.StackInstruction;
import org.apache.bcel.generic.INSTANCEOF;
import org.apache.bcel.generic.IFNONNULL;
import org.apache.bcel.generic.MONITORENTER;
import org.apache.bcel.generic.LDIV;
import org.apache.bcel.classfile.Constant;
import java.lang.String;
import org.apache.bcel.generic.DASTORE;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.IF_ACMPEQ;
import org.apache.bcel.generic.FRETURN;
import org.apache.bcel.generic.DCMPL;
import org.apache.bcel.generic.BASTORE;
import org.junit.Test;
import org.apache.bcel.generic.IINC;
import org.apache.bcel.generic.LSUB;
import org.apache.bcel.generic.D2L;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.Visitor;
import java.lang.Object;
import org.apache.bcel.generic.IfInstruction;
import org.apache.bcel.generic.L2I;

@SuppressWarnings("deprecation")
public class InstructionHandle2 {

    @Test
    public void test1() throws Throwable {
        String str0 = "eBXLKCbHB";
        D2L d2l0 = new D2L();
        InstructionHandle instructionhandle0 = new InstructionHandle(d2l0);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test2() throws Throwable {
        String str0 = "cZyGpSWc";
        FCMPL fcmpl0 = new FCMPL();
        Visitor visitor0 = null;
        fcmpl0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(fcmpl0);
        HashMap hashmap0 = new HashMap();
        String str1 = "";
        Byte byte0 = -33;
        hashmap0.put(str1, byte0);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test3() throws Throwable {
        Short s0 = -137;
        DCMPL dcmpl0 = new DCMPL();
        dcmpl0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        Constant[] arr0 = null;
        constantpoolgen0.setConstants(arr0);
        int i0 = -171;
        constantpoolgen0.lookupInteger(i0);
        dcmpl0.produceStack(constantpoolgen0);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        IF_ACMPEQ if_acmpeq0 = null;
        executionvisitor0.visitIF_ACMPEQ(if_acmpeq0);
        DASTORE dastore0 = null;
        executionvisitor0.visitDASTORE(dastore0);
        dcmpl0.accept(executionvisitor0);
        dcmpl0.copy();
        dcmpl0.copy();
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        SALOAD saload0 = null;
        instconstraintvisitor0.visitSALOAD(saload0);
        INVOKESTATIC invokestatic0 = null;
        instconstraintvisitor0.visitINVOKESTATIC(invokestatic0);
        dcmpl0.accept(instconstraintvisitor0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "LCH";
        constantpoolgen1.lookupClass(str0);
        String str1 = "zsjf";
        String str2 = "P";
        String str3 = "wz";
        constantpoolgen1.addInterfaceMethodref(str1, str2, str3);
        String str4 = "sQijUsL";
        constantpoolgen1.addClass_(str4);
        dcmpl0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(dcmpl0);
        HashMap hashmap0 = new HashMap();
        String str5 = "uMkdbPR";
        Byte byte0 = -75;
        hashmap0.put(str5, byte0);
        String str6 = "P";
        Byte byte1 = -45;
        hashmap0.put(str6, byte1);
        Object obj0 = instructionhandle0.getAttribute(s0);
    }

    @Test
    public void test4() throws Throwable {
        Short s0 = 0;
        IMPDEP1 impdep10 = new IMPDEP1();
        DataOutputStream dataoutputstream0 = null;
        impdep10.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(impdep10);
        Object obj0 = instructionhandle0.getAttribute(s0);
    }

    @Test
    public void test5() throws Throwable {
        Byte byte0 = 33;
        ISUB isub0 = new ISUB();
        isub0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(isub0);
        HashMap hashmap0 = new HashMap();
        String str0 = "rdQ";
        Byte byte1 = 61;
        hashmap0.put(str0, byte1);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test6() throws Throwable {
        String str0 = "RuuoM";
        NOP nop0 = new NOP();
        InstructionHandle instructionhandle0 = new InstructionHandle(nop0);
        HashMap hashmap0 = new HashMap();
        String str1 = "p";
        Byte byte0 = -55;
        hashmap0.put(str1, byte0);
        String str2 = "PVn";
        Byte byte1 = 68;
        hashmap0.put(str2, byte1);
        String str3 = "ukJzQ";
        Byte byte2 = -122;
        hashmap0.put(str3, byte2);
        String str4 = "p";
        Byte byte3 = 62;
        hashmap0.put(str4, byte3);
        String str5 = "OsWIlkN";
        Byte byte4 = -113;
        hashmap0.put(str5, byte4);
        String str6 = "lE";
        Byte byte5 = -2;
        hashmap0.put(str6, byte5);
        String str7 = "Hl";
        Byte byte6 = -85;
        hashmap0.put(str7, byte6);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test7() throws Throwable {
        String str0 = "waQ";
        SALOAD saload0 = new SALOAD();
        InstructionHandle instructionhandle0 = new InstructionHandle(saload0);
        int i0 = 196;
        float f0 = 89.11067f;
        HashMap hashmap0 = new HashMap(i0, f0);
        String str1 = "anFRDZQsS";
        Byte byte0 = 77;
        hashmap0.put(str1, byte0);
        String str2 = "Wmwdj";
        Byte byte1 = -14;
        hashmap0.put(str2, byte1);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test8() throws Throwable {
        String str0 = "ap";
        IRETURN ireturn0 = new IRETURN();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupMethodref(methodgen0);
        String str1 = "bZwustHn";
        String str2 = "cSJoL";
        String str3 = "vy";
        constantpoolgen0.addFieldref(str1, str2, str3);
        ireturn0.consumeStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        ireturn0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen1 = null;
        ireturn0.consumeStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(ireturn0);
        HashMap hashmap0 = new HashMap();
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test9() throws Throwable {
        String str0 = "Mhs";
        IASTORE iastore0 = new IASTORE();
        iastore0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        constantpoolgen0.adjustSize();
        ObjectType objecttype0 = null;
        constantpoolgen0.addClass(objecttype0);
        int i0 = -143;
        constantpoolgen0.setIndex(i0);
        Constant[] arr0 = null;
        constantpoolgen0.setConstants(arr0);
        iastore0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        iastore0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = null;
        iastore0.consumeStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(iastore0);
        HashMap hashmap0 = new HashMap();
        String str1 = "RXMOFLKcq";
        Byte byte0 = -93;
        hashmap0.put(str1, byte0);
        String str2 = "M";
        Byte byte1 = -118;
        hashmap0.put(str2, byte1);
        String str3 = "";
        Byte byte2 = -120;
        hashmap0.put(str3, byte2);
        String str4 = "JMbdRDR";
        Byte byte3 = -43;
        hashmap0.put(str4, byte3);
        String str5 = "QOi";
        Byte byte4 = 49;
        hashmap0.put(str5, byte4);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test10() throws Throwable {
        Byte byte0 = -10;
        DUP2_X1 dup2_x10 = new DUP2_X1();
        InstructionHandle instructionhandle0 = new InstructionHandle(dup2_x10);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test11() throws Throwable {
        Long l0 = 874l;
        int i0 = -1;
        ICONST iconst0 = new ICONST(i0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        iconst0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream0 = null;
        iconst0.dump(dataoutputstream0);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        ALOAD aload0 = null;
        executionvisitor0.visitALOAD(aload0);
        LADD ladd0 = null;
        executionvisitor0.visitLADD(ladd0);
        LREM lrem0 = null;
        executionvisitor0.visitLREM(lrem0);
        BASTORE bastore0 = null;
        executionvisitor0.visitBASTORE(bastore0);
        IINC iinc0 = null;
        executionvisitor0.visitIINC(iinc0);
        IF_ICMPLE if_icmple0 = null;
        executionvisitor0.visitIF_ICMPLE(if_icmple0);
        IINC iinc1 = null;
        executionvisitor0.visitIINC(iinc1);
        iconst0.accept(executionvisitor0);
        ConstantPoolGen constantpoolgen0 = null;
        iconst0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        iconst0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream1 = null;
        iconst0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(iconst0);
        HashMap hashmap0 = new HashMap();
        String str0 = "UixaLnpG";
        Byte byte0 = -123;
        hashmap0.put(str0, byte0);
        String str1 = "";
        Byte byte1 = 119;
        hashmap0.put(str1, byte1);
        String str2 = "tqLRwOzQk";
        Byte byte2 = 91;
        hashmap0.put(str2, byte2);
        String str3 = "wxR";
        Byte byte3 = -80;
        hashmap0.put(str3, byte3);
        String str4 = "TOW";
        Byte byte4 = -61;
        hashmap0.put(str4, byte4);
        String str5 = "WITvsWe";
        Byte byte5 = -2;
        hashmap0.put(str5, byte5);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test12() throws Throwable {
        Long l0 = 0l;
        ISHL ishl0 = new ISHL();
        byte[] arr0 = new byte[2];
        byte byte0 = -96;
        arr0[0] = byte0;
        byte byte1 = 63;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        ishl0.initFromFile(bytesequence0, b0);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        InvokeInstruction invokeinstruction0 = null;
        executionvisitor0.visitInvokeInstruction(invokeinstruction0);
        L2I l2i0 = null;
        executionvisitor0.visitL2I(l2i0);
        ishl0.accept(executionvisitor0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        int i0 = 0;
        constantpoolgen0.setIndex(i0);
        String str0 = "QZDMdo";
        constantpoolgen0.lookupClass(str0);
        ishl0.produceStack(constantpoolgen0);
        ExecutionVisitor executionvisitor1 = new ExecutionVisitor();
        IFNONNULL ifnonnull0 = null;
        executionvisitor1.visitIFNONNULL(ifnonnull0);
        ishl0.accept(executionvisitor1);
        InstructionHandle instructionhandle0 = new InstructionHandle(ishl0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test13() throws Throwable {
        Integer i0 = 1;
        NOP nop0 = new NOP();
        Constant[] arr0 = new Constant[1];
        Constant constant0 = null;
        arr0[0] = constant0;
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen(arr0);
        String str0 = "QgfuIxFCu";
        String str1 = "pNYJEye";
        String str2 = "WI";
        constantpoolgen0.addMethodref(str0, str1, str2);
        String str3 = "xGNBdturu";
        String str4 = "HeV";
        String str5 = "Kdzj";
        constantpoolgen0.lookupInterfaceMethodref(str3, str4, str5);
        Constant constant1 = null;
        ConstantPoolGen constantpoolgen1 = null;
        constantpoolgen0.addConstant(constant1, constantpoolgen1);
        String str6 = "IcS";
        String str7 = "gSDhu";
        String str8 = "ASpUFHr";
        constantpoolgen0.lookupInterfaceMethodref(str6, str7, str8);
        String str9 = "UWTZbqcEF";
        constantpoolgen0.lookupUtf8(str9);
        nop0.produceStack(constantpoolgen0);
        nop0.copy();
        ConstantPoolGen constantpoolgen2 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen2.addInterfaceMethodref(methodgen0);
        nop0.produceStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = new ConstantPoolGen();
        double d0 = -59.81275910133241;
        constantpoolgen3.lookupDouble(d0);
        nop0.produceStack(constantpoolgen3);
        InstructionHandle instructionhandle0 = new InstructionHandle(nop0);
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test14() throws Throwable {
        Long l0 = -610l;
        FRETURN freturn0 = new FRETURN();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        freturn0.initFromFile(bytesequence0, b0);
        freturn0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "P";
        constantpoolgen0.lookupUtf8(str0);
        String str1 = "KVfuikszi";
        String str2 = "P";
        constantpoolgen0.addNameAndType(str1, str2);
        constantpoolgen0.adjustSize();
        freturn0.consumeStack(constantpoolgen0);
        freturn0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(freturn0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test15() throws Throwable {
        Long l0 = 0l;
        LDIV ldiv0 = new LDIV();
        InstructionHandle instructionhandle0 = new InstructionHandle(ldiv0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test16() throws Throwable {
        Byte byte0 = -50;
        int i0 = 186;
        CHECKCAST checkcast0 = new CHECKCAST(i0);
        checkcast0.copy();
        Constant[] arr0 = new Constant[2];
        Constant constant0 = null;
        arr0[0] = constant0;
        Constant constant1 = null;
        arr0[1] = constant1;
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen(arr0);
        ArrayType arraytype0 = null;
        constantpoolgen0.addArrayClass(arraytype0);
        String str0 = "Y";
        String str1 = "iCgC";
        constantpoolgen0.lookupNameAndType(str0, str1);
        String str2 = "AwIJDf";
        constantpoolgen0.addClass_(str2);
        String str3 = "ApdfS";
        String str4 = "guQGqJDG";
        String str5 = "dupHbq";
        constantpoolgen0.addInterfaceMethodref(str3, str4, str5);
        constantpoolgen0.adjustSize();
        String str6 = "mYv";
        constantpoolgen0.addUtf8(str6);
        checkcast0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        checkcast0.produceStack(constantpoolgen1);
        checkcast0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(checkcast0);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test17() throws Throwable {
        Integer i0 = 0;
        int i1 = 193;
        PUTSTATIC putstatic0 = new PUTSTATIC(i1);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        putstatic0.initFromFile(bytesequence0, b0);
        Visitor visitor0 = null;
        putstatic0.accept(visitor0);
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        RET ret0 = null;
        instconstraintvisitor0.visitRET(ret0);
        LSUB lsub0 = null;
        instconstraintvisitor0.visitLSUB(lsub0);
        Select select0 = null;
        instconstraintvisitor0.visitSelect(select0);
        IfInstruction ifinstruction0 = null;
        instconstraintvisitor0.visitIfInstruction(ifinstruction0);
        StackInstruction stackinstruction0 = null;
        instconstraintvisitor0.visitStackInstruction(stackinstruction0);
        GOTO_W goto_w0 = null;
        instconstraintvisitor0.visitGOTO_W(goto_w0);
        INSTANCEOF instanceof0 = null;
        instconstraintvisitor0.visitINSTANCEOF(instanceof0);
        putstatic0.accept(instconstraintvisitor0);
        ByteSequence bytesequence1 = null;
        boolean b1 = true;
        putstatic0.initFromFile(bytesequence1, b1);
        DataOutputStream dataoutputstream0 = null;
        putstatic0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(putstatic0);
        HashMap hashmap0 = new HashMap();
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test18() throws Throwable {
        Byte byte0 = -34;
        I2B i2b0 = new I2B();
        ConstantPoolGen constantpoolgen0 = null;
        i2b0.produceStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2b0);
        HashMap hashmap0 = new HashMap();
        String str0 = "KITH";
        Byte byte1 = 89;
        hashmap0.put(str0, byte1);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test19() throws Throwable {
        Long l0 = 0l;
        F2I f2i0 = new F2I();
        byte[] arr0 = new byte[1];
        byte byte0 = 81;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        f2i0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream0 = null;
        f2i0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = null;
        f2i0.produceStack(constantpoolgen0);
        Visitor visitor0 = null;
        f2i0.accept(visitor0);
        ByteSequence bytesequence1 = null;
        boolean b1 = true;
        f2i0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle0 = new InstructionHandle(f2i0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test20() throws Throwable {
        Short s0 = 84;
        MONITORENTER monitorenter0 = new MONITORENTER();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        MethodGen methodgen0 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen0);
        long l0 = 0l;
        constantpoolgen0.addLong(l0);
        int i0 = -199;
        constantpoolgen0.setIndex(i0);
        monitorenter0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = null;
        monitorenter0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(monitorenter0);
        Object obj0 = instructionhandle0.getAttribute(s0);
    }
}

