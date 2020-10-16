package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 奔驰SUV
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class BenzSUV extends AbstractBenz {
    private static final String G_SERIES = "G系列SUV";

    @Override
    public String getModel() {
        return G_SERIES;
    }
}
