package com.chaochaogu.design.pattern.flyweight.common;

/**
 * 抽象享元角色
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public abstract class AbstractFlyweight {

    /**
     * 内部状态
     */
    private String intrinsic;
    /**
     * 外部状态
     */
    protected final String extrinsic;

    /**
     * 要求享元角色必须接受外部状态
     *
     * @param extrinsic
     */
    public AbstractFlyweight(String extrinsic) {
        this.extrinsic = extrinsic;
    }

    /**
     * 定义业务操作
     */
    public abstract void operate();

    /**
     * 内部状态的getter/setter
     *
     * @param intrinsic
     */
    public void setIntrinsic(String intrinsic) {
        this.intrinsic = intrinsic;
    }

    public String getIntrinsic() {
        return intrinsic;
    }
}
