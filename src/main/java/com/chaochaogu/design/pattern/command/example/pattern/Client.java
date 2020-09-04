package com.chaochaogu.design.pattern.command.example.pattern;

/**
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Client {
    public static void main(String[] args) {
        // 定义接头人
        Invoker invoker = new Invoker();
        // 客户给命令
        AddRequirementCommand arc = new AddRequirementCommand();
        // 接收命令
        invoker.setCommand(arc);
        // 执行命令
        invoker.action();
        DeletePageCommand dpc = new DeletePageCommand();
        invoker.setCommand(dpc);
        invoker.action();
    }
}
