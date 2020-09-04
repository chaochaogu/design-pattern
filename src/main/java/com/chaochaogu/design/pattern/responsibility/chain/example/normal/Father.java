package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 父亲类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Father implements IHandler {

    @Override
    public void handleMessage(IWoman woman) {
        System.out.println("女儿的请求是：" + woman.getRequest());
        System.out.println("父亲的答复是：同意");
    }
}
