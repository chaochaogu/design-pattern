package com.chaochaogu.design.pattern.flyweight.common;

/**
 * 具体享元角色1
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class Flyweight1 extends AbstractFlyweight {

    /**
     * 要求享元角色必须接受外部状态
     *
     * @param extrinsic
     */
    public Flyweight1(String extrinsic) {
        super(extrinsic);
    }

    /**
     * 根据外部状态进行逻辑处理
     */
    @Override
    public void operate() {
        // 业务逻辑
    }
}
