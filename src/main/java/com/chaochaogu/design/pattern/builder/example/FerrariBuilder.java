package com.chaochaogu.design.pattern.builder.example;

import java.util.List;

/**
 * 法拉利模型车组装者
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class FerrariBuilder extends CarBuilder {
    private FerrariCarModel ferrariCarModel = new FerrariCarModel();

    @Override
    void setSequences(List<String> sequences) {
        this.ferrariCarModel.setSequences(sequences);
    }

    @Override
    CarModel getCarModel() {
        return this.ferrariCarModel;
    }
}
