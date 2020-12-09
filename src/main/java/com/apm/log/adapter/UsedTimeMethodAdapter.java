package com.apm.log.adapter;

import jdk.internal.org.objectweb.asm.MethodVisitor;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2020/4/27 9:37 上午
 **/
public class UsedTimeMethodAdapter extends MethodVisitor {


    public UsedTimeMethodAdapter(int i, MethodVisitor methodVisitor) {
        super(i, methodVisitor);
    }
}
