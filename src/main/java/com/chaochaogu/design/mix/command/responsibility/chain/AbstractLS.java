package com.chaochaogu.design.mix.command.responsibility.chain;

/**
 * 抽象ls命令
 *
 * @author chaochao Gu
 * @date 2020/10/24
 */
public abstract class AbstractLS extends CommandName {

    /**
     * 默认参数
     */
    public final static String DEFAULT_PARAM = "";

    /**
     * 参数a
     */
    public final static String A_PARAM = "a";

    /**
     * 参数l
     */
    public final static String L_PARAM = "l";
}
