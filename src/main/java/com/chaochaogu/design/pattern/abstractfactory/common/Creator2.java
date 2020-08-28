package com.chaochaogu.design.pattern.abstractfactory.common;

/**
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class Creator2 extends AbstractCreator {

    /**
     * 只生产产品等级为2的A产品
     *
     * @return
     */
    @Override
    AbstractProductA createProductA() {
        return new ProductA2();
    }

    /**
     * 只生产产品等级为2的B产品
     *
     * @return
     */
    @Override
    AbstractProductB createProductB() {
        return new ProductB2();
    }
}
