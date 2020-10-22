package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * gzip接收者
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class GzipReceiver implements IReceiver {

    /**
     * gzip格式的压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " GZIP压缩成功!");
        return true;
    }

    /**
     * gzip格式的解压算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " GZIP解压缩成功!");
        return true;
    }
}
