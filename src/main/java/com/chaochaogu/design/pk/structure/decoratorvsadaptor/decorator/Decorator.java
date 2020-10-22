package com.chaochaogu.design.pk.structure.decoratorvsadaptor.decorator;

/**
 * 抽象装饰类
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class Decorator implements Swan {

    private Swan swan;

    /**
     * 修饰的是谁
     *
     * @param swan
     */
    public Decorator(Swan swan) {
        this.swan = swan;
    }

    @Override
    public void fly() {
        swan.fly();
    }

    @Override
    public void cry() {
        swan.cry();
    }

    @Override
    public void show() {
        swan.show();
    }
}
