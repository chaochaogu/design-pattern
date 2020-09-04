package com.chaochaogu.design.pattern.proxy.extend.common.proxy;

import com.chaochaogu.design.pattern.proxy.example.IGamePlayer;

/**
 * 普通代理的游戏者
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    /**
     * 构造函数限制谁能创建对象，并同时传递姓名
     *
     * @param gamePlayer
     * @param name
     * @throws Exception
     */
    public GamePlayer(IGamePlayer gamePlayer, String name) throws Exception {
        if (gamePlayer == null) {
            throw new Exception("不能创建真实对象！");
        } else {
            this.name = name;
        }
    }

    @Override
    public void login(String user, String password) {
        System.out.println(this.name + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "杀怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + "又升了一级");
    }
}
