package com.chaochaogu.design.pattern.state.common;

/**
 * 具体状态角色1
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public class State1 extends AbstractState {

    @Override
    public void handle1() {
        // 本状态下必须处理的逻辑
        System.out.println("handle1 ...");
    }

    @Override
    public void handle2() {
        // 设置当前状态为state2
        super.context.setCurrentState(Context.STATE2);
        // 过渡到state2状态，由Context实现
        super.context.getCurrentState().handle2();
    }
}
