package com.chaochaogu.design.pattern.observer.common;

/**
 * 观察者接口
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public interface IObserver {

    /**
     * 接到通知，逻辑更新
     */
    public void update();
}
