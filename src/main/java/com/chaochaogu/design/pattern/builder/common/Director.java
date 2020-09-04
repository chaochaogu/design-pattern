package com.chaochaogu.design.pattern.builder.common;

/**
 * 导演类
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class Director {
    private ConcreteBuilder builder = new ConcreteBuilder();

    /**
     * 构建不同的产品
     *
     * @return
     */
    public Product getAProduct() {
        builder.setPart();
        // 设置不同的零件，产生不同的产品
        return builder.buildProduct();
    }
}
