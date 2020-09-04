package com.chaochaogu.design.pattern.builder.example;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class Client {
    public static void main(String[] args) {
        List<String> sequences = Lists.newArrayList();
        sequences.add("alarm");
        sequences.add("engineBoom");
        sequences.add("stop");
        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequences(sequences);
        // 制造出一个奔驰车模型
        BenzCarModel benzCarModel = (BenzCarModel) benzBuilder.getCarModel();
        benzCarModel.run();
        // 以同样的顺序制造出一个法拉利模型
        FerrariBuilder ferrariBuilder = new FerrariBuilder();
        ferrariBuilder.setSequences(sequences);
        CarModel ferrariModel = ferrariBuilder.getCarModel();
        ferrariModel.run();
        // 批量造车试跑
        Director director = new Director();
        for (int i = 0; i < 100; i++) {
            director.getABenzCarModel().run();
        }
        for (int i = 0; i < 200; i++) {
            director.getBBenzCarModel().run();
        }
        for (int i = 0; i < 300; i++) {
            director.getCFerrariCarModel().run();
        }
        for (int i = 0; i < 400; i++) {
            director.getDFerrariCarModel().run();
        }
    }
}
