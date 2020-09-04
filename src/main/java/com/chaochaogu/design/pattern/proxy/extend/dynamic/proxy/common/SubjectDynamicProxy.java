package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.common;

import java.lang.reflect.Proxy;

/**
 * 具体业务的动态代理
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
