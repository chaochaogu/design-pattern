package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 丈夫类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Husband implements IHandler {

    @Override
    public void handleMessage(IWoman woman) {
        System.out.println("妻子的请求是：" + woman.getRequest());
        System.out.println("丈夫的答复是：同意");
    }
}
