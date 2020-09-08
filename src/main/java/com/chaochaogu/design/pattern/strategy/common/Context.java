package com.chaochaogu.design.pattern.strategy.common;

/**
 * 封装角色
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Context {

    /**
     * 抽象策略
     */
    private IStrategy strategy;

    /**
     * 构造函数，设置具体策略
     *
     * @param strategy
     */
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 封装后的策略方法
     */
    public void doAnything() {
        this.strategy.doSomething();
    }
}
