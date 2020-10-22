package com.chaochaogu.design.pk.behavior.strategyvsstate.state;

/**
 * 环境角色
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class Human {

    /**
     * 定义人类都具有哪些状态
     */
    public static final HumanState CHILD_STATE = new ChildState();
    public static final HumanState ADULT_STATE = new AdultState();
    public static final HumanState OLD_STATE = new OldState();

    /**
     * 定义一个人的状态
     */
    private HumanState state;

    /**
     * 设置状态
     *
     * @param state
     */
    public void setState(HumanState state) {
        this.state = state;
        this.state.setHuman(this);
    }

    /**
     * 人类的工作
     */
    public void work() {
        this.state.work();
    }
}
