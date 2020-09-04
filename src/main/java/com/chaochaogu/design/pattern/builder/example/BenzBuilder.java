package com.chaochaogu.design.pattern.builder.example;

import java.util.List;

/**
 * 奔驰车模型组装者
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class BenzBuilder extends CarBuilder {
    private BenzCarModel benzCarModel = new BenzCarModel();

    @Override
    void setSequences(List<String> sequences) {
        this.benzCarModel.setSequences(sequences);
    }

    @Override
    CarModel getCarModel() {
        return this.benzCarModel;
    }
}
