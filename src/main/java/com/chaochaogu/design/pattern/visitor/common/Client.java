package com.chaochaogu.design.pattern.visitor.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            // 获得元素对象
            AbstractElement element = ObjectStructure.createElement();
            // 接受访问者访问
            element.accept(new Visitor());
        }
    }
}
