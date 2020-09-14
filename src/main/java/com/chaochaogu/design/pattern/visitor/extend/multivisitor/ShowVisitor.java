package com.chaochaogu.design.pattern.visitor.extend.multivisitor;

/**
 * 具体展示表
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class ShowVisitor implements IShowVisitor {
    private String info = "";

    /**
     * 打印出报表
     */
    @Override
    public void report() {
        System.out.println(this.info);
    }

    /**
     * 访问普通员工，组装信息
     *
     * @param commonEmployee
     */
    @Override
    public void visit(CommonEmployee commonEmployee) {
        this.info = this.info + this.getBasicInfo(commonEmployee)
                + "工作：" + commonEmployee.getJob() + "\t\n";
    }

    /**
     * 访问经理，然后组装信息
     *
     * @param manager
     */
    @Override
    public void visit(Manager manager) {
        this.info = this.info + this.getBasicInfo(manager) + "业绩："
                + manager.getPerformance() + "\t\n";
    }

    /**
     * 组装出基本信息
     *
     * @param employee
     * @return
     */
    private String getBasicInfo(AbstractEmployee employee) {
        String info = "姓名：" + employee.getName() + "\t";
        info = info + "性别：" + (employee.getGender() == AbstractEmployee.FEMALE ? "女" :
                "男") + "\t";
        info = info + "薪水：" + employee.getSalary() + "\t";
        return info;
    }
}
