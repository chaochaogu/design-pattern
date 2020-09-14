package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.normal;

/**
 * 单分派
 * 重载在编译器期就决定了要调用哪个方法，它是根据role的表面类型而决定调用act(Role role)方法，这是静态绑定；
 * 而Actor的执行方法act则是由其实际类型决定的，这是动态绑定
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
        actor.act(role);
        actor.act(new KungFuRole());
    }
}
