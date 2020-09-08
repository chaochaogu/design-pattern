package com.chaochaogu.design.pattern.adaptor.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Client {
    public static void main(String[] args) {
        // 原有的业务逻辑
        Target target = new Target();
        target.request();
        // 增加了适配器角色之后的业务逻辑
        Adaptor adaptor = new Adaptor();
        adaptor.request();
    }
}
