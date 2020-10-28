package com.chaochaogu.design.extend.newpattern.servant.example;

/**
 * 花园
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Garden implements Cleanable {

    @Override
    public void cleaned() {
        System.out.println("花园被清洁干净");
    }
}
