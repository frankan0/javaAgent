package com.onenavigation.plugins;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * @author tanyuanpeng
 * @desciption
 * @date 2019/11/6 7:14 下午
 **/
public class ClassLogger implements ClassFileTransformer {

    private final static Logger LOG = LoggerFactory.getLogger(ClassLogger.class);

    @Override
    public byte[] transform(ClassLoader loader, String className, Class<?> classBeingRedefined, ProtectionDomain protectionDomain, byte[] classfileBuffer) throws IllegalClassFormatException {
        LOG.info("log class:{}",className);
        return classfileBuffer;
    }
}
