package com.chaochaogu.design.pk.cross.wrapping.decorator;

/**
 * 抽象装饰类
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Decorator implements IStar {

    /**
     * 粉饰的是谁
     */
    private IStar star;

    public Decorator(IStar star) {
        this.star = star;
    }

    @Override
    public void act() {
        this.star.act();
    }
}
