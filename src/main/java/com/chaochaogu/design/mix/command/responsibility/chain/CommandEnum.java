package com.chaochaogu.design.mix.command.responsibility.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令配置对象
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public enum CommandEnum {

    /**
     * ls
     */
    ls("com.chaochaogu.design.mix.command.responsibility.chain.LSCommand"),
    df("com.chaochaogu.design.mix.command.responsibility.chain.DFCommand");
    private String value = "";

    /**
     * 定义构造函数，目的是Data(value)类型的相匹配
     *
     * @param value
     */
    CommandEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * 返回所有的enum对象
     *
     * @return
     */
    public static List<String> getNames() {
        CommandEnum[] commandEnum = CommandEnum.values();
        List<String> names = new ArrayList<String>();
        for (CommandEnum c : commandEnum) {
            names.add(c.name());
        }
        return names;
    }
}
