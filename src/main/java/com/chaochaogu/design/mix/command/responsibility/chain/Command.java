package com.chaochaogu.design.mix.command.responsibility.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象命令
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public abstract class Command {

    public abstract String execute(CommandVO vo);

    /**
     * 建立链表
     *
     * @param abstractClass
     * @return
     */
    protected final List<? extends CommandName> buildChain(Class<? extends CommandName> abstractClass) {
        //取出所有的命令名下的子类
        List<Class> classes = ClassUtils.getSonClass(abstractClass);
        //存放命令的实例，并建立链表关系
        List<CommandName> commandNameList = new ArrayList<CommandName>();
        for (Class c : classes) {
            CommandName commandName = null;
            try {
                //产生实例
                commandName = (CommandName) Class.forName(c.getName()).newInstance();
            } catch (Exception e) {
                // TODO 异常处理
            }
            //建立链表
            if (commandNameList.size() > 0) {
                commandNameList.get(commandNameList.size() - 1).setNext(commandName);
            }
            commandNameList.add(commandName);
        }
        return commandNameList;
    }
}
