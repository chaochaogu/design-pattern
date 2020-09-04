package com.chaochaogu.design.pattern.command.example.normal;

/**
 * 美工组
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class PageGroup extends Group {

    @Override
    public void find() {
        System.out.println("找到美工组");
    }

    @Override
    public void add() {
        System.out.println("客户要求新增一个页面");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一个页面");
    }

    @Override
    public void change() {
        System.out.println("客户要求变更一个页面");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划");
    }
}
