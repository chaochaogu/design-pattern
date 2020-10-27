package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 年龄大于基准年龄规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class AgeGreaterThanSpec extends CompositeSpecification {

    /**
     * 基准年龄
     */
    private int age;

    /**
     * 构造函数传递基准年龄
     *
     * @param age
     */
    public AgeGreaterThanSpec(int age) {
        this.age = age;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getAge() > this.age;
    }
}
