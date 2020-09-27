package com.chaochaogu.design.pattern.bridge.example;

/**
 * 山寨公司
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class CopycatCorp extends AbstractCorp {

    /**
     * 生产什么产品，不知道，等被调用的时候才知道
     *
     * @param product
     */
    public CopycatCorp(AbstractProduct product) {
        super(product);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("我赚钱呀");
    }
}
