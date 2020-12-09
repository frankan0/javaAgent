package com.apm.log.adapter;

import jdk.internal.org.objectweb.asm.ClassVisitor;
import jdk.internal.org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2020/4/26 7:10 下午
 **/
public class UsedTimeAdapter extends ClassVisitor {

    public UsedTimeAdapter(ClassVisitor cv) {
        super(Opcodes.ASM7, cv);
    }

    @Override
    public MethodVisitor visitMethod(int i, String s, String s1, String s2, String[] strings) {
        //添加计时器
        //方法添加一行代码
        //
        return super.visitMethod(i, s, s1, s2, strings);
    }
}
