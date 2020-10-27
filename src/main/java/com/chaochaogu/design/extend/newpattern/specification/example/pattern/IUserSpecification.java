package com.chaochaogu.design.extend.newpattern.specification.example.pattern;

import com.chaochaogu.design.extend.newpattern.specification.example.normal.User;

/**
 * 带与或非的规格书接口
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public interface IUserSpecification {

    /**
     * 候选者是否满足要求
     *
     * @param user
     * @return
     */
    public boolean isSatisfiedBy(User user);

    /**
     * and操作
     *
     * @param spec
     * @return
     */
    public IUserSpecification and(IUserSpecification spec);

    /**
     * or操作
     *
     * @param spec
     * @return
     */
    public IUserSpecification or(IUserSpecification spec);

    /**
     * not操作
     *
     * @return
     */
    public IUserSpecification not();
}
