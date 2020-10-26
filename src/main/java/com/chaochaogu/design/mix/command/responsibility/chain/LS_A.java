package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * ls-a命令
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class LS_A extends AbstractLS {

    /**
     * ls -a命令
     *
     * @param vo
     * @return
     */
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_a(vo.formatData());
    }

    @Override
    protected String getOperateParam() {
        return A_PARAM;
    }

}
