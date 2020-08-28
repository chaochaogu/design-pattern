package com.chaochaogu.design.pattern.abstractfactory.common;

/**
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class AbstractProductA {
    /**
     * 每个产品共有的方法
     */
    void shareMethod() {
    }

    /**
     * 每个产品相同方法，不同实现
     */
    abstract void doSomething();
}
