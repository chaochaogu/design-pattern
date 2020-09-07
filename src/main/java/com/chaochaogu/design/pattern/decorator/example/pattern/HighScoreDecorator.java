package com.chaochaogu.design.pattern.decorator.example.pattern;

import com.chaochaogu.design.pattern.decorator.example.normal.AbstractSchoolReport;

/**
 * 最高成绩修饰
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class HighScoreDecorator extends AbstractDecorator {

    /**
     * 构造函数，传递成绩单过来
     *
     * @param sr
     */
    public HighScoreDecorator(AbstractSchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
