package com.chaochaogu.design.pattern.decorator.common;

/**
 * 具体的装饰类1
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Decorator1 extends AbstractDecorator {

    /**
     * 定义被修饰者
     *
     * @param component
     */
    public Decorator1(AbstractComponent component) {
        super(component);
    }

    /**
     * 定义自己的修饰方法
     */
    private void method1() {
        System.out.println("method1 修饰 ...");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
