package com.chaochaogu.design.pk.create.abstractfactoryvsbuilder.abstractfactory;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Client {
    public static void main(String[] args) {
        //要求生产一辆奔驰SUV
        System.out.println("===要求生产一辆奔驰SUV===");
        //首先找到生产奔驰车的工厂
        System.out.println("A、找到奔驰车工厂");
        CarFactory carFactory = new BenzFactory();
        //开始生产奔驰SUV
        System.out.println("B、开始生产奔驰SUV");
        ICar benzSuv = carFactory.createSUV();
        //生产完毕，展示一下车辆信息
        System.out.println("C、生产出的汽车如下：");
        System.out.println("汽车品牌：" + benzSuv.getBrand());
        System.out.println("汽车型号：" + benzSuv.getModel());
    }
}
