package com.chaochaogu.design.pattern.memento.extend.betterpack;

/**
 * 发起人角色
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Originator {

    /**
     * 内部状态
     */
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    /**
     * 创建一个备忘录
     *
     * @return
     */
    public IMemento createMemento() {
        return new Memento(this.state);
    }

    /**
     * 恢复一个备忘录
     *
     * @param memento
     */
    public void restoreMemento(IMemento memento) {
        this.state = ((Memento) memento).getState();
    }

    /**
     * 内置类
     */
    private class Memento implements IMemento {

        /**
         * 发起人的内部状态
         */
        private String state;

        /**
         * 构造函数传递参数
         *
         * @param state
         */
        public Memento(String state) {
            this.state = state;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }
    }
}
