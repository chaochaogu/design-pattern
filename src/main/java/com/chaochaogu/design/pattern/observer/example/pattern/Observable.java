package com.chaochaogu.design.pattern.observer.example.pattern;

/**
 * 被观察者接口
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public interface Observable {

    /**
     * 增加观察者
     *
     * @param observer
     */
    public void addObserver(Observer observer);

    /**
     * 删除观察者
     *
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    public void notifyObservers(String context);
}
