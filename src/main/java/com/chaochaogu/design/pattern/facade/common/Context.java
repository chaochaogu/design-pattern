package com.chaochaogu.design.pattern.facade.common;

/**
 * 封装类
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Context {
    private ClassA a = new ClassA();
    private ClassC c = new ClassC();

    /**
     * 模拟复杂业务逻辑
     */
    public void complexMethod() {
        a.doSomethingA();
        c.doSomethingC();
    }
}
