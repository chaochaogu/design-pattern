package com.chaochaogu.design.pk.cross.wrapping.proxy;

/**
 * 明星经纪人
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Agent implements IStar {

    /**
     * 经纪人代理哪个明星
     */
    private IStar star;

    /**
     * 构造函数传递具体明星
     *
     * @param singer
     */
    public Agent(IStar singer) {
        this.star = singer;
    }

    /**
     * 明星签名
     */
    @Override
    public void sign() {
        star.sign();
    }
}
