package com.chaochaogu.design.pattern.bridge.example;

/**
 * 房子
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class House extends AbstractProduct {

    @Override
    public void beProduced() {
        System.out.println("生产出来的房子是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的房子卖出去了");
    }
}
