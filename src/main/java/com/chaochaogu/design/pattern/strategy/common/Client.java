package com.chaochaogu.design.pattern.strategy.common;

/**
 * 高层模块
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class Client {
    public static void main(String[] args) {
        // 声明一个具体策略
        IStrategy strategy = new Strategy1();
        // 声明上下文对象
        Context context = new Context(strategy);
        // 执行封装后的方法
        context.doAnything();
    }
}
