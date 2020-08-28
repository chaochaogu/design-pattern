package com.chaochaogu.design.pattern.factory.common;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Creator extends AbstractCreator {
    @Override
    <T extends AbstractProduct> T createProduct(Class<T> c) {
        AbstractProduct product = null;
        try {
            product = (AbstractProduct) Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
