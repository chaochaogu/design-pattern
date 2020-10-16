package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 抽象奔驰车
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public abstract class AbstractBenz implements ICar {
    private static final String BENZ_BRAND = "奔驰汽车";

    @Override
    public String getBrand() {
        return BENZ_BRAND;
    }

    /**
     * 具体型号由实现类完成
     *
     * @return
     */
    @Override
    public abstract String getModel();
}
