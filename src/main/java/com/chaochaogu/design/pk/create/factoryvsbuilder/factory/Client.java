package com.chaochaogu.design.pk.create.factoryvsbuilder.factory;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Client {

    /**
     * 模拟生产超人
     *
     * @param args
     */
    public static void main(String[] args) {
        // 生产一个成年超人
        ISuperman adultSuperman = SupermanFactory.createSuperman("adult");
        // 展示一下超人技能
        adultSuperman.specialTalent();
    }
}
