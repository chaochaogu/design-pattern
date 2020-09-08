package com.chaochaogu.design.pattern.strategy.extend;

/**
 * 策略枚举
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public enum Calculator {

    /**
     * 加
     */
    ADD("+") {
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },

    /**
     * 减
     */
    SUB("-") {
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private String value;

    Calculator(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    /**
     * 声明一个抽象函数
     *
     * @param a
     * @param b
     * @return
     */
    public abstract int exec(int a, int b);
}
