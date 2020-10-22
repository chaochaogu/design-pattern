package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * zip接收者
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ZipReceiver implements IReceiver {

    /**
     * zip格式的压缩算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean compress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP压缩成功!");
        return true;
    }

    /**
     * zip格式的解压算法
     *
     * @param source
     * @param to
     * @return
     */
    @Override
    public boolean uncompress(String source, String to) {
        System.out.println(source + " --> " + to + " ZIP解压缩成功!");
        return true;
    }
}
