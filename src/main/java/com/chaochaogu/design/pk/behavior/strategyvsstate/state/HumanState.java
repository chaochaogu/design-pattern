package com.chaochaogu.design.pk.behavior.strategyvsstate.state;

/**
 * 人的抽象状态
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public abstract class HumanState {

    /**
     * 指向一个具体的人
     */
    protected Human human;

    /**
     * 设置一个具体的人
     *
     * @param human
     */
    public void setHuman(Human human) {
        this.human = human;
    }

    /**
     * 不管人是什么状态都要工作
     */
    public abstract void work();
}
