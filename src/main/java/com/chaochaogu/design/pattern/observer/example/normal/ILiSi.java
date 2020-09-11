package com.chaochaogu.design.pattern.observer.example.normal;

/**
 * 抽象观察者
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public interface ILiSi {

    /**
     * 一发现别人有动静，自己也要行动起来
     *
     * @param context
     */
    public void update(String context);
}
