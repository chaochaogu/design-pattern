package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.builder;

/**
 * 具体车辆
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Car implements ICar {

    /**
     * 汽车车轮
     */
    private String wheel;

    /**
     * 汽车引擎
     */
    private String engine;

    /**
     * 一次性传递车辆所需信息
     *
     * @param wheel
     * @param engine
     */
    public Car(String wheel, String engine) {
        this.wheel = wheel;
        this.engine = engine;
    }

    @Override
    public String getWheel() {
        return this.wheel;
    }

    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public String toString() {
        return "车的轮子是：" + wheel + "\n车的引擎是：" + engine;
    }
}
