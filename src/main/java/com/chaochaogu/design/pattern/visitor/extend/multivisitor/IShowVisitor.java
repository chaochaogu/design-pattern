package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

/**
 * 展示表接口
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public interface IShowVisitor extends IVisitor {

    /**
     * 展示报表
     */
    public void report();
}
