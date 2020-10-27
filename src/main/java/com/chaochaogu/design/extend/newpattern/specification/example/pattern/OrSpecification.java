package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 或规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class OrSpecification extends CompositeSpecification {

    /**
     * 传递两个规格书进行or操作
     */
    private IUserSpecification left;
    private IUserSpecification right;

    public OrSpecification(IUserSpecification left, IUserSpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(User user) {
        return left.isSatisfiedBy(user) || right.isSatisfiedBy(user);
    }
}
