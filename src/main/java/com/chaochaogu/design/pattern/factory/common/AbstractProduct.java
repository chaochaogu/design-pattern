package com.chaochaogu.design.pattern.factory.common;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public abstract class AbstractProduct {
    /**
     * 产品类的公共方法
     */
    void method1() {
        // 业务逻辑处理
    }

    /**
     * 抽象方法
     */
    abstract void method2();
}
