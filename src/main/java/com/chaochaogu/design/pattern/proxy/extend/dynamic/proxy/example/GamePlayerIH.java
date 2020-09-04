package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class GamePlayerIH implements InvocationHandler {

    /**
     * 被代理者
     */
    private Class cls;

    /**
     * 被代理的实例
     */
    private Object obj;

    /**
     * 我要代理谁
     *
     * @param obj
     */
    public GamePlayerIH(Object obj) {
        this.obj = obj;
    }

    /**
     * 调用被代理的方法
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if ("login".equalsIgnoreCase(method.getName())) {
            System.out.println("有人在用我的账号登录！");
        }
        return result;
    }
}
