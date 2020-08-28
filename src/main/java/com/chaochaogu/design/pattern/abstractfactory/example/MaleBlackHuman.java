package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class MaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getGender() {
        System.out.println("男黑娃");
    }
}
