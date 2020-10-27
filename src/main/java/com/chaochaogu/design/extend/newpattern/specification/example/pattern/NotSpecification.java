package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 非规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class NotSpecification extends CompositeSpecification {

    /**
     * 传递一个规格书
     */
    private IUserSpecification sc;

    public NotSpecification(IUserSpecification sc) {
        this.sc = sc;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return !sc.isSatisfiedBy(user);
    }
}
