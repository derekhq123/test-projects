/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.bcel.generic;

/**
 * Denotes an unparameterized instruction to load a value from a local
 * variable, e.g. ILOAD.
 *
 * @version $Id: LoadInstruction.java 1747278 2016-06-07 17:28:43Z britter $
 */
public abstract class LoadInstruction extends LocalVariableInstruction implements PushInstruction {

    /**
     * Empty constructor needed for the Class.newInstance() statement in
     * Instruction.readInstruction(). Not to be used otherwise.
     * tag and length are defined in readInstruction and initFromFile, respectively.
     */
    LoadInstruction(final short canon_tag, final short c_tag) {
        super(canon_tag, c_tag);
    }


    /**
     * @param opcode Instruction opcode
     * @param c_tag Instruction number for compact version, ALOAD_0, e.g.
     * @param n local variable index (unsigned short)
     */
    public LoadInstruction(final short opcode, final short c_tag, final int n) {
        super(opcode, c_tag, n);
    }


    /**
     * Call corresponding visitor method(s). The order is:
     * Call visitor methods of implemented interfaces first, then
     * call methods according to the class hierarchy in descending order,
     * i.e., the most specific visitXXX() call comes last.
     *
     * @param v Visitor object
     */
    @Override
    public void accept( final Visitor v ) {
        v.visitStackProducer(this);
        v.visitPushInstruction(this);
        v.visitTypedInstruction(this);
        v.visitLocalVariableInstruction(this);
        v.visitLoadInstruction(this);
    }
}
