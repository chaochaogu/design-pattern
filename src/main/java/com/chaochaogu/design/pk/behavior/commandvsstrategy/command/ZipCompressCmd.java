package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * zip压缩命令
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ZipCompressCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.zip.compress(source, to);
    }
}
