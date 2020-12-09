package com.apm.log.adapter;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.Opcodes;

import static org.objectweb.asm.Opcodes.V1_5;

public class ChangeVersionAdapter extends ClassVisitor {


    public ChangeVersionAdapter(ClassVisitor cv) {
        super(Opcodes.ASM7, cv);
    }

    @Override
    public void visit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        cv.visit(V1_5, access, name, signature, superName, interfaces);
    }
}