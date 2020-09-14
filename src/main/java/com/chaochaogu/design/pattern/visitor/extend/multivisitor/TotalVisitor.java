package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

/**
 * 具体汇总表
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class TotalVisitor implements ITotalVisitor {

    /**
     * 部门经理的工资系数是5
     */
    private final static int MANAGER_COEFFICIENT = 5;
    /**
     * 员工的工资系数是2
     */
    private final static int COMMONE_COEFFICIENT = 2;
    /**
     * 普通员工的工资总和
     */
    private int commonTotalSalary = 0;
    /**
     * 部门经理的工资总和
     */
    private int managerTotalSalary = 0;

    @Override
    public void totalSalary() {
        System.out.println("本公司的月工资总额是" + (this.commonTotalSalary +
                this.managerTotalSalary));
    }

    /**
     * 访问普通员工，计算工资总额
     *
     * @param commonEmployee
     */
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.commonTotalSalary = this.commonTotalSalary + commonEmployee.getSalary() * COMMONE_COEFFICIENT;
    }

    /**
     * 访问部门经理，计算工资总额
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        this.managerTotalSalary = this.managerTotalSalary + manager.getSalary() * MANAGER_COEFFICIENT;
    }

}
