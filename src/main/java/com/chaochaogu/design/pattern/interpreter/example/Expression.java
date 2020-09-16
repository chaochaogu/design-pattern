package com.chaochaogu.design.pattern.interpreter.example;

import java.util.HashMap;

/**
 * 抽象表达式类
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public abstract class Expression {

    /**
     * 解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
     *
     * @param var
     * @return
     */
    public abstract int interpreter(HashMap<String, Integer> var);
}
