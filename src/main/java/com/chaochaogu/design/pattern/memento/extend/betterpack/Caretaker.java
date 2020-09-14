package com.chaochaogu.design.pattern.memento.extend.betterpack;

/**
 * 备忘录管理员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Caretaker {

    /**
     * 备忘录对象
     */
    private IMemento memento;

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }

    public IMemento getMemento() {
        return memento;
    }
}
