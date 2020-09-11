package com.chaochaogu.design.pattern.observer.example.pattern;

/**
 * 观察者接口
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public interface Observer {

    /**
     * 一发现别人有动静，自己也要行动起来
     *
     * @param context
     */
    public void update(String context);
}
