package com.chaochaogu.design.pattern.proxy.example;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class Client {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("LiLi");
        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);
        //开始打游戏，记下时间戳
        System.out.println("开始时间是：2020-8-25 10:45");
        proxy.login("LiLi", "123456");
        proxy.killBoss();
        proxy.upgrade();
        //记录结束游戏时间
        System.out.println("结束时间是：2020-8-26 03:40");
    }
}
