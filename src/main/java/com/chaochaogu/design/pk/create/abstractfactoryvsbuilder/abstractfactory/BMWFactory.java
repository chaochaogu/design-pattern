package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 宝马车工厂
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class BMWFactory implements CarFactory {

    /**
     * 生产SUV
     *
     * @return
     */
    @Override
    public ICar createSUV() {
        return new BMWSUV();
    }

    /**
     * 生产商务车
     *
     * @return
     */
    @Override
    public ICar createVan() {
        return new BMWVan();
    }
}
