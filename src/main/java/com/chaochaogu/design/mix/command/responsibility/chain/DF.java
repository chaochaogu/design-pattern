package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * df命令
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class DF extends AbstractDF {

    /**
     * 参数为空
     *
     * @return
     */
    @Override
    protected String getOperateParam() {
        return DEFAULT_PARAM;
    }

    /**
     * 最简单的df命令
     *
     * @param vo
     * @return
     */
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.df();
    }
}
