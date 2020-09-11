package com.chaochaogu.design.pattern.observer.example.pattern;

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
        // 三个观察者产生出来
        LiSi liSi = new LiSi();
        WangSi wangSi = new WangSi();
        LiuSi liuSi = new LiuSi();
        // 我们后人根据历史，描述这个场景，有三个人在观察韩非子
        hanFeiZi.addObserver(liSi);
        hanFeiZi.addObserver(wangSi);
        hanFeiZi.addObserver(liuSi);
        // 韩非子有所活动
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
