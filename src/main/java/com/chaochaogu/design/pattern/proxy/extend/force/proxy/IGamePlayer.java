package com.chaochaogu.design.pattern.proxy.extend.force.proxy;

/**
 * 强制代理的接口类
 *
 * @author chaochao Gu
 * @date 2020/9/2
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

    /**
     * 每个人都可以找一下自己的代理
     *
     * @return
     */
    IGamePlayer getProxy();
}
