package com.chaochaogu.design.pattern.bridge.example;

/**
 * 抽象产品类
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public abstract class AbstractProduct {

    /**
     * 产品都要被生产
     */
    public abstract void beProduced();

    /**
     * 生产完后出售获得利润
     */
    public abstract void beSelled();
}
