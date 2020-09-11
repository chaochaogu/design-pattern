package com.chaochaogu.design.pattern.observer.example.normal;

/**
 * 具体的被观察者
 *
 * @author chaochao Gu
 * @date 2020/9/10
 */
public class HanFeiZi implements IHanFeiZi {

    /**
     * 把李斯声明出来
     */
    private ILiSi liSi = new LiSi();

    /**
     * 韩非子开始吃早饭
     */
    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃早饭了 ...");
        // 通知李斯
        this.liSi.update("韩非子在吃早饭");
    }

    /**
     * 韩非子开始娱乐
     */
    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐活动了 ...");
        // 通知李斯
        this.liSi.update("韩非子在娱乐");
    }
}
