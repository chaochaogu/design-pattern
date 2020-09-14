package com.chaochaogu.design.pattern.visitor.example.pattern;

/**
 * 访问者实现
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Visitor implements IVisitor {

    /**
     * 访问普通员工，打印出报表
     *
     * @param commonEmployee
     */
    @Override
    public void visit(CommonEmployee commonEmployee) {
        System.out.println(this.getCommonEmployee(commonEmployee));
    }

    /**
     * 访问部门经理，打印出报表
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        System.out.println(this.getManagerInfo(manager));
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
}
