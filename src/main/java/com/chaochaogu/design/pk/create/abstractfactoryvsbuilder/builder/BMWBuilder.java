package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.builder;

/**
 * 宝马车建造车间
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class BMWBuilder extends AbstractCarBuilder {

    @Override
    protected String buildWheel() {
        return super.getBlueprint().getWheel();
    }

    @Override
    protected String buildEngine() {
        return super.getBlueprint().getEngine();
    }
}
