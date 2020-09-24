package com.chaochaogu.design.pattern.interpreter.common;

/**
 * 终结符表达式
 *
 * @author chaochao Gu
 * @date 2020/9/24
 */
public class TerminalExpression extends Expression {

    /**
     * 通常终结符表达式只有一个，但是有多个对象
     *
     * @param ctx
     * @return
     */
    @Override
    public Object interpreter(Context ctx) {
        return null;
    }
}
