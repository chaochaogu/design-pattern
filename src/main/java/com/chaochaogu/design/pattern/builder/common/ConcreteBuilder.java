package com.chaochaogu.design.pattern.builder.common;

/**
 * 具体建造者
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class ConcreteBuilder extends AbstractBuilder {
    private Product product = new Product();

    /**
     * 设置产品零件
     */
    @Override
    void setPart() {
        // 产品类内的逻辑处理
    }

    /**
     * 组件一个产品
     *
     * @return
     */
    @Override
    Product buildProduct() {
        return this.product;
    }
}
