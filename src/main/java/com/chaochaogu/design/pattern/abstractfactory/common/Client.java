package com.chaochaogu.design.pattern.abstractfactory.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class Client {
    public static void main(String[] args) {
        // 定义出两个工厂
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        // 产生A1对象
        AbstractProductA productA1 = creator1.createProductA();
        // 产生B1对象
        AbstractProductB productB1 = creator1.createProductB();
        // 产生A2对象
        AbstractProductA productA2 = creator2.createProductA();
        // 产生B2对象
        AbstractProductB productB2 = creator2.createProductB();
    }
}
