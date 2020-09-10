package com.chaochaogu.design.pattern.compose.example;

/**
 * 树叶节点
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Leaf extends Corp {

    /**
     * 就写一个构造函数，这个是必须的
     *
     * @param name
     * @param position
     * @param salary
     */
    public Leaf(String name, String position, int salary) {
        super(name, position, salary);
    }
}
