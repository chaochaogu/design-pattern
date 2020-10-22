package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 抽象同事类
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public abstract class AbsColleague {

    /**
     * 每个同事类都对中介者非常了解
     */
    protected AbsMediator mediator;

    public AbsColleague(AbsMediator mediator) {
        this.mediator = mediator;
    }
}
