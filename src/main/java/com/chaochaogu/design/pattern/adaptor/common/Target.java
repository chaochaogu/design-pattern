package com.chaochaogu.design.pattern.adaptor.common;

/**
 * 目标角色的实现类
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Target implements ITarget {

    @Override
    public void request() {
        System.out.println("if you need any help, please call me!");
    }
}
