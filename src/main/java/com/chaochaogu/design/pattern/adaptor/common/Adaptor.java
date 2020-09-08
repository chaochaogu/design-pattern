package com.chaochaogu.design.pattern.adaptor.common;

/**
 * 适配器角色
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Adaptor extends Adaptee implements ITarget {

    @Override
    public void request() {
        super.doSomething();
    }
}
