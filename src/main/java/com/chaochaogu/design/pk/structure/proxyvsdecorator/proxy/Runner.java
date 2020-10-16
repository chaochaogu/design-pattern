package com.chaochaogu.design.pk.structure.proxyvsdecorator.proxy;

/**
 * 运动员
 *
 * @author chaochao Gu
 * @date 2020/10/16
 */
public class Runner implements IRunner {

    @Override
    public void run() {
        System.out.println("运动员跑步：动作潇洒，姿态优美");
    }
}
