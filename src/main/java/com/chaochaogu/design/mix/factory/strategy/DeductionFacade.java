package com.chaochaogu.design.mix.factory.strategy;

/**
 * 扣款模块封装
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class DeductionFacade {

    /**
     * 对外公布的扣款信息
     *
     * @param card
     * @param trade
     * @return
     */
    public static Card deduct(Card card, Trade trade) {
        // 获得消费策略
        StrategyMan strategy = getStrategyType(trade);
        // 初始化一个消费策略对象
        IDeduction deduction = StrategyFactory.getDeduction(strategy);
        // 产生一个策略上下文
        DeductionContext context = new DeductionContext(deduction);
        // 执行扣款
        context.execute(card, trade);
        // 返回扣款处理完毕后的数据
        return card;
    }

    /**
     * 获得对应的商户消费策略
     *
     * @param trade
     * @return
     */
    private static StrategyMan getStrategyType(Trade trade) {
        // 模拟操作
        StrategyMan strategy;
        if (trade.getTradeNo().contains("steady")) {
            strategy = StrategyMan.STEADY;
        } else {
            strategy = StrategyMan.FREE;
        }
        return strategy;
    }
}
