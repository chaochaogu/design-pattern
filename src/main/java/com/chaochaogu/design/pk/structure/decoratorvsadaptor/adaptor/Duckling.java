package com.chaochaogu.design.pk.structure.decoratorvsadaptor.adaptor;

/**
 * 小鸭子
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class Duckling implements Duck {

    @Override
    public void cry() {
        System.out.println("叫声是嘎——嘎——嘎");
    }

    @Override
    public void show() {
        System.out.println("外形是黄白相间，嘴长");
    }

    /**
     * 鸭子的其它行为，如游泳
     */
    @Override
    public void behave() {
        System.out.println("会游泳");
    }
}
