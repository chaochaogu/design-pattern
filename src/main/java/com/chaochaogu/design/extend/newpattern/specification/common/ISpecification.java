package com.chaochaogu.design.extend.newpattern.specification.common;

/**
 * 抽象规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public interface ISpecification {

    /**
     * 候选者是否满足要求
     *
     * @param candidate
     * @return
     */
    public boolean isSatisfiedBy(Object candidate);

    /**
     * and操作
     *
     * @param spec
     * @return
     */
    public ISpecification and(ISpecification spec);

    /**
     * or操作
     *
     * @param spec
     * @return
     */
    public ISpecification or(ISpecification spec);

    /**
     * not操作
     *
     * @return
     */
    public ISpecification not();
}
