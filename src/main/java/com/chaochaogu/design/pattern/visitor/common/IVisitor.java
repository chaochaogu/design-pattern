package com.chaochaogu.design.pattern.visitor.common;

/**
 * 访问者接口
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public interface IVisitor {

    /**
     * 允许访问e1
     *
     * @param e1
     */
    public void visit(Element1 e1);

    /**
     * 允许访问e2
     *
     * @param e2
     */
    public void visit(Element2 e2);
}
