package com.chaochaogu.design.pattern.strategy.extend;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Client {
    public static void main(String[] args) {
        Integer a = Integer.valueOf(args[0]);
        String symbol = args[1];
        Integer b = Integer.valueOf(args[2]);
        switch (symbol) {
            case "+": {
                Calculator.ADD.exec(a, b);
                break;
            }
            case "-": {
                Calculator.SUB.exec(a, b);
                break;
            }
            default: {
            }
        }
    }
}
