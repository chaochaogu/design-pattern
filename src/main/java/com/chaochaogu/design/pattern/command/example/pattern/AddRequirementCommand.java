package com.chaochaogu.design.pattern.command.example.pattern;

/**
 * 增加需求的命令
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class AddRequirementCommand extends Command {

    @Override
    void execute() {
        // 找到需求组
        super.rg.find();
        // 增加一个需求
        super.rg.add();
        // 给出计划
        super.rg.plan();
    }
}
