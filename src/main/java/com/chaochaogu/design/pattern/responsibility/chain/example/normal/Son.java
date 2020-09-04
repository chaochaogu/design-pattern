package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 儿子类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Son implements IHandler {

    @Override
    public void handleMessage(IWoman woman) {
        System.out.println("母亲的请求是：" + woman.getRequest());
        System.out.println("儿子的答复是：同意");
    }
}
