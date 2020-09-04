package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.common;

/**
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class BeforeAdvice implements IAdvice {

    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了！");
    }
}
