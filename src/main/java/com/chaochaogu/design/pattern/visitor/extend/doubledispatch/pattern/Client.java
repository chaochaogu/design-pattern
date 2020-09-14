package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.pattern;

/**
 * 双分派
 * 双分派意味着得到执行的操作决定于请求的种类和两个接收者的类型，它是多分派的一个特例
 * 从这里也可以看到Java是一个支持双分派的单分派语言
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个演员
        OldActor actor = new OldActor();
        // 定义一个角色
        Role role = new KungFuRole();
        // 开始演戏
        role.accept(actor);
    }
}
