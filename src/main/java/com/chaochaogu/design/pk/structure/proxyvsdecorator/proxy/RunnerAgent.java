package com.chaochaogu.design.pk.structure.proxyvsdecorator.proxy;

import java.util.Random;

/**
 * 代理人
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class RunnerAgent {

    private IRunner runner;

    public RunnerAgent(IRunner runner) {
        this.runner = runner;
    }

    /**
     * 代理人是不会跑的
     */
    public void run() {
        Random random = new Random();
        if (random.nextBoolean()) {
            System.out.println("代理人同意安排运动员跑步");
            runner.run();
        } else {
            System.out.println("代理人心情不好，不安排运动员跑步");
        }
    }
}
