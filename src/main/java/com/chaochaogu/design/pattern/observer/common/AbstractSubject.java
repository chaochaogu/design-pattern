package com.chaochaogu.design.pattern.observer.common;

import java.util.Vector;

/**
 * 被观察者
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public abstract class AbstractSubject {

    /**
     * 存放观察者
     */
    private Vector<IObserver> observers = new Vector<>();

    /**
     * 添加观察者
     *
     * @param observer
     */
    public void addObserver(IObserver observer) {
        this.observers.add(observer);
    }

    /**
     * 移除观察者
     *
     * @param observer
     */
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    /**
     * 通知各个观察者
     */
    public void notifyObservers() {
        for (IObserver observer : this.observers) {
            observer.update();
        }
    }
}
