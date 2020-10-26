package com.chaochaogu.design.mix.observer.mediator;

/**
 * 工厂类
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class ProductManager {

    /**
     * 是否可以创建一个产品
     */
    private boolean isPermittedCreate = false;

    /**
     * 建立一个产品
     *
     * @param name
     * @return
     */
    public Product createProduct(String name) {
        // 首先修改权限，允许创建
        isPermittedCreate = true;
        Product p = new Product(this, name);
        // 产生一个创建事件
        new ProductEvent(p, ProductEventType.NEW);
        return p;
    }

    /**
     * 废弃一个产品
     *
     * @param p
     */
    public void abandonProduct(Product p) {
        // 产生删除事件
        new ProductEvent(p, ProductEventType.ABANDON);
        // 销毁一个产品，例如删除数据库记录
        p = null;
    }

    /**
     * 修改一个产品
     *
     * @param p
     * @param name
     */
    public void editProduct(Product p, String name) {
        // 修改后的产品
        p.setName(name);
        // 产生修改事件
        new ProductEvent(p, ProductEventType.EDIT);
    }

    public boolean isCreateProduct() {
        return this.isPermittedCreate;
    }

    /**
     * 克隆一个产品
     *
     * @param p
     * @return
     */
    public Product clone(Product p) {
        // 产生克隆事件
        new ProductEvent(p, ProductEventType.CLONE);
        return p.clone();
    }
}
