package com.chaochaogu.design.pattern.factory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public abstract class AbstractHumanFactory {
    abstract <T extends Human> T createHuman(Class<T> c);
}
