package com.chaochaogu.design.pattern.bridge.common;

/**
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        // 定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        // 执行
        abs.request();
    }
}
