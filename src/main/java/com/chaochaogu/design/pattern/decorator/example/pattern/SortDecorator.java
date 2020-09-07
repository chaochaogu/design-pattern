package com.chaochaogu.design.pattern.decorator.example.pattern;

import com.chaochaogu.design.pattern.decorator.example.normal.AbstractSchoolReport;

/**
 * 排名情况修饰
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class SortDecorator extends AbstractDecorator {

    /**
     * 构造函数，传递成绩单过来
     *
     * @param sr
     */
    public SortDecorator(AbstractSchoolReport sr) {
        super(sr);
    }

    public void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
