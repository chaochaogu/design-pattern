package com.chaochaogu.design.pattern.bridge.common;

/**
 * 具体抽象化角色
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class RefinedAbstraction extends Abstraction {

    /**
     * 覆写构造函数
     *
     * @param imp
     */
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    /**
     * 修正父类的行为
     */
    @Override
    public void request() {
        // 业务逻辑
        super.request();
        super.getImp().doAnything();
    }
}
