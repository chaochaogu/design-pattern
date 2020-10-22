package com.chaochaogu.design.pk.behavior.strategyvsstate.state;

/**
 * 成人状态
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class AdultState extends HumanState {

    @Override
    public void work() {
        System.out.println("成年人的工作就是赚钱养家");
        super.human.setState(Human.OLD_STATE);
    }
}
