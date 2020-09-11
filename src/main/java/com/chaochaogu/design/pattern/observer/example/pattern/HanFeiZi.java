package com.chaochaogu.design.pattern.observer.example.pattern;

import com.chaochaogu.design.pattern.observer.example.normal.IHanFeiZi;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * 被观察者实现类
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class HanFeiZi implements Observable, IHanFeiZi {
    /**
     * 存放所有观察者
     */
    private List<Observer> observers = Lists.newArrayList();

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃早饭了 ...");
        this.notifyObservers("韩非子开始吃早饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐活动了 ...");
        this.notifyObservers("韩非子开始娱乐");
    }

    @Override
    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers(String context) {
        for (Observer observer : this.observers) {
            observer.update(context);
        }
    }
}
