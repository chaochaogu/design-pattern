package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * gzip压缩命令
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class GzipCompressCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.gzip.compress(source, to);
    }
}
