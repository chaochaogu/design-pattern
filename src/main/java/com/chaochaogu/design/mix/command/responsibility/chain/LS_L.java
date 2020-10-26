package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * ls-l命令
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class LS_L extends AbstractLS {

    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls_l(vo.formatData());
    }

    /**
     * l选项
     *
     * @return
     */
    @Override
    protected String getOperateParam() {
        return L_PARAM;
    }

}
