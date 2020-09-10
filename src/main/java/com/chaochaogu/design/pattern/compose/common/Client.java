package com.chaochaogu.design.pattern.compose.common;

import java.util.List;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个根节点
        Composite root = new Composite();
        root.doSomething();
        // 创建一个树枝节点
        Composite branch = new Composite();
        // 创建一个叶子节点
        Leaf leaf = new Leaf();
        // 建立整体
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    /**
     * 通过递归遍历树
     *
     * @param root
     */
    public static void display(Composite root) {
        List<Component> components = root.getChildren();
        for (Component c : components) {
            if (c instanceof Leaf) {
                // 叶子节点
                c.doSomething();
            } else {
                // 树枝节点
                display((Composite) c);
            }
        }
    }
}
