package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的Handler类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class MyInvocationHandler implements InvocationHandler {

    /**
     * 被代理的对象
     */
    private Object target;

    /**
     * 通过构造函数传递一个对象
     *
     * @param obj
     */
    public MyInvocationHandler(Object obj) {
        this.target = obj;
    }

    /**
     * 代理方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行被代理的方法
        return method.invoke(this.target, args);
    }
}
