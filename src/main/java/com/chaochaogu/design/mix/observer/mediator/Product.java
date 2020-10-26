package com.chaochaogu.design.mix.observer.mediator;

/**
 * 产品类
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class Product implements Cloneable {

    /**
     * 产品名称
     */
    private String name;

    /**
     * 是否可以属性变更
     */
    private boolean canChanged = false;

    /**
     * 产生一个新的产品
     *
     * @param manager
     * @param name
     */
    public Product(ProductManager manager, String name) {
        // 允许建立产品
        if (manager.isCreateProduct()) {
            canChanged = true;
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (canChanged) {
            this.name = name;
        }
    }

    @Override
    protected Product clone() {
        Product product = null;
        try {
            product = (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return product;
    }
}
