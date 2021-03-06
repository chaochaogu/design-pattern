package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class AbstractYellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄娃");
    }

    @Override
    public void talk() {
        System.out.println("我是黄娃");
    }
}
