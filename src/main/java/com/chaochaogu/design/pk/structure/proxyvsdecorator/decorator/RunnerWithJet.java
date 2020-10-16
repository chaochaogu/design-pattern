package com.chaochaogu.design.pk.structure.proxyvsdecorator.decorator;

import com.chaochaogu.design.pk.structure.proxyvsdecorator.proxy.IRunner;

/**
 * 装饰类
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class RunnerWithJet implements IRunner {

    private IRunner runner;

    public RunnerWithJet(IRunner runner) {
        this.runner = runner;
    }

    @Override
    public void run() {
        System.out.println("加强运动员的速度：为运动员增加喷气装置");
        runner.run();
    }
}
