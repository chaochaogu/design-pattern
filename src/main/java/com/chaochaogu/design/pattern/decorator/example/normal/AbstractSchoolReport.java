package com.chaochaogu.design.pattern.decorator.example.normal;

/**
 * 抽象成绩单
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public abstract class AbstractSchoolReport {

    /**
     * 展示成绩
     */
    public abstract void report();

    /**
     * 家长签名
     */
    public abstract void sign(String name);
}
