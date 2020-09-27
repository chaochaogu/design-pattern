package com.chaochaogu.design.pattern.bridge.example;

/**
 * 服装
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class Clothe extends AbstractProduct {

    @Override
    public void beProduced() {
        System.out.println("生产出的衣服是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出的衣服卖出去了");
    }
}
