package com.chaochaogu.design.mix.factory.strategy;

/**
 * 策略枚举
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public enum StrategyMan {

    /**
     * 固定扣款
     */
    STEADY("com.chaochaogu.design.mix.factory.strategy.SteadyDeduction"),

    /**
     * 自由扣款
     */
    FREE("com.chaochaogu.design.mix.factory.strategy.FreeDeduction");

    private String value;

    StrategyMan(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
