package com.chaochaogu.design.pk.behavior.commandvsstrategy.strategy;

/**
 * Zip压缩算法
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class Zip implements Algorithm {

    /**
     * Zip格式的压缩算法
     *
     * @param source
     * @param to
     */
    @Override
    public void compress(String source, String to) {
        System.out.println(source + " --> \" +to + \" ZIP压缩成功!");
    }

    /**
     * Zip格式的解压缩算法
     *
     * @param source
     * @param to
     */
    @Override
    public void uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP解压缩成功!");
    }
}
