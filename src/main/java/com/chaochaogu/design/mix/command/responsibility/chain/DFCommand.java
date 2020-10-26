package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * 可执行的df命令
 *
 * @author chaochao Gu
 * @date 2020/10/26
 */
public class DFCommand extends Command {

    @Override
    public String execute(CommandVO vo) {
        return super.buildChain(AbstractDF.class).get(0).handleMessage(vo);
    }
}
