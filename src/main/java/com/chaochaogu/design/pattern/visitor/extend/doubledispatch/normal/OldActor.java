package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.normal;

/**
 * 老年演员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class OldActor extends AbstractActor {

    /**
     * 老年演员不能演功夫角色
     *
     * @param role
     */
    @Override
    public void act(KungFuRole role) {
        System.out.println("年纪大了，不能演功夫角色");
    }
}
