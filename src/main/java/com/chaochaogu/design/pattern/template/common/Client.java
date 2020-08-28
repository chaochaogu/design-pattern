package com.chaochaogu.design.pattern.template.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class Client {
    public static void main(String[] args) {
        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        // 调用模板方法
        concreteClass1.templateMethod();
        concreteClass2.templateMethod();
    }
}
