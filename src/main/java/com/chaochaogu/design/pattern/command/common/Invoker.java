package com.chaochaogu.design.pattern.command.common;

/**
 * 调用者Invoker类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Invoker {
    private AbstractCommand command;

    /**
     * 接收命令
     *
     * @param command
     */
    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    /**
     * 执行命令
     */
    public void action() {
        this.command.execute();
    }
}
