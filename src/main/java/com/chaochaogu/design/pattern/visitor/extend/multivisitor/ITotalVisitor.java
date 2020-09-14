package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

/**
 * 汇总表接口
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public interface ITotalVisitor extends IVisitor {

    /**
     * 统计所有员工工资总和
     */
    public void totalSalary();
}
