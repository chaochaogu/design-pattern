package com.chaochaogu.design.mix.observer.mediator;

/**
 * 事件处理枚举
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public enum EventCustomType {

    /**
     * 创建事件
     */
    NEW(1),

    /**
     * 删除事件
     */
    DELETE(2),

    /**
     * 修改事件
     */
    EDIT(3),

    /**
     * 克隆事件
     */
    CLONE(4);

    private int value;

    EventCustomType(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
