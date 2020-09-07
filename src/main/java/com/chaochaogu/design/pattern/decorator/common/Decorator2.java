package com.chaochaogu.design.pattern.decorator.common;

/**
 * 具体的装饰类2
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Decorator2 extends AbstractDecorator {

    /**
     * 定义被修饰者
     *
     * @param component
     */
    public Decorator2(AbstractComponent component) {
        super(component);
    }

    /**
     * 定义自己的修饰方法
     */
    private void method2() {
        System.out.println("method2 修饰 ...");
    }

    @Override
    public void operate() {
        super.operate();
        this.method2();
    }
}
