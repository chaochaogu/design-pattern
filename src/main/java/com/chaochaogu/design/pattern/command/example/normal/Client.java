package com.chaochaogu.design.pattern.command.example.normal;

/**
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("------客户要求新增一项需求------");
        RequirementGroup rq = new RequirementGroup();
        rq.find();
        rq.add();
        rq.plan();
        System.out.println("------客户要求变更一个页面------");
        PageGroup pg = new PageGroup();
        pg.find();
        pg.change();
        pg.plan();
        System.out.println("------客户要求删除一个功能------");
        CodeGroup cg = new CodeGroup();
        cg.find();
        cg.delete();
        cg.plan();
    }
}
