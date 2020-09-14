package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.pattern;

/**
 * 年老演员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class OldActor extends AbstractActor {

    @Override
    public void act(KungFuRole role) {
        System.out.println("年纪大了，不能演功夫角色");
    }
}
