package com.chaochaogu.design.pk.structure.decoratorvsadaptor.adaptor;

import com.chaochaogu.design.pk.structure.decoratorvsadaptor.decorator.Swan;

/**
 * 白天鹅
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class WhiteSwan implements Swan {

    /**
     * 天鹅会飞
     */
    @Override
    public void fly() {
        System.out.println("能够飞行");
    }

    /**
     * 白天鹅的叫声
     */
    @Override
    public void cry() {
        System.out.println("叫声是克噜——克噜——克噜");
    }

    /**
     * 白天鹅的外形
     */
    @Override
    public void show() {
        System.out.println("外形是纯白色，惹人喜爱");
    }
}
