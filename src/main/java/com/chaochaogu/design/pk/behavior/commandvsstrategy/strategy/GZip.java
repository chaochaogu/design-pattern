package com.chaochaogu.design.pk.behavior.commandvsstrategy.strategy;

/**
 * GZip压缩算法
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class GZip implements Algorithm {

    /**
     * GZip格式的压缩算法
     *
     * @param source
     * @param to
     */
    @Override
    public void compress(String source, String to) {
        System.out.println(source + " --> \" +to + \" GZIP压缩成功!");
    }

    /**
     * ZGip格式的解压缩算法
     *
     * @param source
     * @param to
     */
    @Override
    public void uncompress(String source, String to) {
        System.out.println(source + " --> \" +to + \" GZIP解压缩成功!");
    }
}
