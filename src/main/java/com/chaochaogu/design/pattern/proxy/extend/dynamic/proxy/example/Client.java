package com.chaochaogu.design.pattern.proxy.extend.dynamic.proxy.example;

import com.chaochaogu.design.pattern.proxy.example.GamePlayer;
import com.chaochaogu.design.pattern.proxy.example.IGamePlayer;

import java.lang.reflect.Proxy;

/**
 * 动态代理场景类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("开始时间是：2009-8-25 10:45");
        GamePlayer gamePlayer = new GamePlayer("LiLi");
        GamePlayerIH handler = new GamePlayerIH(gamePlayer);
        ClassLoader clsLoader = gamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(clsLoader, gamePlayer.getClass().getInterfaces(), handler);
        proxy.login("LiLi", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
