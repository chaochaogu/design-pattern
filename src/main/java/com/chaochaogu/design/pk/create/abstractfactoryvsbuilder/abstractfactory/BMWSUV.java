package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 宝马SUV
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class BMWSUV extends AbstractBMW {
    private static final String X_SERIES = "X系列车型SUV";

    @Override
    public String getModel() {
        return X_SERIES;
    }
}
