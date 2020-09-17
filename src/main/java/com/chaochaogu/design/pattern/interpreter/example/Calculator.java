package com.chaochaogu.design.pattern.interpreter.example;

import java.util.HashMap;
import java.util.Stack;

/**
 * 解析器封装类
 *
 * @author chaochao Gu
 * @date 2020/9/17
 */
public class Calculator {

    /**
     * 定义表达式
     */
    private Expression expression;

    /**
     * 构造函数传参，并解析
     *
     * @param expStr
     */
    public Calculator(String expStr) {
        // 定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分为字符数组
        char[] chars = expStr.toCharArray();
        // 运算
        Expression left = null;
        Expression right = null;
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case '+': {
                    // 加法结果放到栈中
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new AddExpression(left, right));
                    break;
                }
                case '-': {
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(chars[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                }
                default: {
                    // 公式中的变量
                    stack.push(new VarExpression(String.valueOf(chars[i])));
                }
            }
        }
        // 把运算结果抛出来
        this.expression = stack.pop();
    }

    /**
     * 开始运算
     *
     * @param var
     * @return
     */
    public int run(HashMap<String, Integer> var) {
        return this.expression.interpreter(var);
    }
}
