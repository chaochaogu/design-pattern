package com.chaochaogu.design.pk.create.factoryvsbuilder.factory;

/**
 * 超人制造工厂
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class SupermanFactory {

    public static ISuperman createSuperman(String type) {
        // 根据输入参数产生不同的超人
        ISuperman superman = null;
        switch (type) {
            case "adult": {
                // 生产成人超人
                superman = new AdultSuperman();
                break;
            }
            case "child": {
                // 生产未成年超人
                superman = new ChildSuperman();
                break;
            }
            default: {
            }
        }
        return superman;
    }
}
