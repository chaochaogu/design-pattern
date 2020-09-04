package com.chaochaogu.design.pattern.proxy.common;

/**
 * 代理类
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class Proxy implements Subject {
    /**
     * 要代理哪个实现类
     */
    private Subject subject;

    /**
     * 默认被代理者
     */
    public Proxy() {
        this.subject = new Proxy();
    }

    /**
     * 通过构造函数传递代理者
     *
     * @param subject
     */
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    /**
     * 预处理
     */
    public void before() {

    }

    /**
     * 善后处理
     */
    public void after() {

    }
}
