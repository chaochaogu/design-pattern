package com.chaochaogu.design.pattern.decorator.example.normal;

/**
 * 四年级成绩单
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class FouthGradeSchoolReport extends AbstractSchoolReport {

    @Override
    public void report() {
        //成绩单的格式是这个样子的
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");
        System.out.println(" 语文 62 数学 65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");

    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
