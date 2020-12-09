package com.apm.log.adapter;

import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2020/4/26 7:03 下午
 **/
public class RemoveMethodAdapter extends ClassVisitor {

    private final static Logger LOG = LoggerFactory.getLogger(RemoveMethodAdapter.class);

    private String mName;
    private String mDesc;

    public RemoveMethodAdapter(
            ClassVisitor cv, String mName, String mDesc) {
        super(Opcodes.ASM7, cv);
        this.mName = mName;
        this.mDesc = mDesc;
    }

    @Override
    public MethodVisitor visitMethod(int access, String name, String descriptor, String signature, String[] exceptions) {
        LOG.info("visit method :{}",name);
        if (name.equals(mName) && descriptor.equals(mDesc)) {
            // do not delegate to next visitor -> this removes the method
            return null;
        }
        return cv.visitMethod(access, name, descriptor, signature, exceptions);
    }
}
