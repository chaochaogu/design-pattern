package com.chaochaogu.design.pattern.state.common;

/**
 * 具体状态角色2
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public class State2 extends AbstractState {

    @Override
    public void handle1() {
        // 设置当前状态为state1
        super.context.setCurrentState(Context.STATE1);
        // 过渡到state1状态，由Context实现
        super.context.getCurrentState().handle1();
    }

    @Override
    public void handle2() {
        // 本状态下必须处理的逻辑
        System.out.println("handle2 ...");
    }
}
