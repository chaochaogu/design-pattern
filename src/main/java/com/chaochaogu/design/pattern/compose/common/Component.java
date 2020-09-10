package com.chaochaogu.design.pattern.compose.common;

/**
 * 抽象构件
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public abstract class Component {

    /**
     * 个体和整体都拥有的共享
     */
    public void doSomething() {
        // 编写业务逻辑
        System.out.println("surfing");
    }
}
