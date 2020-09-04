package com.chaochaogu.design.pattern.command.example.pattern;

/**
 * 删除页面的命令
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class DeletePageCommand extends Command {

    @Override
    void execute() {
        // 找到美工组
        super.pg.find();
        // 删除一个页面
        super.pg.delete();
        // 给出计划
        super.pg.plan();
    }
}
