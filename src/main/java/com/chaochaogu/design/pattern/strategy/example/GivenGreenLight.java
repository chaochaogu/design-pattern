package com.chaochaogu.design.pattern.strategy.example;

/**
 * 吴国太开绿灯
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class GivenGreenLight implements IStrategy {

    @Override
    public void operate() {
        System.out.println("求吴国太开绿灯,放行！");
    }
}
