package com.chaochaogu.design.pattern.observer.extend;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Client {
    public static void main(String[] args) {
        // 创建出被观察者
        HanFeiZi hanFeiZi = new HanFeiZi();
        // 创建出观察者
        LiSi liSi = new LiSi();
        // 添加观察者
        hanFeiZi.addObserver(liSi);
        // 被观察者行动
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
