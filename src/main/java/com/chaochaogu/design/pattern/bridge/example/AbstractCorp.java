package com.chaochaogu.design.pattern.bridge.example;

/**
 * 抽象公司类
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public abstract class AbstractCorp {

    /**
     * 抽象产品
     */
    private AbstractProduct product;

    /**
     * 构造函数，由子类定义传递具体的产品进来
     *
     * @param product
     */
    public AbstractCorp(AbstractProduct product) {
        this.product = product;
    }

    /**
     * 公司赚钱
     */
    public void makeMoney() {
        // 先生产
        product.beProduced();
        // 再销售
        product.beSelled();
    }
}
