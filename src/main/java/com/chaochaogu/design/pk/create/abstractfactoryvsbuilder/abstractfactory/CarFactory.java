package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 抽象工厂
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public interface CarFactory {

    /**
     * 生产SUV
     *
     * @return
     */
    public ICar createSUV();

    /**
     * 生产商务车
     *
     * @return
     */
    public ICar createVan();
}
