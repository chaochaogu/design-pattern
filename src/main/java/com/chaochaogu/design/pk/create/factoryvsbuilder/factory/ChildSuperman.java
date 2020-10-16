package com.chaochaogu.design.pk.create.factoryvsbuilder.factory;

/**
 * 未成年超人
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class ChildSuperman implements ISuperman {

    /**
     * 超能先生的三个孩子
     */
    @Override
    public void specialTalent() {
        System.out.println("小超人的能力是刀枪不入，快速移动");
    }
}
