package com.chaochaogu.design.pk.cross.facadevsmediator.facade;

import java.util.Date;

/**
 * HR门面
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class HRFacade {

    /**
     * 总工资情况
     */
    private SalaryProvider salaryProvider = new SalaryProvider();

    /**
     * 考勤情况
     */
    private Attendance atte = new Attendance();

    /**
     * 查询一个人的总收入
     *
     * @return
     */
    public int querySalary(String name, Date date) {
        return salaryProvider.getTotalSalary();
    }

    /**
     * 查询一个人一个月的出勤天数
     *
     * @return
     */
    public int queryWorkDays(String name) {
        return atte.getWorkDays();
    }
}
