package com.chaochaogu.design.pattern.observer.example.normal;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class Client {
    public static void main(String[] args) {
        // 定义出韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 韩非子吃早饭
        hanFeiZi.haveBreakfast();
        // 韩非子娱乐
        hanFeiZi.haveFun();
    }
}
