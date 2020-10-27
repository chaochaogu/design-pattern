package com.chaochaogu.design.extend.newpattern.specification.common;

/**
 * 非规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class NotSpecification extends CompositeSpecification {

    private ISpecification spec;

    public NotSpecification(ISpecification spec) {
        this.spec = spec;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return spec.isSatisfiedBy(candidate);
    }
}
