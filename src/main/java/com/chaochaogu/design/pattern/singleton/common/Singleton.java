package com.chaochaogu.design.pattern.singleton.common;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton() {
    }

    /**
     * 通过该方法获得实例对象
     *
     * @return
     */
    public static Singleton getInstance() {
        return INSTANCE;
    }

    /**
     * 类中其他方法，尽量是static的
     */
    public static void doSomething() {

    }
}
