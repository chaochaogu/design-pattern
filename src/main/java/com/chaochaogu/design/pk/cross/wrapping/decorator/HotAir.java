package com.chaochaogu.design.pk.cross.wrapping.decorator;

/**
 * 吹牛
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class HotAir extends Decorator {

    public HotAir(IStar star) {
        super(star);
    }

    @Override
    public void act() {
        System.out.println("演前：夸夸其谈，没有自己不能演的角色");
        super.act();
    }
}
