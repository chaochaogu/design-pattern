package com.chaochaogu.design.pattern.proxy.extend.personality;

import com.chaochaogu.design.pattern.proxy.example.GamePlayer;

/**
 * 个性代理场景类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class Client {
    public static void main(String[] args) {
        GamePlayer gamePlayer = new GamePlayer("LiLi");
        GamePlayerProxy proxy = new GamePlayerProxy(gamePlayer);
        proxy.login("LiLi", "123456");
        proxy.killBoss();
        proxy.upgrade();
    }
}
