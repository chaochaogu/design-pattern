package com.chaochaogu.design.pattern.proxy.example;

/**
 * @author chaochao Gu
 * @date 2020/8/31
 */
public class GamePlayer implements IGamePlayer {
    private String user;

    public GamePlayer(String user) {
        this.user = user;
    }

    @Override
    public void login(String user, String password) {
        System.out.println(user + "登录成功");
    }

    @Override
    public void killBoss() {
        System.out.println(user + "开始打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(user + "升级了");
    }
}
