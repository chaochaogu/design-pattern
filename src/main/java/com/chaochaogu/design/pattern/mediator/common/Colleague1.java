package com.chaochaogu.design.pattern.mediator.common;

/**
 * 具体同事类1
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Colleague1 extends AbstractColleague {

    /**
     * 通过构造函数传递中介者（同事类都需要中介者，故此处直接构造注入）
     *
     * @param mediator
     */
    public Colleague1(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 自有方法 self-method
     */
    public void selfMethod1() {
        // 处理自己的业务逻辑
    }

    /**
     * 依赖方法 dep-method
     */
    public void depMethod1() {
        // 处理自己的业务逻辑
        // 自己不能处理的业务逻辑，委托给中介者处理
        super.mediator.doSomething1();
    }
}
