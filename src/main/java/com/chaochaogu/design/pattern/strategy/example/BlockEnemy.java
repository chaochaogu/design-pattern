package com.chaochaogu.design.pattern.strategy.example;

/**
 * 孙夫人断后
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class BlockEnemy implements IStrategy {

    @Override
    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
