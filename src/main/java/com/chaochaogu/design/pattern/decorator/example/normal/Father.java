package com.chaochaogu.design.pattern.decorator.example.normal;

/**
 * 老爸查看成绩单
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Father {
    public static void main(String[] args) {
        // 把成绩单拿过来
        AbstractSchoolReport schoolReport = new FouthGradeSchoolReport();
        // 查看成绩单
        schoolReport.report();
        // 签名？休想

        // 把美化过后的成绩单拿过来
        AbstractSchoolReport sr = new SugarFouthGradeSchoolReport();
        // 看成绩单
        sr.report();
        // 老爸看完很高兴，签字不解释
        sr.sign("强哥");
    }
}
