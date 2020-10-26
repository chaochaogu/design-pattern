package com.chaochaogu.design.mix.observer.mediator;

/**
 * 事件类型定义
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public enum ProductEventType {

    /**
     * 创建产品
     */
    NEW(1),

    /**
     * 废弃产品
     */
    ABANDON(2),

    /**
     * 修改产品
     */
    EDIT(3),

    /**
     * 克隆产品
     */
    CLONE(4);

    private int value;

    ProductEventType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
