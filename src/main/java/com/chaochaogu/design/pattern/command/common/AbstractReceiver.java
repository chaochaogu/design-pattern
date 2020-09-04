package com.chaochaogu.design.pattern.command.common;

/**
 * 通用Receiver类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public abstract class AbstractReceiver {

    /**
     * 抽象接收者，定义每个接收者都必须完成的业务
     */
    public abstract void doSomething();
}
