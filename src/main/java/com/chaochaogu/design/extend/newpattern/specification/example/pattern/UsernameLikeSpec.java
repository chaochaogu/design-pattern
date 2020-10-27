package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 用户姓名like规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class UsernameLikeSpec extends CompositeSpecification {

    private String name;

    public UsernameLikeSpec(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return user.getName().contains(this.name);
    }
}
