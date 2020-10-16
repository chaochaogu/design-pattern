package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.builder;

/**
 * 导演类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Director {

    /**
     * 声明对建造者的引用
     */
    private AbstractCarBuilder bmwBuilder = new BMWBuilder();
    private AbstractCarBuilder benzBuilder = new BenzBuilder();

    /**
     * 生产奔驰SUV
     *
     * @return
     */
    public ICar createBenzSUV() {
        return createCar(benzBuilder, "benz的轮胎", "benz的引擎");
    }

    /**
     * 生产宝马商务车
     *
     * @return
     */
    public ICar createBMWVan() {
        return createCar(bmwBuilder, "bmw的轮胎", "bmw的引擎");
    }

    /**
     * 生产混合型汽车
     *
     * @return
     */
    public ICar createComplexCar() {
        return createCar(bmwBuilder, "bmw的轮胎", "benz的引擎");
    }

    /**
     * 生产车辆
     *
     * @param builder
     * @param wheel
     * @param engine
     * @return
     */
    private ICar createCar(AbstractCarBuilder builder, String wheel, String engine) {
        // 导演怀揣蓝图
        Blueprint blueprint = new Blueprint();
        blueprint.setWheel(wheel);
        blueprint.setEngine(engine);
        System.out.println("获得生产蓝图");
        builder.receiveBlueprint(blueprint);
        return builder.buildCar();
    }
}
