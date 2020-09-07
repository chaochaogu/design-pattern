package com.chaochaogu.design.pattern.decorator.example.normal;

/**
 * 修饰成绩单
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class SugarFouthGradeSchoolReport extends FouthGradeSchoolReport {

    /**
     * 首先定义你要美化的方法，先给老爸说学校最高成绩
     */
    private void reportHighScore() {
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    /**
     * 在老爸看完成绩单后，再汇报在学校的排名
     */
    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
