package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * ls命令
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class LS extends AbstractLS {

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
     * 最简单的ls命令
     *
     * @param vo
     * @return
     */
    @Override
    protected String echo(CommandVO vo) {
        return FileManager.ls(vo.formatData());
    }
}
