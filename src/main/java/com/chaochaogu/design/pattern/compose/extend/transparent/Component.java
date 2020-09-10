package com.chaochaogu.design.pattern.compose.extend.transparent;

import java.util.List;

/**
 * 抽象构件
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public abstract class Component {

    /**
     * 个体和整体都拥有的共享
     */
    public void doSomething() {
        // 编写业务逻辑
    }

    /**
     * 增加一个叶子构件或者树枝构件
     */
    public abstract void add();

    /**
     * 移除一个叶子构件或者树枝构件
     */
    public abstract void remove();

    /**
     * 获得分支下所有的叶子构件和树枝构件
     *
     * @return
     */
    public abstract List<Component> getChildren();
}
