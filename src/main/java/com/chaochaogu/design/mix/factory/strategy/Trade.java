package com.chaochaogu.design.mix.factory.strategy;

import lombok.Data;

/**
 * 交易类
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
@Data
public class Trade {

    /**
     * 交易流水号
     */
    private String tradeNo;

    /**
     * 交易金额
     */
    private int amount;
}
