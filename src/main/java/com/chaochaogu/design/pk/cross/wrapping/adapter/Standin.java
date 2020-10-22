package com.chaochaogu.design.pk.cross.wrapping.adapter;

/**
 * 替身演员
 *
 * @author chaochao Gu
 * @date 2020/10/22
 */
public class Standin implements IStar {

    private IActor actor;

    /**
     * 替身是谁
     *
     * @param actor
     */
    public Standin(IActor actor) {
        this.actor = actor;
    }

    @Override
    public void act(String context) {
        actor.playact(context);
    }
}
