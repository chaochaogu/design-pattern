package com.chaochaogu.design.pk.cross.facadevsmediator.facade;

/**
 * 奖金计算
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Bonus {

    /**
     * 考勤情况
     */
    private Attendance atte = new Attendance();

    /**
     * 奖金
     *
     * @return
     */
    public int getBonus() {
        // 获得出勤情况
        int workDays = atte.getWorkDays();
        // 奖金计算模型
        return workDays * 1800 / 30;
    }
}
