package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.pattern;

/**
 * 二货角色
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class IdiotRole implements Role {

    @Override
    public void accept(AbstractActor actor) {
        actor.act(this);
    }
}
