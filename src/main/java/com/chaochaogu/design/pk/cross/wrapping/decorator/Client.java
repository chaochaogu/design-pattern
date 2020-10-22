package com.chaochaogu.design.pk.cross.wrapping.decorator;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Client {
    public static void main(String[] args) {
        // 定义出假明星
        IStar fs = new FakeStar();
        // 演戏前吹牛
        fs = new HotAir(fs);
        // 演戏后死不承认
        fs = new Deny(fs);
        System.out.println("====看看一些虚假明星的形象====");
        fs.act();
    }
}
