package com.chaochaogu.design.mix.observer.mediator;

import java.util.Observable;

/**
 * 产品事件
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class ProductEvent extends Observable {

    /**
     * 事件起源
     */
    private Product source;

    /**
     * 事件类型
     */
    private ProductEventType type;

    /**
     * 传入事件的源头，默认为新建类型
     *
     * @param p
     */
    public ProductEvent(Product p) {
        this(p, ProductEventType.NEW);
    }

    /**
     * 事件源头以及事件类型
     *
     * @param p
     * @param type
     */
    public ProductEvent(Product p, ProductEventType type) {
        this.source = p;
        this.type = type;
        // 事件触发
        notifyEventDispatch();
    }

    /**
     * 获得事件的始作俑者
     *
     * @return
     */
    public Product getSource() {
        return this.source;
    }

    /**
     * 获得事件类型
     *
     * @return
     */
    public ProductEventType getType() {
        return this.type;
    }

    /**
     * 通知事件处理中心
     */
    public void notifyEventDispatch() {
        super.addObserver(EventDispatch.getDispatch());
        super.setChanged();
        super.notifyObservers();
    }
}
