package com.chaochaogu.design.pattern.command.example.pattern;

/**
 * 撤销删除一个页面的命令
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class CancelDeletePageCommand extends Command {

    @Override
    void execute() {
        super.pg.rollback();
    }
}
