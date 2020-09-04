package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.common;

/**
 * 动态代理场景类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();
        MyInvocationHandler handler = new MyInvocationHandler(realSubject);
        ClassLoader classLoader = realSubject.getClass().getClassLoader();
        Subject proxy = DynamicProxy.newProxyInstance(classLoader, realSubject.getClass().getInterfaces(), handler);
        proxy.doSomething("fishing");

        Subject subProxy = SubjectDynamicProxy.newProxyInstance(realSubject);
        subProxy.doSomething("sleeping");
    }
}
