package com.chaochaogu.design.pk.create.factoryvsbuilder.builder;

/**
 * 导演类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Director {

    /**
     * 两个建造者的应用
     */
    private static AbstractBuilder adultSupermanBuilder = new AdultSupermanBuilder();
    private static AbstractBuilder childSupermanBuilder = new ChildSupermanBuilder();

    /**
     * 建造一个成年，会飞行的超人
     *
     * @return
     */
    public static Superman getAdultSuperman() {
        return adultSupermanBuilder.getSuperman();
    }

    /**
     * 建造一个未成年，刀枪不入的超人
     *
     * @return
     */
    public static Superman getChildSuperman() {
        return childSupermanBuilder.getSuperman();
    }
}
