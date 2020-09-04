package com.chaochaogu.design.pattern.command.common;

/**
 * 具体的Command类1
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Command1 extends AbstractCommand {

    /***
     * 对哪个Receiver类进行命令处理
     */
    private AbstractReceiver receiver;

    /**
     * 构造函数传递接收者
     *
     * @param receiver
     */
    public Command1(AbstractReceiver receiver) {
        this.receiver = receiver;
    }

    /**
     * 必须实现一个命令
     */
    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
