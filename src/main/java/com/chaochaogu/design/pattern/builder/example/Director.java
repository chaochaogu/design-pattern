package com.chaochaogu.design.pattern.builder.example;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 导演类
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class Director {
    private List<String> sequences = Lists.newArrayList();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private FerrariBuilder ferrariBuilder = new FerrariBuilder();

    public BenzCarModel getABenzCarModel() {
        // 清理场景
        this.sequences.clear();
        sequences.add("start");
        sequences.add("alarm");
        this.benzBuilder.setSequences(sequences);
        return (BenzCarModel) this.benzBuilder.getCarModel();
    }

    public BenzCarModel getBBenzCarModel() {
        this.sequences.clear();
        sequences.add("start");
        sequences.add("engineBoom");
        this.benzBuilder.setSequences(sequences);
        return (BenzCarModel) this.benzBuilder.getCarModel();
    }

    public FerrariCarModel getCFerrariCarModel() {
        this.sequences.clear();
        sequences.add("start");
        sequences.add("engineBoom");
        sequences.add("alarm");
        sequences.add("stop");
        this.ferrariBuilder.setSequences(sequences);
        return (FerrariCarModel) this.ferrariBuilder.getCarModel();
    }

    public FerrariCarModel getDFerrariCarModel() {
        this.sequences.clear();
        sequences.add("start");
        sequences.add("alarm");
        sequences.add("engineBoom");
        sequences.add("stop");
        this.ferrariBuilder.setSequences(sequences);
        return (FerrariCarModel) this.ferrariBuilder.getCarModel();
    }
}
