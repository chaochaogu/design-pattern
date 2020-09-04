package com.chaochaogu.design.pattern.command.example.normal;

/**
 * 抽象组
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public abstract class Group {

    /**
     * 甲乙双方分开办公，如果你要和某个组讨论，你首先要找到这个组
     */
    abstract void find();

    /**
     * 被要求增加功能
     */
    abstract void add();

    /**
     * 被要求删除功能
     */
    abstract void delete();

    /**
     * 被要求变更功能
     */
    abstract void change();

    /**
     * 被要求给出所有的变更计划
     */
    abstract void plan();

    /**
     * 每个接收者都要对直接执行的任务可以回滚
     */
    public void rollback() {
        // 根据日志进行回滚
    }
}
