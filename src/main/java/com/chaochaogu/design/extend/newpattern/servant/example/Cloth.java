package com.chaochaogu.design.extend.newpattern.servant.example;

/**
 * 衣服
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Cloth implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("衣服被清洁干净");
    }
}
