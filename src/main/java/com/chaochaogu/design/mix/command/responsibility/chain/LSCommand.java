package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * 具体的ls命令
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public class LSCommand extends Command {

    @Override
    public String execute(CommandVO vo) {
        //返回链表的首节点
        CommandName firstNode = super.buildChain(AbstractLS.class).get(0);
        return firstNode.handleMessage(vo);
    }
}
