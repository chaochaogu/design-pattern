package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * gzip解压命令
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class GzipUncompressCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.gzip.uncompress(source, to);
    }
}
