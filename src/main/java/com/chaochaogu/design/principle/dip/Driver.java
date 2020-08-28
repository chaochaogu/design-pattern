package com.chaochaogu.design.principle.dip;

import lombok.Data;

/**
 * @author chaochao Gu
 * @date 2020/8/25
 */
@Data
public class Driver implements IDriver {
    /**
     * 构造函数注入
     *
     * @param car
     */
    public Driver(ICar car) {
        this.car = car;
    }

    private ICar car;

    @Override
    public void drive() {
        car.run();
    }
}
