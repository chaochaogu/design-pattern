package com.chaochaogu.design.pattern.compose.common;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 树枝构件
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Composite extends Component {
    /**
     * 构件容器
     */
    private List<Component> components = Lists.newArrayList();

    /**
     * 增加一个叶子构件或树枝构件
     *
     * @param component
     */
    public void add(Component component) {
        this.components.add(component);
    }

    /**
     * 移除一个叶子构件或树枝构件
     *
     * @param component
     */
    public void remove(Component component) {
        this.components.remove(component);
    }

    /**
     * 获得分支下所有的叶子构件和树枝构件
     *
     * @return
     */
    public List<Component> getChildren() {
        return this.components;
    }
}
