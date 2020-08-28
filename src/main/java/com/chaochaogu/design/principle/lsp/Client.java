package com.chaochaogu.design.principle.lsp;

import com.google.common.collect.Maps;

import java.util.HashMap;

/**
 * 里氏替换原则（Liskov Substitution Principle）
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class Client {
    public static void invoker1() {
        // 父类存在的地方，子类就应该能够存在
        Father f = new Father();
        HashMap map = Maps.newHashMap();
        f.doSomething(map);
    }

    public static void invoker2() {
        // 父类存在的地方，子类就应该存在
        Son s = new Son();
        HashMap map = Maps.newHashMap();
        s.doSomething(map);
    }

    public static void invoker3(){
        // 违背里氏替换原则
        UFather uf = new UFather();
        HashMap map = Maps.newHashMap();
        uf.doSomething(map);
    }

    public static void invoker4(){
        // 违背里氏替换原则
        USon us = new USon();
        HashMap map = Maps.newHashMap();
        us.doSomething(map);
    }

    public static void main(String[] args) {
        invoker1();
        invoker2();
        invoker3();
        invoker4();
    }
}
