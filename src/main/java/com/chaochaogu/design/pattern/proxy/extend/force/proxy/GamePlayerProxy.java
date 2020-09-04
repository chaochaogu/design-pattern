package com.chaochaogu.design.pattern.proxy.extend.force.proxy;

/**
 * 强制代理的代理类
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class GamePlayerProxy implements IGamePlayer {
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
    }

    /**
     * 代理的代理暂时还没有，就是自己
     *
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        return this;
    }
}
