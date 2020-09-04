package com.chaochaogu.design.pattern.command.example.pattern;

/**
 * 负责人
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Invoker {
    private Command command;

    /**
     * 客户发出命令
     *
     * @param command
     */
    public void setCommand(Command command) {
        this.command = command;
    }

    /**
     * 执行客户的命令
     */
    public void action() {
        this.command.execute();
    }
}
