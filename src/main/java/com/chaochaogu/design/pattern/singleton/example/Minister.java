package com.chaochaogu.design.pattern.singleton.example;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
        // 三天见的皇帝都是同一个，荣幸吧
        for (int day = 0; day < 10; day++) {
            MutiEmperor emperor = MutiEmperor.getInstance();
            emperor.say();
        }
        // 每天见的皇帝不一样
    }
}
