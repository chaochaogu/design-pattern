package com.chaochaogu.design.pattern.interpreter.common;

/**
 * 抽象表达式
 *
 * @author chaochao Gu
 * @date 2020/9/24
 */
public abstract class Expression {

    /**
     * 每个表达式必须有一个解析任务
     *
     * @param ctx
     * @return
     */
    public abstract Object interpreter(Context ctx);
}
