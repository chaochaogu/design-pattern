package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.pattern;

/**
 * 角色接口
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public interface Role {

    /**
     * 演员要扮演的角色
     *
     * @param actor
     */
    public void accept(AbstractActor actor);
}
