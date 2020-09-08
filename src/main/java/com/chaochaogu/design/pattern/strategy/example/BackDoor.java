package com.chaochaogu.design.pattern.strategy.example;

/**
 * 乔国老开后门
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class BackDoor implements IStrategy {

    @Override
    public void operate() {
        System.out.println("找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
