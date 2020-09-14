package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.pattern;

/**
 * 年轻演员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class YoungActor extends AbstractActor {

    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢演功夫角色");
    }
}
