package com.chaochaogu.design.extend.newpattern.specification.common;

/**
 * 业务规格书
 *
 * @author chaochao Gu
 * @date 2020/10/27
 */
public class BizSpecification extends CompositeSpecification {

    /**
     * 基准对象
     */
    private Object obj;

    public BizSpecification(Object obj) {
        this.obj = obj;
    }

    @Override
    public boolean isSatisfiedBy(Object candidate) {
        // 根据基准对象和业务对象，进行业务判断
        return false;
    }
}
