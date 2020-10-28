package com.chaochaogu.design.extend.newpattern.servant.example;

/**
 * 厨房
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Kitchen implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("厨房被清洁干净");
    }
}
