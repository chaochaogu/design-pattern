package com.chaochaogu.design.mix.factory.strategy;

import lombok.Data;

/**
 * IC卡
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
@Data
public class Card {

    /**
     * 卡号
     */
    private String cardNo;

    /**
     * 卡内的固定交易金额
     */
    private int steadyMoney;

    /**
     * 卡内的自由交易金额
     */
    private int freeMoney;
}
