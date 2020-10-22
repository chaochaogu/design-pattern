package com.chaochaogu.design.pk.cross.wrapping.bridge;

/**
 * 电影明星
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class FilmStar extends AbsStar {

    /**
     * 默认电影明星的主要工作是拍电影
     */
    public FilmStar() {
        super(new ActFilm());
    }

    /**
     * 也可以重新设置一个新职业
     *
     * @param action
     */
    public FilmStar(AbsAction action) {
        super(action);
    }

    /**
     * 细化电影明星的职责
     */
    @Override
    public void doJob() {
        System.out.println("======影星的工作======");
        super.doJob();
    }
}
