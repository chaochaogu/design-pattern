package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * 调用者
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class Invoker {

    /**
     * 抽象命令的引用
     */
    protected AbstractCmd cmd;

    public Invoker(AbstractCmd cmd) {
        this.cmd = cmd;
    }

    /**
     * 执行命令
     *
     * @param source
     * @param to
     * @return
     */
    public boolean execute(String source, String to) {
        return cmd.execute(source, to);
    }
}
