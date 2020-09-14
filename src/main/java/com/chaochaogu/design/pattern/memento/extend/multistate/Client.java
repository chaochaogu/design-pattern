package com.chaochaogu.design.pattern.memento.extend.multistate;

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
        // 初始化
        originator.setState1("state1");
        originator.setState2("state2");
        originator.setState3("state3");
        System.out.println("初始状态是：" + originator);
        // 创建一个备忘录
        caretaker.setMemento(originator.createMemento());
        // 修改状态
        originator.setState1("changed state1");
        originator.setState2("changed state2");
        originator.setState3("changed state3");
        System.out.println("改变后的状态是：" + originator);
        // 恢复一个备忘录
        originator.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后的状态是：" + originator);
    }
}
