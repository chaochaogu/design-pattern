package com.chaochaogu.design.pattern.visitor.common;

/**
 * 具体访问者
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Visitor implements IVisitor {

    /**
     * 访问e1
     *
     * @param e1
     */
    @Override
    public void visit(Element1 e1) {
        e1.doSomething();
    }

    /**
     * 访问e2
     *
     * @param e2
     */
    @Override
    public void visit(Element2 e2) {
        e2.doSomething();
    }
}
