package com.chaochaogu.design.pattern.builder.common;

/**
 * 抽象建造者
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public abstract class AbstractBuilder {

    /**
     * 设置产品的不同部分，以获得不同的产品
     */
    abstract void setPart();

    /**
     * 建造产品
     *
     * @return
     */
    abstract Product buildProduct();
}
