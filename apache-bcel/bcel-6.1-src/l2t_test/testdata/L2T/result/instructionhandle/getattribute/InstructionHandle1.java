package testdata.L2T.result.instructionhandle.getattribute;

import org.apache.bcel.generic.I2S;
import org.apache.bcel.generic.FDIV;
import org.apache.bcel.verifier.structurals.InstConstraintVisitor;
import org.apache.bcel.generic.LAND;
import org.apache.bcel.generic.LDC2_W;
import org.apache.bcel.generic.INVOKESTATIC;
import java.lang.Integer;
import java.io.DataOutputStream;
import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.ConstantPoolGen;
import java.lang.Long;
import org.apache.bcel.generic.StoreInstruction;
import java.lang.Short;
import org.apache.bcel.generic.SALOAD;
import org.apache.bcel.generic.DMUL;
import org.apache.bcel.generic.IALOAD;
import org.apache.bcel.generic.LRETURN;
import org.apache.bcel.generic.NEW;
import java.lang.Byte;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.LDC;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.DUP_X2;
import org.apache.bcel.generic.DUP2_X2;
import org.apache.bcel.generic.INVOKEDYNAMIC;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.DUP;
import org.apache.bcel.generic.FCMPG;
import org.apache.bcel.generic.FLOAD;
import org.apache.bcel.generic.IF_ICMPLE;
import org.apache.bcel.generic.ISHR;
import java.util.HashMap;
import org.apache.bcel.verifier.structurals.ExecutionVisitor;
import org.apache.bcel.generic.NOP;
import org.apache.bcel.generic.IFNULL;
import org.apache.bcel.generic.ATHROW;
import org.apache.bcel.generic.MONITORENTER;
import org.apache.bcel.generic.AllocationInstruction;
import java.lang.String;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.IAND;
import org.apache.bcel.generic.DCMPL;
import org.junit.Test;
import org.apache.bcel.generic.IXOR;
import org.apache.bcel.generic.DLOAD;
import org.apache.bcel.generic.IFLE;
import org.apache.bcel.generic.D2F;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.generic.ExceptionThrower;
import java.lang.Object;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        Byte byte0 = 31;
        short s0 = 1;
        SIPUSH sipush0 = new SIPUSH(s0);
        Visitor visitor0 = null;
        sipush0.accept(visitor0);
        Visitor visitor1 = null;
        sipush0.accept(visitor1);
        InstructionHandle instructionhandle0 = new InstructionHandle(sipush0);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test2() throws Throwable {
        Short s0 = -58;
        MONITORENTER monitorenter0 = new MONITORENTER();
        ConstantPoolGen constantpoolgen0 = null;
        monitorenter0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        monitorenter0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        monitorenter0.produceStack(constantpoolgen2);
        DataOutputStream dataoutputstream0 = null;
        monitorenter0.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        monitorenter0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(monitorenter0);
        Object obj0 = instructionhandle0.getAttribute(s0);
    }

    @Test
    public void test3() throws Throwable {
        Byte byte0 = 105;
        F2I f2i0 = new F2I();
        byte[] arr0 = new byte[2];
        byte byte1 = 28;
        arr0[0] = byte1;
        byte byte2 = -80;
        arr0[1] = byte2;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        f2i0.initFromFile(bytesequence0, b0);
        Visitor visitor0 = null;
        f2i0.accept(visitor0);
        Visitor visitor1 = null;
        f2i0.accept(visitor1);
        byte[] arr1 = new byte[1];
        byte byte3 = 87;
        arr1[0] = byte3;
        ByteSequence bytesequence1 = new ByteSequence(arr1);
        boolean b1 = false;
        f2i0.initFromFile(bytesequence1, b1);
        ConstantPoolGen constantpoolgen0 = null;
        f2i0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        f2i0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(f2i0);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test4() throws Throwable {
        Long l0 = 0l;
        FDIV fdiv0 = new FDIV();
        ConstantPoolGen constantpoolgen0 = null;
        fdiv0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "DuyU";
        String str1 = "AalDvwIjY";
        String str2 = "tAlZ";
        constantpoolgen1.addInterfaceMethodref(str0, str1, str2);
        fdiv0.consumeStack(constantpoolgen1);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        fdiv0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen2 = null;
        fdiv0.consumeStack(constantpoolgen2);
        ConstantPoolGen constantpoolgen3 = null;
        fdiv0.consumeStack(constantpoolgen3);
        InstructionHandle instructionhandle0 = new InstructionHandle(fdiv0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test5() throws Throwable {
        Integer i0 = -185;
        int i1 = 0;
        INVOKEDYNAMIC invokedynamic0 = new INVOKEDYNAMIC(i1);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "";
        String str1 = "IlJHG";
        String str2 = "QlfKCRCU";
        constantpoolgen0.lookupFieldref(str0, str1, str2);
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupMethodref(methodgen0);
        invokedynamic0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        invokedynamic0.dump(dataoutputstream0);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        invokedynamic0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen1 = null;
        invokedynamic0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        invokedynamic0.produceStack(constantpoolgen2);
        invokedynamic0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(invokedynamic0);
        HashMap hashmap0 = new HashMap();
        String str3 = "sW";
        Byte byte0 = -55;
        hashmap0.put(str3, byte0);
        String str4 = "VUznQCpwp";
        Byte byte1 = -22;
        hashmap0.put(str4, byte1);
        String str5 = "nrToQ";
        Byte byte2 = 98;
        hashmap0.put(str5, byte2);
        String str6 = "YBIFZzA";
        Byte byte3 = 85;
        hashmap0.put(str6, byte3);
        String str7 = "AENtpbFhe";
        Byte byte4 = -47;
        hashmap0.put(str7, byte4);
        String str8 = "hNyDZD";
        Byte byte5 = -45;
        hashmap0.put(str8, byte5);
        String str9 = "";
        Byte byte6 = -126;
        hashmap0.put(str9, byte6);
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test6() throws Throwable {
        Byte byte0 = -57;
        int i0 = 80;
        LDC2_W ldc2_w0 = new LDC2_W(i0);
        ldc2_w0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(ldc2_w0);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test7() throws Throwable {
        Long l0 = 1l;
        int i0 = 0;
        GETSTATIC getstatic0 = new GETSTATIC(i0);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        IALOAD iaload0 = null;
        executionvisitor0.visitIALOAD(iaload0);
        StoreInstruction storeinstruction0 = null;
        executionvisitor0.visitStoreInstruction(storeinstruction0);
        FCMPG fcmpg0 = null;
        executionvisitor0.visitFCMPG(fcmpg0);
        INVOKESTATIC invokestatic0 = null;
        executionvisitor0.visitINVOKESTATIC(invokestatic0);
        ExceptionThrower exceptionthrower0 = null;
        executionvisitor0.visitExceptionThrower(exceptionthrower0);
        LRETURN lreturn0 = null;
        executionvisitor0.visitLRETURN(lreturn0);
        SALOAD saload0 = null;
        executionvisitor0.visitSALOAD(saload0);
        getstatic0.accept(executionvisitor0);
        getstatic0.copy();
        ExecutionVisitor executionvisitor1 = new ExecutionVisitor();
        IAND iand0 = null;
        executionvisitor1.visitIAND(iand0);
        DMUL dmul0 = null;
        executionvisitor1.visitDMUL(dmul0);
        ISHR ishr0 = null;
        executionvisitor1.visitISHR(ishr0);
        IF_ICMPLE if_icmple0 = null;
        executionvisitor1.visitIF_ICMPLE(if_icmple0);
        IFLE ifle0 = null;
        executionvisitor1.visitIFLE(ifle0);
        AllocationInstruction allocationinstruction0 = null;
        executionvisitor1.visitAllocationInstruction(allocationinstruction0);
        DUP2_X2 dup2_x20 = null;
        executionvisitor1.visitDUP2_X2(dup2_x20);
        getstatic0.accept(executionvisitor1);
        InstructionHandle instructionhandle0 = new InstructionHandle(getstatic0);
        HashMap hashmap0 = new HashMap();
        String str0 = "YoykPYK";
        Byte byte0 = -64;
        hashmap0.put(str0, byte0);
        String str1 = "edttDhMB";
        Byte byte1 = -101;
        hashmap0.put(str1, byte1);
        String str2 = "kpAkdV";
        Byte byte2 = -10;
        hashmap0.put(str2, byte2);
        String str3 = "oQ";
        Byte byte3 = -66;
        hashmap0.put(str3, byte3);
        String str4 = "xWg";
        Byte byte4 = -111;
        hashmap0.put(str4, byte4);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test8() throws Throwable {
        Integer i0 = -1;
        NOP nop0 = new NOP();
        nop0.copy();
        ConstantPoolGen constantpoolgen0 = null;
        nop0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        ArrayType arraytype0 = null;
        constantpoolgen1.addArrayClass(arraytype0);
        int i1 = 125;
        constantpoolgen1.setSize(i1);
        MethodGen methodgen0 = null;
        constantpoolgen1.addInterfaceMethodref(methodgen0);
        int i2 = 1;
        constantpoolgen1.lookupInteger(i2);
        nop0.produceStack(constantpoolgen1);
        DataOutputStream dataoutputstream0 = null;
        nop0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(nop0);
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test9() throws Throwable {
        Long l0 = -741l;
        ATHROW athrow0 = new ATHROW();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        athrow0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        float f0 = -2.534851f;
        constantpoolgen1.lookupFloat(f0);
        long l1 = 762l;
        constantpoolgen1.addLong(l1);
        athrow0.consumeStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(athrow0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test10() throws Throwable {
        String str0 = "";
        LAND land0 = new LAND();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        land0.initFromFile(bytesequence0, b0);
        land0.copy();
        DataOutputStream dataoutputstream0 = null;
        land0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str1 = "ASnED";
        String str2 = "IcPwRKGoT";
        String str3 = "sAGw";
        constantpoolgen0.addInterfaceMethodref(str1, str2, str3);
        long l0 = -471l;
        constantpoolgen0.addLong(l0);
        int i0 = 130;
        constantpoolgen0.setIndex(i0);
        double d0 = -29.9598384606754;
        constantpoolgen0.lookupDouble(d0);
        land0.consumeStack(constantpoolgen0);
        land0.copy();
        byte[] arr0 = new byte[2];
        byte byte0 = 42;
        arr0[0] = byte0;
        byte byte1 = -2;
        arr0[1] = byte1;
        ByteSequence bytesequence1 = new ByteSequence(arr0);
        boolean b1 = true;
        land0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle0 = new InstructionHandle(land0);
        HashMap hashmap0 = new HashMap();
        String str4 = "";
        Byte byte2 = -44;
        hashmap0.put(str4, byte2);
        String str5 = "";
        Byte byte3 = -58;
        hashmap0.put(str5, byte3);
        String str6 = "GueUGNSY";
        Byte byte4 = -118;
        hashmap0.put(str6, byte4);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test11() throws Throwable {
        Byte byte0 = 4;
        IXOR ixor0 = new IXOR();
        Visitor visitor0 = null;
        ixor0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(ixor0);
        Object obj0 = instructionhandle0.getAttribute(byte0);
    }

    @Test
    public void test12() throws Throwable {
        String str0 = "dx";
        int i0 = 75;
        FLOAD fload0 = new FLOAD(i0);
        InstructionHandle instructionhandle0 = new InstructionHandle(fload0);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test13() throws Throwable {
        Integer i0 = -1;
        int i1 = 138;
        LDC ldc0 = new LDC(i1);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "KQ";
        constantpoolgen0.lookupString(str0);
        MethodGen methodgen0 = null;
        constantpoolgen0.lookupInterfaceMethodref(methodgen0);
        ldc0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(ldc0);
        HashMap hashmap0 = new HashMap();
        String str1 = "P";
        Byte byte0 = 78;
        hashmap0.put(str1, byte0);
        String str2 = "uu";
        Byte byte1 = -47;
        hashmap0.put(str2, byte1);
        String str3 = "qCzbn";
        Byte byte2 = 107;
        hashmap0.put(str3, byte2);
        String str4 = "HLZMOir";
        Byte byte3 = -25;
        hashmap0.put(str4, byte3);
        String str5 = "ZSgtUPbG";
        Byte byte4 = 40;
        hashmap0.put(str5, byte4);
        String str6 = "aWbm";
        Byte byte5 = -65;
        hashmap0.put(str6, byte5);
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test14() throws Throwable {
        Long l0 = -949l;
        DUP_X2 dup_x20 = new DUP_X2();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        dup_x20.initFromFile(bytesequence0, b0);
        byte[] arr0 = new byte[1];
        byte byte0 = -48;
        arr0[0] = byte0;
        ByteSequence bytesequence1 = new ByteSequence(arr0);
        boolean b1 = true;
        dup_x20.initFromFile(bytesequence1, b1);
        DataOutputStream dataoutputstream0 = null;
        dup_x20.dump(dataoutputstream0);
        DataOutputStream dataoutputstream1 = null;
        dup_x20.dump(dataoutputstream1);
        dup_x20.copy();
        Visitor visitor0 = null;
        dup_x20.accept(visitor0);
        dup_x20.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dup_x20);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test15() throws Throwable {
        Long l0 = -1l;
        int i0 = 1;
        FLOAD fload0 = new FLOAD(i0);
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        FLOAD fload1 = null;
        executionvisitor0.visitFLOAD(fload1);
        IFNULL ifnull0 = null;
        executionvisitor0.visitIFNULL(ifnull0);
        D2F d2f0 = null;
        executionvisitor0.visitD2F(d2f0);
        IFNULL ifnull1 = null;
        executionvisitor0.visitIFNULL(ifnull1);
        Select select0 = null;
        executionvisitor0.visitSelect(select0);
        LDC2_W ldc2_w0 = null;
        executionvisitor0.visitLDC2_W(ldc2_w0);
        ISHR ishr0 = null;
        executionvisitor0.visitISHR(ishr0);
        fload0.accept(executionvisitor0);
        fload0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(fload0);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test16() throws Throwable {
        Integer i0 = 92;
        I2S i2s0 = new I2S();
        DataOutputStream dataoutputstream0 = null;
        i2s0.dump(dataoutputstream0);
        i2s0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        i2s0.produceStack(constantpoolgen0);
        Visitor visitor0 = null;
        i2s0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(i2s0);
        HashMap hashmap0 = new HashMap();
        String str0 = "AwKL";
        Byte byte0 = 35;
        hashmap0.put(str0, byte0);
        String str1 = "w";
        Byte byte1 = 73;
        hashmap0.put(str1, byte1);
        String str2 = "k";
        Byte byte2 = -125;
        hashmap0.put(str2, byte2);
        String str3 = "iNqY";
        Byte byte3 = -122;
        hashmap0.put(str3, byte3);
        String str4 = "N";
        Byte byte4 = 63;
        hashmap0.put(str4, byte4);
        String str5 = "OdvEwmJjQ";
        Byte byte5 = -19;
        hashmap0.put(str5, byte5);
        String str6 = "of";
        Byte byte6 = 47;
        hashmap0.put(str6, byte6);
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test17() throws Throwable {
        Integer i0 = 90;
        DCMPL dcmpl0 = new DCMPL();
        dcmpl0.copy();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "iKWdLb";
        String str1 = "oSDdh";
        String str2 = "Zs";
        constantpoolgen0.lookupMethodref(str0, str1, str2);
        String str3 = "hJSJW";
        constantpoolgen0.lookupClass(str3);
        String str4 = "Ms";
        String str5 = "GqsgP";
        String str6 = "m";
        constantpoolgen0.addInterfaceMethodref(str4, str5, str6);
        String str7 = "aQiWxoAL";
        constantpoolgen0.addString(str7);
        ArrayType arraytype0 = null;
        constantpoolgen0.addArrayClass(arraytype0);
        dcmpl0.consumeStack(constantpoolgen0);
        Visitor visitor0 = null;
        dcmpl0.accept(visitor0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str8 = "FcO";
        String str9 = "nbEfNb";
        constantpoolgen1.lookupNameAndType(str8, str9);
        long l0 = 905l;
        constantpoolgen1.lookupLong(l0);
        String str10 = "";
        String str11 = "iWS";
        String str12 = "PkXCfC";
        constantpoolgen1.addFieldref(str10, str11, str12);
        dcmpl0.produceStack(constantpoolgen1);
        Visitor visitor1 = null;
        dcmpl0.accept(visitor1);
        InstructionHandle instructionhandle0 = new InstructionHandle(dcmpl0);
        Object obj0 = instructionhandle0.getAttribute(i0);
    }

    @Test
    public void test18() throws Throwable {
        String str0 = "hUAPH";
        FDIV fdiv0 = new FDIV();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        float f0 = 0.0f;
        constantpoolgen0.lookupFloat(f0);
        String str1 = "BFv";
        String str2 = "rBHigd";
        constantpoolgen0.lookupNameAndType(str1, str2);
        String str3 = "";
        constantpoolgen0.lookupClass(str3);
        fdiv0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        fdiv0.produceStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        fdiv0.produceStack(constantpoolgen2);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        fdiv0.initFromFile(bytesequence0, b0);
        fdiv0.copy();
        byte[] arr0 = new byte[1];
        byte byte0 = 84;
        arr0[0] = byte0;
        ByteSequence bytesequence1 = new ByteSequence(arr0);
        boolean b1 = true;
        fdiv0.initFromFile(bytesequence1, b1);
        InstructionHandle instructionhandle0 = new InstructionHandle(fdiv0);
        HashMap hashmap0 = new HashMap();
        String str4 = "dUXjzVMtl";
        Byte byte1 = -2;
        hashmap0.put(str4, byte1);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }

    @Test
    public void test19() throws Throwable {
        Long l0 = 111l;
        IXOR ixor0 = new IXOR();
        ExecutionVisitor executionvisitor0 = new ExecutionVisitor();
        NEW new0 = null;
        executionvisitor0.visitNEW(new0);
        DLOAD dload0 = null;
        executionvisitor0.visitDLOAD(dload0);
        ixor0.accept(executionvisitor0);
        byte[] arr0 = new byte[2];
        byte byte0 = 36;
        arr0[0] = byte0;
        byte byte1 = -46;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        ixor0.initFromFile(bytesequence0, b0);
        InstConstraintVisitor instconstraintvisitor0 = new InstConstraintVisitor();
        DUP dup0 = null;
        instconstraintvisitor0.visitDUP(dup0);
        IAND iand0 = null;
        instconstraintvisitor0.visitIAND(iand0);
        ixor0.accept(instconstraintvisitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(ixor0);
        HashMap hashmap0 = new HashMap();
        String str0 = "LwIpfQ";
        Byte byte2 = 30;
        hashmap0.put(str0, byte2);
        String str1 = "PAGQKQN";
        Byte byte3 = -122;
        hashmap0.put(str1, byte3);
        String str2 = "qBAwNz";
        Byte byte4 = 67;
        hashmap0.put(str2, byte4);
        String str3 = "fJfRDV";
        Byte byte5 = 116;
        hashmap0.put(str3, byte5);
        String str4 = "";
        Byte byte6 = 6;
        hashmap0.put(str4, byte6);
        String str5 = "dv";
        Byte byte7 = 47;
        hashmap0.put(str5, byte7);
        Object obj0 = instructionhandle0.getAttribute(l0);
    }

    @Test
    public void test20() throws Throwable {
        String str0 = "rbmxYmTeF";
        LAND land0 = new LAND();
        land0.copy();
        Visitor visitor0 = null;
        land0.accept(visitor0);
        InstructionHandle instructionhandle0 = new InstructionHandle(land0);
        HashMap hashmap0 = new HashMap();
        String str1 = "zeAyKVu";
        Byte byte0 = -115;
        hashmap0.put(str1, byte0);
        String str2 = "";
        Byte byte1 = -115;
        hashmap0.put(str2, byte1);
        String str3 = "";
        Byte byte2 = 19;
        hashmap0.put(str3, byte2);
        String str4 = "kFc";
        Byte byte3 = 122;
        hashmap0.put(str4, byte3);
        Object obj0 = instructionhandle0.getAttribute(str0);
    }
}

