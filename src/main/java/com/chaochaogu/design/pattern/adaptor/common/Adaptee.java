package com.chaochaogu.design.pattern.adaptor.common;

/**
 * 源角色
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Adaptee {

    /**
     * 原有的业务逻辑
     */
    public void doSomething() {
        System.out.println("I'm kind of busy, leave me alone please!");
    }
}
