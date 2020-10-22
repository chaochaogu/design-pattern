package com.chaochaogu.design.pk.cross.wrapping.proxy;

/**
 * 追星族
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Idolater {
    public static void main(String[] args) {
        // 崇拜的明星是谁
        Singer star = new Singer();
        // 找到明星的经纪人
        Agent agent = new Agent(star);
        System.out.println("追星族：我是你的崇拜者，请签名！");
        // 签名
        agent.sign();
    }
}
