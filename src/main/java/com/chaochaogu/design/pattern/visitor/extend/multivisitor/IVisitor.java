package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

/**
 * 访问者接口
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public interface IVisitor {

    /**
     * 可以访问普通员工
     *
     * @param commonEmployee
     */
    public void visit(CommonEmployee commonEmployee);

    /**
     * 可以访问部门经理
     *
     * @param manager
     */
    public void visit(Manager manager);
}
