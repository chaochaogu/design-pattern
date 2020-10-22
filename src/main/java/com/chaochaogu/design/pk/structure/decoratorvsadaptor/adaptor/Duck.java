package com.chaochaogu.design.pk.structure.decoratorvsadaptor.adaptor;

/**
 * 鸭类接口
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public interface Duck {

    /**
     * 会叫
     */
    public void cry();

    /**
     * 鸭子的外形
     */
    public void show();

    /**
     * 描述鸭子的其它行为
     */
    public void behave();
}
