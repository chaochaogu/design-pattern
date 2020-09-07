package com.chaochaogu.design.pattern.decorator.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Client {
    public static void main(String[] args) {
        AbstractComponent component = new Component();
        // 第一次修饰
        component = new Decorator1(component);
        // 第二次修饰
        component = new Decorator2(component);
        // 修饰后运行
        component.operate();
    }
}
