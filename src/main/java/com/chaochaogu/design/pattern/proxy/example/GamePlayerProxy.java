package com.chaochaogu.design.pattern.proxy.example;

/**
 * 代练者
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    /**
     * 通过构造函数传递要对谁进行代练
     *
     * @param gamePlayer
     */
    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    /**
     * 代练登录
     *
     * @param user
     * @param password
     */
    @Override
    public void login(String user, String password) {
        gamePlayer.login(user, password);
    }

    /**
     * 代练打怪
     */
    @Override
    public void killBoss() {
        gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upgrade() {
        gamePlayer.upgrade();
    }
}
