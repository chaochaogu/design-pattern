package com.chaochaogu.design.pattern.observer.extend;

import com.chaochaogu.design.pattern.observer.example.normal.IHanFeiZi;

import java.util.Observable;

/**
 * 优化后的被观察者（引用Java自带Observable）
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子开始吃早饭了");
        super.setChanged();
        super.notifyObservers("韩非子在吃饭");
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子开始娱乐了");
        super.setChanged();
        super.notifyObservers("韩非子在娱乐");
    }
}
