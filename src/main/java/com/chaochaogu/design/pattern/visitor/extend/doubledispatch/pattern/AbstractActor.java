package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.pattern;

/**
 * 演员抽象
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public abstract class AbstractActor {

    public void act(Role role) {
        System.out.println("演员能演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员都能演功夫角色");
    }
}
