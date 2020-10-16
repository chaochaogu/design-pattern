package com.chaochaogu.design.pk.create.factoryvsbuilder.builder;

/**
 * 成年超人建造者
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class AdultSupermanBuilder extends AbstractBuilder {

    @Override
    public Superman getSuperman() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("会飞行");
        super.setSpecialSymbol("胸前带S标记");
        return super.superman;
    }
}
