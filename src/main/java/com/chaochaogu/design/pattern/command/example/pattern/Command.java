package com.chaochaogu.design.pattern.command.example.pattern;

import com.chaochaogu.design.pattern.command.example.normal.CodeGroup;
import com.chaochaogu.design.pattern.command.example.normal.PageGroup;
import com.chaochaogu.design.pattern.command.example.normal.RequirementGroup;

/**
 * 抽象命令类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public abstract class Command {

    /**
     * 把三个组都定义好，子类可以直接使用
     */
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    /**
     * 只有一个方法，你要我做什么事情
     */
    abstract void execute();
}
