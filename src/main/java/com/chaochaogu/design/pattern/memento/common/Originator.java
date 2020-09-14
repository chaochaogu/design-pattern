package com.chaochaogu.design.pattern.memento.common;

/**
 * 发起人角色
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Originator {

    /**
     * 内部状态
     */
    private String state = "";

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    /**
     * 创建一个备忘录
     *
     * @return
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备忘录
     *
     * @param memento
     */
    public void restoreMemento(Memento memento) {
        this.state = memento.getState();
    }
}
