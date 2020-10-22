package com.chaochaogu.design.pk.cross.facadevsmediator.facade;

import java.util.Random;

/**
 * 绩效
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Performance {

    /**
     * 基本工资
     */
    private BasicSalary basicSalary = new BasicSalary();

    /**
     * 绩效奖励
     *
     * @return
     */
    public int getPerformance() {
        int basic = this.basicSalary.getBasicSalary();
        // 随机绩效
        int perf = new Random().nextInt(100);
        return basic * perf / 100;
    }
}
