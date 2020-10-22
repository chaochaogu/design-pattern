package com.chaochaogu.design.pk.cross.facadevsmediator.facade;

import java.util.Random;

/**
 * 考勤情况
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Attendance {

    /**
     * 获得出勤天数
     *
     * @return
     */
    public int getWorkDays() {
        return new Random().nextInt(30);
    }
}
