package com.chaochaogu.design.pattern.memento.common;

/**
 * 备忘录角色
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Memento {

    /**
     * 发起人的内部状态
     */
    private String state = "";

    /**
     * 构造函数传递参数
     *
     * @param state
     */
    public Memento(String state) {
        this.state = state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
