package com.chaochaogu.design.mix.factory.strategy;

/**
 * 自由扣款策略
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class FreeDeduction implements IDeduction {

    /**
     * 直接从自由金额中扣除交易金额
     *
     * @param card
     * @param trade
     * @return
     */
    @Override
    public boolean execute(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
