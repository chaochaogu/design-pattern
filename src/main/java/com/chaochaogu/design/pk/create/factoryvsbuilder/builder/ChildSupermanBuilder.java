package com.chaochaogu.design.pk.create.factoryvsbuilder.builder;

/**
 * 未成年超人建造者
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class ChildSupermanBuilder extends AbstractBuilder {

    @Override
    public Superman getSuperman() {
        super.setBody("强壮的躯体");
        super.setSpecialTalent("刀枪不入");
        super.setSpecialSymbol("胸前带小S标记");
        return super.superman;
    }
}
