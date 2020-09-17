package com.chaochaogu.design.pattern.interpreter.example;

/**
 * 抽象运算符号解析器
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left
     * @param right
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}
