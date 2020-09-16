package com.chaochaogu.design.pattern.state.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/16
 */
public class Client {
    public static void main(String[] args) {
        // 定义环境角色
        Context context = new Context();
        // 初始化状态
        context.setCurrentState(Context.STATE1);
        // 行为执行
        context.handle1();
        context.handle2();
    }
}
