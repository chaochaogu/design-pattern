package com.chaochaogu.design.pattern.template.example;

/**
 * 悍马模型抽象类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public abstract class HummerModel {
    /**
     * 发动
     */
    abstract void start();

    /**
     * 停车
     */
    abstract void stop();

    /**
     * 鸣笛
     */
    abstract void alarm();

    /**
     * 引擎轰鸣
     */
    abstract void engineBoom();

    /**
     * 试跑
     */
    void run() {
        // 汽车启动
        this.start();
        // 引擎轰鸣
        this.engineBoom();
        // 路遇小狗一只，鸣笛
        if (this.isAlarm()) {
            this.alarm();
        }
        // 到达目的地停车
        this.stop();
    }

    /**
     * 钩子方法，默认喇叭是会响的
     *
     * @return
     */
    protected boolean isAlarm() {
        return true;
    }
}
