package com.chaochaogu.design.pk.cross.wrapping.bridge;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class Client {
    public static void main(String[] args) {
        // 声明一个电影明星
        AbsStar filmStar = new FilmStar();
        // 声明一个歌手
        AbsStar singer = new Singer();
        // 声明一个不务正业的明星，比如电影明星唱歌
        AbsStar star = new FilmStar(new Sing());
        // 展示各明星的工作
        filmStar.doJob();
        singer.doJob();
        star.doJob();
    }
}
