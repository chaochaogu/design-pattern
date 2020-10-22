package com.chaochaogu.design.pk.behavior.strategyvsstate.state;

/**
 * 老年人状态
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class OldState extends HumanState {

    @Override
    public void work() {
        System.out.println("老年人的工作就是享受天伦之乐");
    }
}
