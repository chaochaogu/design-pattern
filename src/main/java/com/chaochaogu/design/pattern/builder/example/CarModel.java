package com.chaochaogu.design.pattern.builder.example;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class CarModel {
    private List<String> sequences = Lists.newArrayList();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        sequences.forEach(sequence -> {
            switch (sequence) {
                case "start":
                    this.start();
                    break;
                case "stop":
                    this.stop();
                    break;
                case "alarm":
                    this.alarm();
                    break;
                case "engineBoom":
                    this.engineBoom();
                    break;
                default: {
                }
            }
        });
    }

    public void setSequences(List<String> sequences) {
        this.sequences = sequences;
    }
}
