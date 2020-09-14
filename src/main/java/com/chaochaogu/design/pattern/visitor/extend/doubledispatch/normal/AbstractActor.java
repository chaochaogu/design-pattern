package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.normal;

/**
 * 演员抽象
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public abstract class AbstractActor {

    public void act(Role role) {
        System.out.println("演员可以扮演任何角色");
    }

    public void act(KungFuRole role) {
        System.out.println("演员都可以扮演功夫角色");
    }
}
