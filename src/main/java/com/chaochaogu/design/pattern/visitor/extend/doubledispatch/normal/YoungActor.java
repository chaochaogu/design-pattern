package com.chaochaogu.design.pattern.visitor.extend.doubledispatch.normal;

/**
 * 年轻演员
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class YoungActor extends AbstractActor {

    /**
     * 年轻演员最喜欢演功夫角色
     *
     * @param role
     */
    @Override
    public void act(KungFuRole role) {
        System.out.println("最喜欢演功夫角色");
    }
}
