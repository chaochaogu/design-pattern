package com.chaochaogu.design.pattern.iterator.example;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 项目信息
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Project implements IProject {
    private List<IProject> projects = Lists.newArrayList();
    /**
     * 项目名称
     */
    private String name;
    /**
     * 项目成员数量
     */
    private int num;
    /**
     * 项目费用
     */
    private int cost;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        projects.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        //获得项目的名称
        info = info + "项目名称是：" + this.name;
        //获得项目人数
        info = info + "\t项目人数: " + this.num;
        //项目费用
        info = info + "\t 项目费用：" + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projects);
    }
}
