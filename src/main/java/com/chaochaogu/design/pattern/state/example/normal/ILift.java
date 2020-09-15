package com.chaochaogu.design.pattern.state.example.normal;

/**
 * 电梯接口
 *
 * @author chaochao Gu
 * @date 2020/9/15
 */
public interface ILift {

    /**
     * 定义状态常量，代表敞门、闭门、运行、停止状态
     */
    public static final int OPENING_STATE = 1;
    public static final int CLOSING_STATE = 2;
    public static final int RUNNING_STATE = 3;
    public static final int STOPPING_STATE = 4;

    /**
     * 设置电梯状态
     *
     * @param state
     */
    public void setState(int state);

    /**
     * 电梯开门
     */
    public void open();

    /**
     * 电梯关门
     */
    public void close();

    /**
     * 电梯运行
     */
    public void run();

    /**
     * 电梯停止
     */
    public void stop();
}
