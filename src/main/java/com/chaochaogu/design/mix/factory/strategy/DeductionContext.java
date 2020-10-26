package com.chaochaogu.design.mix.factory.strategy;

/**
 * 扣款策略的封装
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class DeductionContext {

    /**
     * 扣款策略
     */
    private IDeduction deduction;

    /**
     * 构造函数传递扣款策略
     *
     * @param deduction
     */
    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }

    /**
     * 执行扣款
     *
     * @param card
     * @param trade
     * @return
     */
    public boolean execute(Card card, Trade trade) {
        return this.deduction.execute(card, trade);
    }
}
