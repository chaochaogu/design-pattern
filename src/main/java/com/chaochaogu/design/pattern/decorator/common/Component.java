package com.chaochaogu.design.pattern.decorator.common;

/**
 * 具体构件
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Component extends AbstractComponent {

    /**
     * 具体实现
     */
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
