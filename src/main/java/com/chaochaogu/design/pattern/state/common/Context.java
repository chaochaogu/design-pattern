package com.chaochaogu.design.pattern.state.common;

/**
 * 环境角色
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public class Context {

    /**
     * 定义状态
     */
    public static final State1 STATE1 = new State1();
    public static final State2 STATE2 = new State2();

    /**
     * 当前状态
     */
    private AbstractState currentState;
    public AbstractState getCurrentState() {
        return this.currentState;
    }
    public void setCurrentState(AbstractState currentState) {
        this.currentState = currentState;
        // 切换状态
        this.currentState.setContext(this);
    }

    /**
     * 行为委托
     */
    public void handle1() {
        this.currentState.handle1();
    }

    /**
     * 行为委托
     */
    public void handle2() {
        this.currentState.handle2();
    }
}
