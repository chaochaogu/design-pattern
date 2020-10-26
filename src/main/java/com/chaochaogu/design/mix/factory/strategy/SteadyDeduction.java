package com.chaochaogu.design.mix.factory.strategy;

/**
 * 固定扣款策略
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class SteadyDeduction implements IDeduction {

    /**
     * 固定金额和自由金额各扣除交易金额的50%
     *
     * @param card
     * @param trade
     * @return
     */
    @Override
    public boolean execute(Card card, Trade trade) {
        int halfMoney = (int) Math.rint(trade.getAmount() / 2.0);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        return true;
    }
}
