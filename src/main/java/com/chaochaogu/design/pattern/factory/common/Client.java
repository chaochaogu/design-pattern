package com.chaochaogu.design.pattern.factory.common;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator = new Creator();
        AbstractProduct product = creator.createProduct(Product2.class);
        // 继续业务处理
    }
}
