package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * 抽象接收者
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public interface IReceiver {

    /**
     * 压缩
     *
     * @param source
     * @param to
     * @return
     */
    public boolean compress(String source, String to);

    /**
     * 解压
     *
     * @param source
     * @param to
     * @return
     */
    public boolean uncompress(String source, String to);
}
