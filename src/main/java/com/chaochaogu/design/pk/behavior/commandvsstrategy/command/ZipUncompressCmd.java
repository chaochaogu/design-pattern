package com.chaochaogu.design.pk.behavior.commandvsstrategy.command;

/**
 * zip解压命令
 *
 * @author chaochao Gu
 * @date 2020/10/20
 */
public class ZipUncompressCmd extends AbstractCmd {

    @Override
    public boolean execute(String source, String to) {
        return super.zip.uncompress(source, to);
    }
}
