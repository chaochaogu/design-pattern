package com.chaochaogu.design.pattern.template.common;

/**
 * 抽象类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class AbstractClass {
    /**
     * 基本方法
     */
    protected abstract void doSomething();

    /**
     * 基本方法
     */
    protected abstract void doAnything();

    /**
     * 模板方法
     */
    public void templateMethod() {
        // 调用基本方法
        this.doSomething();
        this.doAnything();
    }
}
