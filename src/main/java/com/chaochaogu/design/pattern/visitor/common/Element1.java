package com.chaochaogu.design.pattern.visitor.common;

/**
 * 具体元素1
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Element1 extends AbstractElement {

    @Override
    public void doSomething() {
        // 完善业务逻辑
        System.out.println("do good things");
    }

    /**
     * 允许那个访问者访问
     *
     * @param visitor
     */
    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
