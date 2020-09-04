package com.chaochaogu.design.pattern.proxy.extend.force.proxy;

/**
 * 强制代理的场景类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("开始时间是：2009-8-25 10:45");
        GamePlayer gamePlayer = new GamePlayer("LiLi");
        gamePlayer.login("LiLi", "123456");
        gamePlayer.killBoss();
        gamePlayer.upgrade();

        GamePlayerProxy playerProxy = new GamePlayerProxy(gamePlayer);
        playerProxy.login("LiLi", "123456");
        playerProxy.killBoss();
        playerProxy.upgrade();

        IGamePlayer proxy = gamePlayer.getProxy();
        proxy.login("LiLi", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是：2009-8-26 03:40");
    }
}
