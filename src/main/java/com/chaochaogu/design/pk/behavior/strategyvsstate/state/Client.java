package com.chaochaogu.design.pk.behavior.strategyvsstate.state;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class Client {
    public static void main(String[] args) {
        //定义一个普通的人
        Human human = new Human();
        //设置一个人的初始状态
        human.setState(new ChildState());
        System.out.println("====儿童的主要工作=====");
        human.work();
        System.out.println("\n====成年人的主要工作=====");
        human.work();
        System.out.println("\n====老年人的主要工作=====");
        human.work();

    }
}
