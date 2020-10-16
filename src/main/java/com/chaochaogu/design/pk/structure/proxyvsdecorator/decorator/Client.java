package com.chaochaogu.design.pk.structure.proxyvsdecorator.decorator;

import com.chaochaogu.design.pk.structure.proxyvsdecorator.proxy.Runner;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Client {
    public static void main(String[] args) {
        Runner liuX = new Runner();
        RunnerWithJet runnerWithJet = new RunnerWithJet(liuX);
        System.out.println("===增强后的运动员的功能===");
        runnerWithJet.run();
    }
}
