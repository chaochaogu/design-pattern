package com.chaochaogu.design.pattern.bridge.example;

/**
 * iPod产品
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class IPod extends AbstractProduct {

    @Override
    public void beProduced() {
        System.out.println("生产出来的iPod是这样的");
    }

    @Override
    public void beSelled() {
        System.out.println("生产出来的iPod卖出去了");
    }
}
