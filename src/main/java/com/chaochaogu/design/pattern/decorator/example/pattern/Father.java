package com.chaochaogu.design.pattern.decorator.example.pattern;

import com.chaochaogu.design.pattern.decorator.example.normal.AbstractSchoolReport;
import com.chaochaogu.design.pattern.decorator.example.normal.FouthGradeSchoolReport;

/**
 * 老爸查看修饰后的成绩单
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        AbstractSchoolReport sr;
        // 原装的成绩单
        sr = new FouthGradeSchoolReport();
        // 加了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);
        // 又加了成绩排名的说明
        sr = new SortDecorator(sr);
        // 看成绩单
        sr.report();
        // 喜上眉梢，签名
        sr.sign("强哥");
    }
}
