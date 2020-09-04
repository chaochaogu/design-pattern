package com.chaochaogu.design.pattern.proxy.extend.force.proxy;

/**
 * 强制代理的真实角色
 *
 * @author chaochao Gu
 * @date 2020/9/2
 */
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    /**
     * 我的代理是谁
     */
    private IGamePlayer proxy;

    /**
     * 找到自己的代理
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    @Override
    public void login(String user, String password) {
        if (this.isProxy()) {
            System.out.println(this.name + "登录成功");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "打怪");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "又升了一级");
        } else {
            System.out.println("请使用指定代理访问");
        }
    }

    /**
     * 检验是否是代理访问
     * @return
     */
    private boolean isProxy() {
        return this.proxy != null;
    }
}
