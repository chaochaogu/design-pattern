package com.chaochaogu.design.pattern.mediator.example.pattern;

/**
 * 抽象同事类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
