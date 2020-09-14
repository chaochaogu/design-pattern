package com.chaochaogu.design.pattern.visitor.extend.count;


/**
 * 具体访问者
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Visitor implements IVisitor {

    /**
     * 普通员工的工资系数是2
     */
    private static final int COMMON_COEFFICIENT = 2;
    /**
     * 部门经理的工资系数是5
     */
    private static final int MANAGER_COEFFICIENT = 5;
    /**
     * 普通员工的工资总和
     */
    private int commonTotalSalary = 0;
    /**
     * 部门经理的工资总和
     */
    private int managerTotalSalary = 0;

    /**
     * 计算普通员工的工资总和
     *
     * @param salary
     */
    private void calCommonTotalSalary(int salary) {
        this.commonTotalSalary += salary * COMMON_COEFFICIENT;
    }

    /**
     * 计算部门经理的工资总和
     *
     * @param salary
     */
    private void calManagerTotalSalary(int salary) {
        this.managerTotalSalary += salary * MANAGER_COEFFICIENT;
    }

    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
        this.calCommonTotalSalary(commonEmployee.getSalary());
    }

    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
        this.calManagerTotalSalary(manager.getSalary());
    }

    /**
     * 组装出基本信息
     *
     * @param employee
     * @return
     */
    private String getBasicInfo(AbstractEmployee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getGender() == AbstractEmployee.FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }

    /**
     * 组装出部门经理的信息
     *
     * @param manager
     * @return
     */
    private String getManagerInfo(Manager manager) {
        String basicInfo = this.getBasicInfo(manager);
        String otherInfo = "业绩：" + manager.getPerformance() + "\t";
        return basicInfo + otherInfo;
    }

    /**
     * 组装出普通员工信息
     *
     * @param commonEmployee
     * @return
     */
    private String getCommonEmployee(CommonEmployee commonEmployee) {
        String basicInfo = this.getBasicInfo(commonEmployee);
        String otherInfo = "工作：" + commonEmployee.getJob() + "\t";
        return basicInfo + otherInfo;
    }

    /**
     * 获得所有员工的工资总和
     *
     * @return
     */
    @Override
    public int getTotalSalary() {
        return commonTotalSalary + managerTotalSalary;
    }
}
