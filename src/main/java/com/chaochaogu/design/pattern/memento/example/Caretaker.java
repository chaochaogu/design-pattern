package com.chaochaogu.design.pattern.memento.example;

/**
 * 备忘录管理者
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Caretaker {

    /**
     * 备忘录对象
     */
    private Memento memento;

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return this.memento;
    }
}
