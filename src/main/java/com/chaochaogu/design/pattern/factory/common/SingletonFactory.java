package com.chaochaogu.design.pattern.factory.common;

import com.chaochaogu.design.pattern.singleton.common.Singleton;

import java.lang.reflect.Constructor;

/**
 * 负责生产单例的工厂类
 *
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class<?> cl = Class.forName(Singleton.class.getName());
            Constructor<?> constructor = cl.getDeclaredConstructor();
            constructor.setAccessible(true);
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
