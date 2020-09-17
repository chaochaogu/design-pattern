package com.chaochaogu.design.pattern.interpreter.example;

import java.util.HashMap;

/**
 * 变量解析器
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public class VarExpression extends Expression {
    private String key;

    public VarExpression(String key) {
        this.key = key;
    }

    /**
     * 从map中取之
     *
     * @param var
     * @return
     */
    @Override
    public int interpreter(HashMap<String, Integer> var) {
        return var.get(this.key);
    }
}
