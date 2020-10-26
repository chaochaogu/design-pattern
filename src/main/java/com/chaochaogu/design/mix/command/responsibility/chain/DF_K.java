package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * df -k命令
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class DF_K extends AbstractDF {

    /**
     * df -k
     *
     * @return
     */
    @Override
    protected String getOperateParam() {
        return K_PARAM;
    }

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.df_k();
    }
}
