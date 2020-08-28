package com.chaochaogu.design.pattern.template.common;

/**
 * 具体类2
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class ConcreteClass2 extends AbstractClass {
    @Override
    protected void doSomething() {
        System.out.println("具体类2 do something 逻辑");
    }

    @Override
    protected void doAnything() {
        System.out.println("具体类2 do anything 逻辑");
    }
}
