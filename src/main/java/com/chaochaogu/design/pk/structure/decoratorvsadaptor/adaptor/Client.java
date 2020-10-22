package com.chaochaogu.design.pk.structure.decoratorvsadaptor.adaptor;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class Client {
    public static void main(String[] args) {
        // 鸭妈妈有5个孩子，其中4个都是一个模样
        System.out.println("===妈妈有五个孩子，其中四个模样是这样的：===");
        Duck duck = new Duckling();
        duck.cry();
        duck.show();
        duck.behave();
        System.out.println("\n===一只独特的小鸭子，模样是这样的：===");
        Duck uglyDuckling = new UglyDuckling();
        uglyDuckling.cry();
        uglyDuckling.show();
        uglyDuckling.behave();
    }
}
