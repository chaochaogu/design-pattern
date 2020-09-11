package com.chaochaogu.design.pattern.observer.common;

/**
 * 具体观察者
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Observer implements IObserver {

    /**
     * 监听到被观察者的动作，做出反应
     */
    @Override
    public void update() {
        System.out.println("被观察者有动作，做出反应");
    }
}
