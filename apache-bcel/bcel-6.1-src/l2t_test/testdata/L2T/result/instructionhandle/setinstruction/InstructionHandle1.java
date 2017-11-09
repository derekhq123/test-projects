package testdata.L2T.result.instructionhandle.setinstruction;

import org.apache.bcel.generic.FNEG;
import org.apache.bcel.generic.I2S;
import org.apache.bcel.generic.LXOR;
import org.apache.bcel.generic.RETURN;
import org.apache.bcel.generic.IOR;
import org.apache.bcel.generic.CASTORE;
import org.apache.bcel.generic.LAND;
import org.apache.bcel.generic.IRETURN;
import java.io.DataOutputStream;
import org.apache.bcel.generic.ConstantPoolGen;
import org.apache.bcel.generic.LCMP;
import org.apache.bcel.generic.SALOAD;
import org.apache.bcel.generic.DMUL;
import org.apache.bcel.generic.ARETURN;
import org.apache.bcel.generic.MethodGen;
import org.apache.bcel.generic.ArrayType;
import org.apache.bcel.generic.SIPUSH;
import org.apache.bcel.util.ByteSequence;
import org.apache.bcel.generic.InstructionTargeter;
import org.apache.bcel.generic.DUP_X2;
import org.apache.bcel.generic.I2B;
import org.apache.bcel.generic.I2D;
import org.apache.bcel.generic.AALOAD;
import org.apache.bcel.generic.DUP2_X1;
import org.apache.bcel.generic.InstructionHandle;
import org.apache.bcel.generic.I2L;
import org.apache.bcel.generic.DDIV;
import org.apache.bcel.generic.FCMPL;
import org.apache.bcel.generic.ISHR;
import org.apache.bcel.generic.ISUB;
import org.apache.bcel.generic.IFNULL;
import org.apache.bcel.generic.IFNONNULL;
import org.apache.bcel.classfile.Constant;
import java.lang.String;
import org.apache.bcel.generic.IASTORE;
import org.apache.bcel.generic.GETSTATIC;
import org.apache.bcel.generic.POP2;
import org.apache.bcel.generic.ObjectType;
import org.apache.bcel.generic.LCONST;
import org.apache.bcel.generic.FRETURN;
import org.apache.bcel.generic.LSHL;
import org.junit.Test;
import org.apache.bcel.generic.LSHR;
import org.apache.bcel.generic.LSUB;
import org.apache.bcel.generic.IFLE;
import org.apache.bcel.generic.F2D;
import org.apache.bcel.generic.PUTFIELD;
import org.apache.bcel.generic.DCONST;
import org.apache.bcel.generic.L2D;
import org.apache.bcel.generic.DADD;
import org.apache.bcel.generic.F2I;
import org.apache.bcel.generic.D2I;
import org.apache.bcel.generic.Visitor;
import org.apache.bcel.generic.F2L;

@SuppressWarnings("deprecation")
public class InstructionHandle1 {

    @Test
    public void test1() throws Throwable {
        long l0 = 0l;
        LCONST lconst0 = new LCONST(l0);
        short s0 = -100;
        FNEG fneg0 = new FNEG();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "b";
        constantpoolgen0.addClass(str0);
        ArrayType arraytype0 = null;
        constantpoolgen0.addArrayClass(arraytype0);
        fneg0.consumeStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        fneg0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = null;
        fneg0.consumeStack(constantpoolgen1);
        fneg0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(fneg0);
        instructionhandle0.setInstruction(lconst0);
    }

    @Test
    public void test2() throws Throwable {
        IOR ior0 = new IOR();
        short s0 = -100;
        IASTORE iastore0 = new IASTORE();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        double d0 = 0.0;
        constantpoolgen0.addDouble(d0);
        Constant constant0 = null;
        ConstantPoolGen constantpoolgen1 = null;
        constantpoolgen0.addConstant(constant0, constantpoolgen1);
        double d1 = -50.76232409060011;
        constantpoolgen0.addDouble(d1);
        iastore0.consumeStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen2 = null;
        iastore0.consumeStack(constantpoolgen2);
        iastore0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(iastore0);
        instructionhandle0.setInstruction(ior0);
    }

    @Test
    public void test3() throws Throwable {
        LSHR lshr0 = new LSHR();
        InstructionHandle instructionhandle0 = new InstructionHandle(lshr0);
        int i0 = 0;
        int i1 = -124;
        instructionhandle0.updatePosition(i0, i1);
        instructionhandle0.hasTargeters();
        int i2 = 0;
        instructionhandle0.setI_position(i2);
        InstructionTargeter instructiontargeter0 = null;
        instructionhandle0.removeTargeter(instructiontargeter0);
        InstructionHandle instructionhandle1 = null;
        IFNULL ifnull0 = new IFNULL(instructionhandle1);
        instructionhandle0.addTargeter(ifnull0);
        Visitor visitor0 = null;
        instructionhandle0.accept(visitor0);
        IFNONNULL ifnonnull0 = new IFNONNULL(instructionhandle0);
        short s0 = -100;
        AALOAD aaload0 = new AALOAD();
        DataOutputStream dataoutputstream0 = null;
        aaload0.dump(dataoutputstream0);
        aaload0.copy();
        InstructionHandle instructionhandle2 = new InstructionHandle(aaload0);
        FRETURN freturn0 = new FRETURN();
        instructionhandle2.setInstruction(freturn0);
        instructionhandle2.setInstruction(ifnonnull0);
    }

    @Test
    public void test4() throws Throwable {
        SALOAD saload0 = new SALOAD();
        short s0 = -100;
        F2I f2i0 = new F2I();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        Constant constant0 = null;
        ConstantPoolGen constantpoolgen1 = null;
        constantpoolgen0.addConstant(constant0, constantpoolgen1);
        int i0 = 107;
        constantpoolgen0.lookupInteger(i0);
        String str0 = "";
        constantpoolgen0.addUtf8(str0);
        int i1 = 113;
        Constant constant1 = null;
        constantpoolgen0.setConstant(i1, constant1);
        String str1 = "OvdsHUxD";
        constantpoolgen0.lookupString(str1);
        f2i0.produceStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        f2i0.initFromFile(bytesequence0, b0);
        f2i0.copy();
        f2i0.copy();
        f2i0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(f2i0);
        IASTORE iastore0 = new IASTORE();
        instructionhandle0.setInstruction(iastore0);
        instructionhandle0.setInstruction(saload0);
    }

    @Test
    public void test5() throws Throwable {
        DUP_X2 dup_x20 = new DUP_X2();
        short s0 = -59;
        I2B i2b0 = new I2B();
        byte[] arr0 = new byte[1];
        byte byte0 = -36;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = false;
        i2b0.initFromFile(bytesequence0, b0);
        ByteSequence bytesequence1 = null;
        boolean b1 = false;
        i2b0.initFromFile(bytesequence1, b1);
        i2b0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(i2b0);
        instructionhandle0.setInstruction(dup_x20);
    }

    @Test
    public void test6() throws Throwable {
        POP2 pop20 = new POP2();
        short s0 = -4;
        int i0 = 149;
        PUTFIELD putfield0 = new PUTFIELD(i0);
        InstructionHandle instructionhandle0 = new InstructionHandle(putfield0);
        instructionhandle0.setInstruction(pop20);
    }

    @Test
    public void test7() throws Throwable {
        short s0 = -45;
        SIPUSH sipush0 = new SIPUSH(s0);
        short s1 = -39;
        LSHL lshl0 = new LSHL();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        String str0 = "heZS";
        constantpoolgen0.lookupString(str0);
        String str1 = "zv";
        String str2 = "";
        String str3 = "SiUSPbt";
        constantpoolgen0.lookupFieldref(str1, str2, str3);
        Constant constant0 = null;
        ConstantPoolGen constantpoolgen1 = null;
        constantpoolgen0.addConstant(constant0, constantpoolgen1);
        ObjectType objecttype0 = null;
        constantpoolgen0.addClass(objecttype0);
        MethodGen methodgen0 = null;
        constantpoolgen0.addInterfaceMethodref(methodgen0);
        constantpoolgen0.adjustSize();
        lshl0.consumeStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        lshl0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen2 = null;
        lshl0.produceStack(constantpoolgen2);
        InstructionHandle instructionhandle0 = new InstructionHandle(lshl0);
        instructionhandle0.setInstruction(sipush0);
    }

    @Test
    public void test8() throws Throwable {
        IRETURN ireturn0 = new IRETURN();
        short s0 = -98;
        F2D f2d0 = new F2D();
        byte[] arr0 = new byte[1];
        byte byte0 = -44;
        arr0[0] = byte0;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        f2d0.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = null;
        f2d0.produceStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        f2d0.dump(dataoutputstream0);
        InstructionHandle instructionhandle0 = new InstructionHandle(f2d0);
        instructionhandle0.setInstruction(ireturn0);
    }

    @Test
    public void test9() throws Throwable {
        double d0 = 0.0;
        DCONST dconst0 = new DCONST(d0);
        short s0 = -43;
        F2D f2d0 = new F2D();
        InstructionHandle instructionhandle0 = new InstructionHandle(f2d0);
        LSHL lshl0 = new LSHL();
        instructionhandle0.setInstruction(lshl0);
        instructionhandle0.setInstruction(dconst0);
    }

    @Test
    public void test10() throws Throwable {
        ISHR ishr0 = new ISHR();
        short s0 = -38;
        LSUB lsub0 = new LSUB();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        long l0 = 0l;
        constantpoolgen0.lookupLong(l0);
        String str0 = "zXuEGczqq";
        String str1 = "jFM";
        String str2 = "BIH";
        constantpoolgen0.addMethodref(str0, str1, str2);
        String str3 = "mFcWtwbLw";
        constantpoolgen0.lookupUtf8(str3);
        lsub0.consumeStack(constantpoolgen0);
        InstructionHandle instructionhandle0 = new InstructionHandle(lsub0);
        SALOAD saload0 = new SALOAD();
        instructionhandle0.setInstruction(saload0);
        instructionhandle0.setInstruction(ishr0);
    }

    @Test
    public void test11() throws Throwable {
        DUP_X2 dup_x20 = new DUP_X2();
        short s0 = 3;
        LSUB lsub0 = new LSUB();
        lsub0.copy();
        ConstantPoolGen constantpoolgen0 = null;
        lsub0.consumeStack(constantpoolgen0);
        DataOutputStream dataoutputstream0 = null;
        lsub0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = null;
        lsub0.consumeStack(constantpoolgen1);
        ConstantPoolGen constantpoolgen2 = null;
        lsub0.consumeStack(constantpoolgen2);
        InstructionHandle instructionhandle0 = new InstructionHandle(lsub0);
        DDIV ddiv0 = new DDIV();
        instructionhandle0.setInstruction(ddiv0);
        instructionhandle0.setInstruction(dup_x20);
    }

    @Test
    public void test12() throws Throwable {
        IASTORE iastore0 = new IASTORE();
        short s0 = 7;
        LXOR lxor0 = new LXOR();
        DataOutputStream dataoutputstream0 = null;
        lxor0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen0 = null;
        lxor0.produceStack(constantpoolgen0);
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        lxor0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(lxor0);
        instructionhandle0.setInstruction(iastore0);
    }

    @Test
    public void test13() throws Throwable {
        SALOAD saload0 = new SALOAD();
        short s0 = 30;
        F2L f2l0 = new F2L();
        InstructionHandle instructionhandle0 = new InstructionHandle(f2l0);
        CASTORE castore0 = new CASTORE();
        instructionhandle0.setInstruction(castore0);
        instructionhandle0.setInstruction(saload0);
    }

    @Test
    public void test14() throws Throwable {
        L2D l2d0 = new L2D();
        short s0 = -68;
        D2I d2i0 = new D2I();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        Constant[] arr0 = null;
        constantpoolgen0.setConstants(arr0);
        ObjectType objecttype0 = null;
        constantpoolgen0.addClass(objecttype0);
        d2i0.produceStack(constantpoolgen0);
        d2i0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(d2i0);
        instructionhandle0.setInstruction(l2d0);
    }

    @Test
    public void test15() throws Throwable {
        RETURN return0 = new RETURN();
        short s0 = 79;
        LCMP lcmp0 = new LCMP();
        DataOutputStream dataoutputstream0 = null;
        lcmp0.dump(dataoutputstream0);
        ByteSequence bytesequence0 = null;
        boolean b0 = true;
        lcmp0.initFromFile(bytesequence0, b0);
        DataOutputStream dataoutputstream1 = null;
        lcmp0.dump(dataoutputstream1);
        InstructionHandle instructionhandle0 = new InstructionHandle(lcmp0);
        I2L i2l0 = new I2L();
        instructionhandle0.setInstruction(i2l0);
        instructionhandle0.setInstruction(return0);
    }

    @Test
    public void test16() throws Throwable {
        I2D i2d0 = new I2D();
        short s0 = 14;
        RETURN return0 = new RETURN();
        byte[] arr0 = new byte[2];
        byte byte0 = 127;
        arr0[0] = byte0;
        byte byte1 = 4;
        arr0[1] = byte1;
        ByteSequence bytesequence0 = new ByteSequence(arr0);
        boolean b0 = true;
        return0.initFromFile(bytesequence0, b0);
        InstructionHandle instructionhandle0 = new InstructionHandle(return0);
        instructionhandle0.setInstruction(i2d0);
    }

    @Test
    public void test17() throws Throwable {
        I2S i2s0 = new I2S();
        short s0 = 88;
        LAND land0 = new LAND();
        land0.copy();
        ConstantPoolGen constantpoolgen0 = null;
        land0.produceStack(constantpoolgen0);
        ConstantPoolGen constantpoolgen1 = new ConstantPoolGen();
        String str0 = "ThZ";
        String str1 = "KZlk";
        String str2 = "LK";
        constantpoolgen1.lookupInterfaceMethodref(str0, str1, str2);
        int i0 = -10;
        constantpoolgen1.setIndex(i0);
        double d0 = 34.955398315461395;
        constantpoolgen1.addDouble(d0);
        double d1 = 82.4387762686959;
        constantpoolgen1.lookupDouble(d1);
        String str3 = "bUJEhEBf";
        String str4 = "XAZyXMQ";
        String str5 = "I";
        constantpoolgen1.addFieldref(str3, str4, str5);
        MethodGen methodgen0 = null;
        constantpoolgen1.lookupInterfaceMethodref(methodgen0);
        String str6 = "";
        constantpoolgen1.addClass_(str6);
        land0.produceStack(constantpoolgen1);
        InstructionHandle instructionhandle0 = new InstructionHandle(land0);
        instructionhandle0.setInstruction(i2s0);
    }

    @Test
    public void test18() throws Throwable {
        ISUB isub0 = new ISUB();
        short s0 = -21;
        CASTORE castore0 = new CASTORE();
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        int i0 = 0;
        Constant constant0 = null;
        constantpoolgen0.setConstant(i0, constant0);
        String str0 = "x";
        String str1 = "xorE";
        String str2 = "ubrXg";
        constantpoolgen0.lookupInterfaceMethodref(str0, str1, str2);
        String str3 = "xrbPhIY";
        constantpoolgen0.lookupString(str3);
        castore0.produceStack(constantpoolgen0);
        castore0.copy();
        castore0.copy();
        castore0.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(castore0);
        FCMPL fcmpl0 = new FCMPL();
        instructionhandle0.setInstruction(fcmpl0);
        instructionhandle0.setInstruction(isub0);
    }

    @Test
    public void test19() throws Throwable {
        int i0 = 41;
        GETSTATIC getstatic0 = new GETSTATIC(i0);
        short s0 = -26;
        DMUL dmul0 = new DMUL();
        InstructionHandle instructionhandle0 = new InstructionHandle(dmul0);
        instructionhandle0.setInstruction(getstatic0);
    }

    @Test
    public void test20() throws Throwable {
        DUP2_X1 dup2_x10 = new DUP2_X1();
        ByteSequence bytesequence0 = null;
        boolean b0 = false;
        dup2_x10.initFromFile(bytesequence0, b0);
        ConstantPoolGen constantpoolgen0 = new ConstantPoolGen();
        dup2_x10.produceStack(constantpoolgen0);
        dup2_x10.copy();
        ByteSequence bytesequence1 = null;
        boolean b1 = true;
        dup2_x10.initFromFile(bytesequence1, b1);
        dup2_x10.copy();
        ByteSequence bytesequence2 = null;
        boolean b2 = true;
        dup2_x10.initFromFile(bytesequence2, b2);
        dup2_x10.copy();
        InstructionHandle instructionhandle0 = new InstructionHandle(dup2_x10);
        InstructionTargeter instructiontargeter0 = null;
        instructionhandle0.addTargeter(instructiontargeter0);
        DADD dadd0 = new DADD();
        ByteSequence bytesequence3 = null;
        boolean b3 = false;
        dadd0.initFromFile(bytesequence3, b3);
        dadd0.copy();
        ByteSequence bytesequence4 = null;
        boolean b4 = true;
        dadd0.initFromFile(bytesequence4, b4);
        DataOutputStream dataoutputstream0 = null;
        dadd0.dump(dataoutputstream0);
        ConstantPoolGen constantpoolgen1 = null;
        dadd0.produceStack(constantpoolgen1);
        ByteSequence bytesequence5 = null;
        boolean b5 = false;
        dadd0.initFromFile(bytesequence5, b5);
        ConstantPoolGen constantpoolgen2 = null;
        dadd0.produceStack(constantpoolgen2);
        instructionhandle0.setInstruction(dadd0);
        IFLE ifle0 = new IFLE(instructionhandle0);
        short s0 = 54;
        ARETURN areturn0 = new ARETURN();
        areturn0.copy();
        ConstantPoolGen constantpoolgen3 = null;
        areturn0.produceStack(constantpoolgen3);
        DataOutputStream dataoutputstream1 = null;
        areturn0.dump(dataoutputstream1);
        InstructionHandle instructionhandle1 = new InstructionHandle(areturn0);
        I2B i2b0 = new I2B();
        instructionhandle1.setInstruction(i2b0);
        instructionhandle1.setInstruction(ifle0);
    }
}

