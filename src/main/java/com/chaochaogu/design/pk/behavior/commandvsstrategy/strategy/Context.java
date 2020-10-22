package com.chaochaogu.design.pk.behavior.commandvsstrategy.strategy;

/**
 * 环境角色
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class Context {

    /**
     * 指向抽象算法
     */
    private Algorithm algorithm;

    /**
     * 构造函数传递具体的算法
     *
     * @param algorithm
     */
    public Context(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    /**
     * 执行压缩算法
     *
     * @param source
     * @param to
     */
    public void compress(String source, String to) {
        algorithm.compress(source, to);
    }

    /**
     * 执行解压缩算法
     *
     * @param source
     * @param to
     */
    public void uncompress(String source, String to) {
        algorithm.uncompress(source, to);
    }
}
