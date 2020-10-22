package com.chaochaogu.design.pk.cross.wrapping.decorator;

/**
 * 抵赖
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Deny extends Decorator {

    public Deny(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        super.act();
        System.out.println("演后：拼死抵赖，死不承认");
    }
}
