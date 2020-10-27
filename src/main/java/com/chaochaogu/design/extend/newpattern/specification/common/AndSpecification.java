package com.chaochaogu.design.extend.newpattern.specification.common;

/**
 * 与规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class AndSpecification extends CompositeSpecification {

    /**
     * 传递两个规格书进行and计算
     */
    private ISpecification left;
    private ISpecification right;

    public AndSpecification(ISpecification left, ISpecification right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        return left.isSatisfiedBy(candidate) && right.isSatisfiedBy(candidate);
    }
}
