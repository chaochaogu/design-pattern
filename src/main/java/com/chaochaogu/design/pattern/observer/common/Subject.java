package com.chaochaogu.design.pattern.observer.common;

/**
 * 具体被观察者
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Subject extends AbstractSubject {

    /**
     * 具体业务
     */
    public void doSomething() {
        System.out.println("被观察者偷偷干活");
        super.notifyObservers();
    }
}
