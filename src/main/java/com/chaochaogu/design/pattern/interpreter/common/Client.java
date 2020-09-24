package com.chaochaogu.design.pattern.interpreter.common;

import java.util.Stack;

/**
 * @author chaochao Gu
 * @date 2020/9/24
 */
public class Client {
    public static void main(String[] args) {
        Context ctx = new Context();
        // 通常定一个语法容器，容纳一个具体的表达式，通常为List、Array、LinkedList、Stack等类
        Stack<Expression> stack = null;
        for (int i = 0; i < 10; i++) {
            // 进行语法判断，并产生递归调用
        }
        // 产生一个完整的语法树，由各个具体的语法分析进行解析
        Expression exp = stack.pop();
        // 具体元素进入场景
        exp.interpreter(ctx);
    }
}
