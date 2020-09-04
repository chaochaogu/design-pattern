package com.chaochaogu.design.pattern.proxy.extend.common.proxy;

import com.chaochaogu.design.pattern.proxy.example.IGamePlayer;

/**
 * 普通代理的代理者
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer;

    /**
     * 通过构造函数传递要对谁进行代练
     *
     * @param name
     */
    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            // handle exception
        }
    }

    /**
     * 代练登录
     *
     * @param user
     * @param password
     */
    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    /**
     * 代练杀怪
     */
    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    /**
     * 代练升级
     */
    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }
}
