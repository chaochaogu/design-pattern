package com.chaochaogu.design.pattern.command.common;

/**
 * 抽象的Command类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public abstract class AbstractCommand {

    /**
     * 每个命令类都必须有一个执行命令的方法
     */
    public abstract void execute();
}
