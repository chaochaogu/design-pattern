package com.chaochaogu.design.pattern.compose.example;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 树枝节点
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Branch extends Corp {

    /**
     * 领导下边有哪些下级领导和小兵
     */
    private List<Corp> subordinateList = Lists.newArrayList();

    /**
     * 构造函数是必须的
     *
     * @param name
     * @param position
     * @param salary
     */
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    /**
     * 增加一个下属，可能是小头目，也可能是小兵
     *
     * @param subordinate
     */
    public void addSubordinate(Corp subordinate) {
        // 设置父节点
        subordinate.setParent(this);
        this.subordinateList.add(subordinate);
    }

    /**
     * 我有哪些下属
     *
     * @return
     */
    public List<Corp> getSubordinate() {
        return subordinateList;
    }
}
