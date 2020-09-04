package com.chaochaogu.design.pattern.proxy.example;

/**
 * 游戏者接口
 *
 * @author chaochao Gu
 * @date 2020/8/31
 */
public interface IGamePlayer {

    /**
     * 登录游戏
     *
     * @param user
     * @param password
     */
    void login(String user, String password);

    /**
     * 打怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}
