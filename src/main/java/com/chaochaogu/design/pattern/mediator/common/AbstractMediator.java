package com.chaochaogu.design.pattern.mediator.common;

/**
 * 通用抽象中介者
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public abstract class AbstractMediator {

    /**
     * 定义同事类
     */
    protected Colleague1 colleague1;
    protected Colleague2 colleague2;

    /**
     * 通过setter getter方法把同事类注入进来
     * （中介者可以只拥有部分同事类，而同事类都需要有中介者，故此处setter注入）
     *
     * @param colleague1
     */
    public void setColleague1(Colleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Colleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    public AbstractColleague getColleague1() {
        return colleague1;
    }

    public AbstractColleague getColleague2() {
        return colleague2;
    }

    /**
     * 中介者模式的业务逻辑
     */
    public abstract void doSomething1();

    public abstract void doSomething2();
}
