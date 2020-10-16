package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 汽车接口
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public interface ICar {

    /**
     * 汽车的生产商，品牌
     *
     * @return
     */
    public String getBrand();

    /**
     * 汽车型号
     *
     * @return
     */
    public String getModel();
}
