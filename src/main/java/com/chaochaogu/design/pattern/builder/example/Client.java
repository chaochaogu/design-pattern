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
        FerrariCarModel ferrariCarModel = new FerrariCarModel();
        ferrariCarModel.setSequences(sequences);
        ferrariCarModel.run();
    }
}
