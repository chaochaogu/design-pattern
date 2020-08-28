package com.chaochaogu.design.pattern.abstractfactory.example;

/**
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class MaleYellowHuman extends AbstractYellowHuman {
    @Override
    public void getGender() {
        System.out.println("男黄娃");
    }
}
