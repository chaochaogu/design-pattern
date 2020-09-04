package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.common;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            // 执行一个前置通知
            new BeforeAdvice().exec();
        }
        // 执行目标，并返回结果
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
