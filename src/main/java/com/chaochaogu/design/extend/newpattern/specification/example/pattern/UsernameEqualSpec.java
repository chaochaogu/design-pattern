package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 姓名相同规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class UsernameEqualSpec extends CompositeSpecification {

    /**
     * 基准姓名
     */
    private String name;

    /**
     * 构造函数传递基准姓名
     *
     * @param name
     */
    public UsernameEqualSpec(String name) {
        this.name = name;
    }

    /**
     * 检验用户是否满足条件
     *
     * @param user
     * @return
     */
    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().equals(this.name);
    }
}
