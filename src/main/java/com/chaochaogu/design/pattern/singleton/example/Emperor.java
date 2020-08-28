package com.chaochaogu.design.pattern.singleton.example;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Emperor {
    // 初始化一个皇帝
    private static final Emperor EMPEROR = new Emperor();

    private Emperor() {
        // 世俗和道德约束你，目的就是不希望产生第二个皇帝
    }

    public static Emperor getInstance() {
        return EMPEROR;
    }

    public void say() {
        // 皇帝发话了
        System.out.println("我就是皇帝某某某");
    }
}
