package com.chaochaogu.design.pk.cross.wrapping.decorator;

/**
 * 假明星
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class FakeStar implements IStar {

    @Override
    public void act() {
        System.out.println("演中：演技拙劣");
    }
}
