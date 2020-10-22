package com.chaochaogu.design.pk.structure.decoratorvsadaptor.adaptor;

/**
 * 丑小鸭，把白天鹅当作小鸭子看待
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class UglyDuckling extends WhiteSwan implements Duck {

    /**
     * 丑小鸭的叫声
     */
    @Override
    public void cry() {
        super.cry();
    }

    /**
     * 丑小鸭的外形
     */
    @Override
    public void show() {
        super.show();
    }

    /**
     * 丑小鸭的其它行为
     */
    @Override
    public void behave() {
        // 丑小鸭不仅会游泳
        System.out.println("会游泳");
        // 还会飞行
        super.fly();
    }
}
