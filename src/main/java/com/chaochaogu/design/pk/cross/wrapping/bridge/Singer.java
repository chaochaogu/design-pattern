package com.chaochaogu.design.pk.cross.wrapping.bridge;

/**
 * 歌手
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class Singer extends AbsStar {

    /**
     * 默认歌手的主要工作是唱歌
     */
    public Singer() {
        super(new Sing());
    }

    /**
     * 也可以重新设置一个新职业
     *
     * @param action
     */
    public Singer(AbsAction action) {
        super(action);
    }

    /**
     * 细化歌手的职责
     */
    @Override
    public void doJob() {
        System.out.println("======歌手的工作======");
        super.doJob();
    }
}
