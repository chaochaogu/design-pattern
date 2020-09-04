package com.chaochaogu.design.pattern.mediator.common;

/**
 * 通用中介者
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Mediator extends AbstractMediator {

    @Override
    public void doSomething1() {
        // 调用同事类的方法，只要是public的方法都可以调用
        super.colleague1.selfMethod1();
        super.colleague2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        // 调用同事类的方法，只要是public的方法都可以调用
        super.colleague2.selfMethod2();
        super.colleague1.selfMethod1();
    }
}
