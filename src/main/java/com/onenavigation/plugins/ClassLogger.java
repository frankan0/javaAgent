package com.onenavigation.plugins;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2019/11/6 7:14 下午
 **/
public class ClassLogger implements ClassFileTransformer {

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        System.out.println("log class:"+className);
        return classfileBuffer;
    }
}
