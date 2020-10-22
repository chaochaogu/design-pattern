package com.chaochaogu.design.pk.behavior.strategyvsstate.state;

/**
 * 孩童状态
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ChildState extends HumanState {

    @Override
    public void work() {
        System.out.println("孩子的工作就是玩耍");
        super.human.setState(Human.ADULT_STATE);
    }
}
