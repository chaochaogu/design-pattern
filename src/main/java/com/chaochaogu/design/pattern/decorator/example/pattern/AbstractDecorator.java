package com.chaochaogu.design.pattern.decorator.example.pattern;

import com.chaochaogu.design.pattern.decorator.example.normal.AbstractSchoolReport;

/**
 * 修饰的抽象类
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public abstract class AbstractDecorator extends AbstractSchoolReport {

    /**
     * 首先要知道是哪个成绩单
     */
    private AbstractSchoolReport sr;

    /**
     * 构造函数，传递成绩单过来
     *
     * @param sr
     */
    public AbstractDecorator(AbstractSchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
