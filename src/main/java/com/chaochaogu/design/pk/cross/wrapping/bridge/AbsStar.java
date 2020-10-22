package com.chaochaogu.design.pk.cross.wrapping.bridge;

/**
 * 抽象明星
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public abstract class AbsStar {

    /**
     * 一个明星参加哪些活动
     */
    protected final AbsAction action;

    /**
     * 通过构造函数传递具体活动
     *
     * @param action
     */
    public AbsStar(AbsAction action) {
        this.action = action;
    }

    /**
     * 每个明星都有自己的具体工作
     */
    public void doJob() {
        action.desc();
    }
}
