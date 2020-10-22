package com.chaochaogu.design.pk.behavior.commandvsstrategy.strategy;

/**
 * 抽象压缩算法
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public interface Algorithm {

    /**
     * 压缩算法
     *
     * @param source
     * @param to
     */
    public void compress(String source, String to);

    /**
     * 解压缩算法
     *
     * @param source
     * @param to
     */
    public void uncompress(String source, String to);
}
