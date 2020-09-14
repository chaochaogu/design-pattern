package com.chaochaogu.design.pattern.visitor.example.normal;

import lombok.Data;

/**
 * 抽象员工
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
@Data
public abstract class AbstractEmployee {
    public static final int MALE = 1;
    public static final int FEMALE = 0;

    /**
     * 员工姓名
     */
    private String name;
    /**
     * 性别
     */
    private int gender;
    /**
     * 薪水
     */
    private int salary;

    /**
     * 打印出员工的信息
     */
    public final void report() {
        String info = "姓名：" + this.name + "\t";
        info = info + "性别：" + (this.gender == FEMALE ? "女" : "男") + "\t";
        info = info + "薪水：" + this.salary + "\t";
        //获得员工的其他信息
        info = info + this.getOtherInfo();
        System.out.println(info);
    }

    /**
     * 拼装员工的其他信息
     *
     * @return
     */
    protected abstract String getOtherInfo();
}
