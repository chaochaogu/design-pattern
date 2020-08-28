package com.chaochaogu.design.pattern.template.example;

/**
 * H1型号的悍马模型
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class HummerH1Model extends HummerModel {
    /**
     * 默认响喇叭
     */
    private boolean alarm = true;

    @Override
    void start() {
        System.out.println("悍马H1型号发动");
    }

    @Override
    void stop() {
        System.out.println("悍马H1型号停车");
    }

    @Override
    void alarm() {
        System.out.println("悍马H1型号鸣笛");
    }

    @Override
    void engineBoom() {
        System.out.println("悍马H1型号引擎轰鸣");
    }

    @Override
    protected boolean isAlarm() {
        return this.alarm;
    }

    /**
     * 要不要响喇叭是由客户决定的
     *
     * @param alarm
     */
    public void setAlarm(boolean alarm) {
        this.alarm = alarm;
    }
}
