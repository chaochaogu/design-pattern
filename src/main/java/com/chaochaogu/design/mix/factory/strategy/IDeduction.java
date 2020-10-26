package com.chaochaogu.design.mix.factory.strategy;

/**
 * 扣款策略接口
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public interface IDeduction {

    /**
     * 扣款，提供交易和卡信息，进行扣款，并返回扣款是否成功
     *
     * @param card
     * @param trade
     * @return
     */
    public boolean execute(Card card, Trade trade);
}
