package com.chaochaogu.design.pattern.state.common;

/**
 * 抽象状态角色
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public abstract class AbstractState {

    /**
     * 定义一个环境角色，提供子类访问
     */
    protected Context context;

    /**
     * 设置环境角色
     *
     * @param context
     */
    public void setContext(Context context) {
        this.context = context;
    }

    /**
     * 行为1
     */
    public abstract void handle1();

    /**
     * 行为2
     */
    public abstract void handle2();
}