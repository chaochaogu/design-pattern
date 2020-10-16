package com.chaochaogu.design.pk.create.factoryvsbuilder.builder;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Client {
    public static void main(String[] args) {
        // 建造一个成年超人
        Superman adultSuperman = Director.getAdultSuperman();
        // 展示超能力
        System.out.println(adultSuperman.getSpecialTalent());
    }
}
