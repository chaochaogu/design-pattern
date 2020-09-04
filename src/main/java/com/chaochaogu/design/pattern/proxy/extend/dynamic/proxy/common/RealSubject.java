package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.common;

/**
 * 真实主题类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("doSomething under ground ..." + str);
    }
}
