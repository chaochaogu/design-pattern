package com.chaochaogu.design.pk.cross.wrapping.adapter;

/**
 * 普通演员
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class UnknownActor implements IActor {

    @Override
    public void playact(String context) {
        System.out.println("替身演戏：" + context);
    }
}
