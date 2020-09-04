package com.chaochaogu.design.pattern.proxy.extend.personality;

import com.chaochaogu.design.pattern.proxy.example.IGamePlayer;

/**
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class GamePlayerProxy implements IGamePlayer,IProxy {
    private IGamePlayer gamePlayer;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        gamePlayer.upgrade();
        this.count();
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：2333元");
    }
}
