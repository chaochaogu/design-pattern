package com.chaochaogu.design.mix.factory.strategy;

/**
 * 策略工厂
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class StrategyFactory {

    public static IDeduction getDeduction(StrategyMan strategy) {
        IDeduction deduction = null;
        try {
            deduction = (IDeduction) Class.forName(strategy.getValue()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deduction;
    }
}
