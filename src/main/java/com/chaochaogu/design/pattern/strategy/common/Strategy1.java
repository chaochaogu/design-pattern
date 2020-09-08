package com.chaochaogu.design.pattern.strategy.common;

/**
 * 具体策略角色1
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Strategy1 implements IStrategy {

    @Override
    public void doSomething() {
        System.out.println("具体策略1的运算法则");
    }
}
