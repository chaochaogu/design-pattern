package com.chaochaogu.design.pattern.factory.common;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public abstract class AbstractCreator {
    abstract <T extends AbstractProduct> T createProduct(Class<T> c);
}
