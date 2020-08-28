package com.chaochaogu.design.pattern.abstractfactory.common;

/**
 * 车间
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class AbstractCreator {
    /**
     * 创建A产品家族
     *
     * @return
     */
    abstract AbstractProductA createProductA();

    /**
     * 创建B产品家族
     *
     * @return
     */
    abstract AbstractProductB createProductB();
}
