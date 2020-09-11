package com.chaochaogu.design.pattern.observer.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Client {
    public static void main(String[] args) {
        // 创建一个被观察者
        Subject subject = new Subject();
        // 创建一个观察者
        Observer observer = new Observer();
        subject.addObserver(observer);
        subject.doSomething();
    }
}
