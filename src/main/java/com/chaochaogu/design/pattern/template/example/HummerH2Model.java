package com.chaochaogu.design.pattern.template.example;

/**
 * H2型号的悍马模型
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class HummerH2Model extends HummerModel {
    @Override
    void start() {
        System.out.println("悍马H2型号发动");
    }

    @Override
    void stop() {
        System.out.println("悍马H2型号停车");
    }

    @Override
    void alarm() {
        System.out.println("悍马H2型号鸣笛");
    }

    @Override
    void engineBoom() {
        System.out.println("悍马H2型号引擎轰鸣");
    }

    @Override
    protected boolean isAlarm() {
        // H2型号不需要喇叭
        return false;
    }
}
