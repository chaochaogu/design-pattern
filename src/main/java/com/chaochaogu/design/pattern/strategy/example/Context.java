package com.chaochaogu.design.pattern.strategy.example;

/**
 * 锦囊
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Context {
    private IStrategy strategy;

    /**
     * 构造函数，你要使用哪个妙计
     *
     * @param strategy
     */
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 使用计谋
     */
    public void operate() {
        this.strategy.operate();
    }
}
