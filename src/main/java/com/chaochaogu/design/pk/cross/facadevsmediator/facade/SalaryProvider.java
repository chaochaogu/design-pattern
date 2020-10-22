package com.chaochaogu.design.pk.cross.facadevsmediator.facade;

/**
 * 总工资计算
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class SalaryProvider {

    /**
     * 基本工资
     */
    private BasicSalary basic = new BasicSalary();

    /**
     * 奖金
     */
    private Bonus bonus = new Bonus();

    /**
     * 绩效
     */
    private Performance perf = new Performance();

    /**
     * 税收
     */
    private Tax tax = new Tax();

    /**
     * 获得用户的总收入
     *
     * @return
     */
    public int getTotalSalary() {
        return basic.getBasicSalary() + bonus.getBonus() + perf.getPerformance() - tax.getTax();
    }
}
