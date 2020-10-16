package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 抽象宝马车
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public abstract class AbstractBMW implements ICar {
    private static final String BMW_BRAND = "宝马汽车";

    @Override
    public String getBrand() {
        return BMW_BRAND;
    }

    /**
     * 具体型号由实现类完成
     *
     * @return
     */
    @Override
    public abstract String getModel();
}
