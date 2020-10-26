package com.chaochaogu.design.mix.observer.mediator;

import java.util.Vector;

/**
 * 抽象的事件处理者
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public abstract class EventCustomer {

    /**
     * 容纳每个消费者可以处理的级别
     */
    private Vector<EventCustomType> customTypes = new Vector<>();

    /**
     * 每个消费者都要声明自己处理哪一类别的事件
     *
     * @param type
     */
    public EventCustomer(EventCustomType type) {
        addCustomType(type);
    }

    /**
     * 每个消费者可以消费多个事件
     *
     * @param type
     */
    public void addCustomType(EventCustomType type) {
        customTypes.add(type);
    }

    /**
     * 得到自己的处理能力
     *
     * @return
     */
    public Vector<EventCustomType> getCustomTypes() {
        return customTypes;
    }

    /**
     * 每个事件都要对事件进行声明式消费
     *
     * @param event
     */
    public abstract void execute(ProductEvent event);
}
