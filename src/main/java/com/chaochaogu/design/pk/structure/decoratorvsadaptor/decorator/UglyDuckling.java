package com.chaochaogu.design.pk.structure.decoratorvsadaptor.decorator;

/**
 * 丑小鸭
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class UglyDuckling implements Swan {

    /**
     * 丑小鸭还小，不能飞行
     */
    @Override
    public void fly() {
        System.out.println("不能飞行");
    }

    /**
     * 丑小鸭的叫声
     */
    @Override
    public void cry() {
        System.out.println("叫声是克噜——克噜——克噜");
    }

    /**
     * 丑小鸭的外表
     */
    @Override
    public void show() {
        System.out.println("外形是脏兮兮的白色，毛茸茸的大脑袋");
    }
}
