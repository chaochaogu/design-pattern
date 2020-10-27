package com.chaochaogu.design.extend.newpattern.specification.common;

/**
 * 组合规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public abstract class CompositeSpecification implements ISpecification {

    /**
     * 是否满足条件由实现类实现
     *
     * @param candidate
     * @return
     */
    @Override
    public abstract boolean isSatisfiedBy(Object candidate);

    /**
     * and操作
     *
     * @param spec
     * @return
     */
    @Override
    public ISpecification and(ISpecification spec) {
        return new AndSpecification(this, spec);
    }

    /**
     * or操作
     *
     * @param spec
     * @return
     */
    @Override
    public ISpecification or(ISpecification spec) {
        return new OrSpecification(this, spec);
    }

    /**
     * not操作
     *
     * @return
     */
    @Override
    public ISpecification not() {
        return new NotSpecification(this);
    }
}
