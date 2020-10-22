package com.chaochaogu.design.pk.cross.wrapping.adapter;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=======演戏过程模拟==========");
        // 定义一个大明星
        IStar filmStar = new FilmStar();
        filmStar.act("前15分钟，明星本人演戏");
        // 导演把一个普通演员当明星用
        IStar standin = new Standin(new UnknownActor());
        standin.act("中间5分钟，替身演戏");
        filmStar.act("后15分钟，明星本人演戏");
    }
}
