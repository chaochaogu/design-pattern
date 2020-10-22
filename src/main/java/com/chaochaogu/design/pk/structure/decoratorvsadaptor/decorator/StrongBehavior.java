package com.chaochaogu.design.pk.structure.decoratorvsadaptor.decorator;

/**
 * 强化行为
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class StrongBehavior extends Decorator {

    /**
     * 强化谁
     *
     * @param swan
     */
    public StrongBehavior(Swan swan) {
        super(swan);
    }

    /**
     * 会飞行了
     */
    @Override
    public void fly() {
        System.out.println("会飞行了！");
    }
}
