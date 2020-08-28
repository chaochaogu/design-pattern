package com.chaochaogu.design.pattern.factory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人");
    }

    @Override
    public void talk() {
        System.out.println("我是白娃");
    }
}
