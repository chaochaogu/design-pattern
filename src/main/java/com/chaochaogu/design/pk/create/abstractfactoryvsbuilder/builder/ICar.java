package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.builder;

/**
 * 车辆产品描述
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public interface ICar {

    /**
     * 汽车车轮
     *
     * @return
     */
    public String getWheel();

    /**
     * 汽车引擎
     *
     * @return
     */
    public String getEngine();
}
