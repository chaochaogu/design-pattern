package com.chaochaogu.design.pattern.memento.example;

/**
 * 备忘录
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Memento {

    /**
     * 男孩的状态
     */
    private String state;

    /**
     * 构造函数传递状态信息
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
        return this.state;
    }
}
