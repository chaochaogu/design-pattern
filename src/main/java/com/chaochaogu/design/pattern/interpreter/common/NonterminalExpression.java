package com.chaochaogu.design.pattern.interpreter.common;

/**
 * 非终结符表达式
 *
 * @author chaochao Gu
 * @date 2020/9/24
 */
public class NonterminalExpression extends Expression {

    /**
     * 每个非终结符表达式都会对其他表达式产生依赖
     *
     * @param expression
     */
    public NonterminalExpression(Expression... expression) {

    }

    @Override
    public Object interpreter(Context ctx) {
        // 进行文法处理
        return null;
    }
}
