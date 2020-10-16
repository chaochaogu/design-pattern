package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 奔驰商务车
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class BenzVan extends AbstractBenz {
    private static final String R_SERIES = "R系列商务车";

    @Override
    public String getModel() {
        return R_SERIES;
    }
}
