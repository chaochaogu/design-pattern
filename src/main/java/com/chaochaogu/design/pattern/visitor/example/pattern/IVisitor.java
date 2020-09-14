package com.chaochaogu.design.pattern.visitor.example.pattern;

/**
 * 访问者接口
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public interface IVisitor {

    /**
     * 首先，定义我可以访问普通员工
     *
     * @param commonEmployee
     */
    public void visit(CommonEmployee commonEmployee);

    /**
     * 其次，定义我还可以访问部门经理
     *
     * @param manager
     */
    public void visit(Manager manager);
}
