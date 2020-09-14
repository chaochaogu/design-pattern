package com.chaochaogu.design.pattern.visitor.common;

/**
 * 抽象元素
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public abstract class AbstractElement {

    /**
     * 抽象业务逻辑
     */
    public abstract void doSomething();

    /**
     * 允许谁来访问
     *
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
