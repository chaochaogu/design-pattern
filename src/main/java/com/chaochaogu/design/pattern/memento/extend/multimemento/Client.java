package com.chaochaogu.design.pattern.memento.extend.multimemento;

import com.chaochaogu.design.pattern.memento.extend.multistate.Originator;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Client {
    public static void main(String[] args) {
        // 定义出发起人
        Originator originator = new Originator();
        // 定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建两个备忘录
        // 要注意内存溢出问题，如增加map上限等
        caretaker.setMemento("001", originator.createMemento());
        caretaker.setMemento("002", originator.createMemento());
        // 恢复指定备忘录
        originator.restoreMemento(caretaker.getMemento("001"));
    }
}
