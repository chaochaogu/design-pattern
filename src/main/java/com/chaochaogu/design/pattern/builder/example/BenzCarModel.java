package com.chaochaogu.design.pattern.builder.example;

/**
 * 奔驰模型
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class BenzCarModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz start");
    }

    @Override
    protected void stop() {
        System.out.println("Benz stop");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Benz engine boom");
    }
}
