package com.chaochaogu.design.pk.structure.proxyvsdecorator.proxy;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Client {
    public static void main(String[] args) {
        // 定义一个短跑运动员
        Runner liuX = new Runner();
        // 定义运动员的代理人
        RunnerAgent agent = new RunnerAgent(liuX);
        // 要求运动员跑步
        System.out.println("====客人找到运动员的代理要求其去跑步===");
        agent.run();
    }
}
