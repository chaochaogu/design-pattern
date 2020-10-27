package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 组合规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public abstract class CompositeSpecification implements IUserSpecification {

    /**
     * 是否满足条件由实现类实现
     *
     * @param user
     * @return
     */
    @Override
    public abstract boolean isSatisfiedBy(User user);

    /**
     * and操作
     *
     * @param spec
     * @return
     */
    @Override
    public IUserSpecification and(IUserSpecification spec) {
        return new AndSpecification(this, spec);
    }

    /**
     * or操作
     *
     * @param spec
     * @return
     */
    @Override
    public IUserSpecification or(IUserSpecification spec) {
        return new OrSpecification(this, spec);
    }

    /**
     * not操作
     *
     * @return
     */
    @Override
    public IUserSpecification not() {
        return new NotSpecification(this);
    }
}
