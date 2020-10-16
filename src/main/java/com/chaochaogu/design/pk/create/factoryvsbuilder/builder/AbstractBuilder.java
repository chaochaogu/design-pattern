package com.chaochaogu.design.pk.create.factoryvsbuilder.builder;

/**
 * 抽象建造者
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public abstract class AbstractBuilder {

    /**
     * 定义一个超人的应用
     */
    protected final Superman superman = new Superman();

    /**
     * 构建出超人的躯体
     *
     * @param body
     */
    public void setBody(String body) {
        this.superman.setBody(body);
    }

    /**
     * 构建出超人的超能力
     *
     * @param st
     */
    public void setSpecialTalent(String st) {
        this.superman.setSpecialTalent(st);
    }

    /**
     * 构建出超人的特殊标志
     *
     * @param ss
     */
    public void setSpecialSymbol(String ss) {
        this.superman.setSpecialSymbol(ss);
    }

    /**
     * 构建出完整的超人
     *
     * @return
     */
    public abstract Superman getSuperman();
}
