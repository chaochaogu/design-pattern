package com.chaochaogu.design.pattern.memento.extend.multistate;

import lombok.Data;

/**
 * 发起人角色
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public class Originator {

    /**
     * 内部状态，setter、getter通过lombok生成
     */
    private String state1;
    private String state2;
    private String state3;

    public Memento createMemento() {
        return new Memento(BeanUtils.backupProp(this));
    }

    public void restoreMemento(Memento memento) {
        BeanUtils.restoreProp(this, memento.getStateMap());
    }
}
