package com.chaochaogu.design.pattern.builder.example;

import java.util.List;

/**
 * 抽象车辆模型组装者
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class CarBuilder {
    /**
     * 给到建造模型的组装顺序
     *
     * @param sequences
     */
    abstract void setSequences(List<String> sequences);

    /**
     * 顺序设置完成，拿到车辆模型
     *
     * @return
     */
    abstract CarModel getCarModel();
}
