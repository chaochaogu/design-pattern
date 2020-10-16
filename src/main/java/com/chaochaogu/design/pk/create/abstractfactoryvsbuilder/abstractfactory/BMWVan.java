package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 宝马商务车
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class BMWVan extends AbstractBMW {
    private static final String SEVEN_SERIES = "7系列车型商务车";

    @Override
    public String getModel() {
        return SEVEN_SERIES;
    }
}
