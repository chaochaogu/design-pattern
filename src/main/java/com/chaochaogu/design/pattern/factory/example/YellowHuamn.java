package com.chaochaogu.design.pattern.factory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class YellowHuamn implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人");
    }

    @Override
    public void talk() {
        System.out.println("我是黄娃");
    }
}
