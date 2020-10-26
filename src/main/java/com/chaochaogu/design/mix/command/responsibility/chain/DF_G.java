package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * df -g命令
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class DF_G extends AbstractDF {

    /**
     * df -g
     *
     * @return
     */
    @Override
    protected String getOperateParam() {
        return G_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.df_g();
    }
}
