package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * 抽象压缩命令
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public abstract class AbstractCmd {

    /**
     * 对接收者的引用
     */
    protected IReceiver zip = new ZipReceiver();
    protected IReceiver gzip = new GzipReceiver();

    /**
     * 抽象方法，命令的具体单元
     *
     * @param source
     * @param to
     * @return
     */
    public abstract boolean execute(String source, String to);
}
