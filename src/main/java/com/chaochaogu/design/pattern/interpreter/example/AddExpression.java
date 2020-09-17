package com.chaochaogu.design.pattern.interpreter.example;

import java.util.HashMap;

/**
 * 加法解析器
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public class AddExpression extends SymbolExpression {

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left
     * @param right
     */
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * 把左右两个表达式运算的结果加起来
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}
