package com.chaochaogu.design.pattern.compose.extend.transparent;

import java.util.List;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Client {

    /**
     * 通过递归遍历树
     *
     * @param root
     */
    public static void display(Component root) {
        List<Component> components = root.getChildren();
        for (Component c : components) {
            if (c instanceof Leaf) {
                // 叶子节点
                c.doSomething();
            } else {
                // 树枝节点
                display(c);
            }
        }
    }
}
