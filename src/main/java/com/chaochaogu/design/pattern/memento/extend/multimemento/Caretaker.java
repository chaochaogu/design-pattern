package com.chaochaogu.design.pattern.memento.extend.multimemento;

import com.chaochaogu.design.pattern.memento.extend.multistate.Memento;

import java.util.Map;

/**
 * 备忘录管理员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Caretaker {

    /**
     * 容纳备忘录的容器
     */
    private Map<String, Memento> memMap;

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx, Memento memento) {
        this.memMap.put(idx, memento);
    }
}
