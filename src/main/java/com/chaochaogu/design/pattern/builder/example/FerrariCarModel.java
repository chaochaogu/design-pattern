package com.chaochaogu.design.pattern.builder.example;

/**
 * 法拉利模型
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class FerrariCarModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Ferrari start");
    }

    @Override
    protected void stop() {
        System.out.println("Ferrari stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Ferrari alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Ferrari engine boom");
    }
}
