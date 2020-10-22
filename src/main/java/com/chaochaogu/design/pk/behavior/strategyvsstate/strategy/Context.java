package com.chaochaogu.design.pk.behavior.strategyvsstate.strategy;

/**
 * 环境角色
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class Context {

    private WorkAlgorithm workMethod;

    public WorkAlgorithm getWork() {
        return this.workMethod;
    }

    public void setWork(WorkAlgorithm workMethod) {
        this.workMethod = workMethod;
    }

    /**
     * 每个算法都有必须有的功能
     */
    public void work() {
        workMethod.work();
    }
}
