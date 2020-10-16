package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.builder;

/**
 * 抽象建造者
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public abstract class AbstractCarBuilder {

    /**
     * 待建造的汽车
     */
    private ICar car;

    /**
     * 设计蓝图
     */
    private Blueprint bp;

    public Car buildCar() {
        // 按照顺序生产一辆车
        return new Car(buildWheel(), buildEngine());
    }

    /**
     * 接收一份设计蓝图
     *
     * @param bp
     */
    public void receiveBlueprint(Blueprint bp) {
        this.bp = bp;
    }

    /**
     * 查看蓝图，只有真正的建造者才可以查看蓝图
     *
     * @return
     */
    protected Blueprint getBlueprint() {
        return bp;
    }

    /**
     * 建造车轮
     *
     * @return
     */
    protected abstract String buildWheel();

    /**
     * 建造引擎
     *
     * @return
     */
    protected abstract String buildEngine();
}
