package com.apm.log.plugins;

import com.apm.log.adapter.ChangeVersionAdapter;
import org.objectweb.asm.ClassReader;
import org.objectweb.asm.ClassWriter;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2019/11/6 7:52 下午
 **/
public class TimerPlugin implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        ClassReader cr = new ClassReader(classfileBuffer);
        ClassWriter cw = new ClassWriter(cr, 0);
        ChangeVersionAdapter ca = new ChangeVersionAdapter(cw);
        cr.accept(ca, 0);
        byte[] b2 = cw.toByteArray();
        return b2;
    }
}
