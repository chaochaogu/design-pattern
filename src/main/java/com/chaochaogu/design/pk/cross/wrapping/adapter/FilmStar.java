package com.chaochaogu.design.pk.cross.wrapping.adapter;

/**
 * 电影明星
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class FilmStar implements IStar {

    @Override
    public void act(String context) {
        System.out.println("明星演戏：" + context);
    }
}
