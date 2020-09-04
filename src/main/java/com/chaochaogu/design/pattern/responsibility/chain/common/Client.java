package com.chaochaogu.design.pattern.responsibility.chain.common;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Client {
    public static void main(String[] args) {
        // 声明所有的处理节点
        Handler1 handler1 = new Handler1();
        Handler2 handler2 = new Handler2();
        Handler3 handler3 = new Handler3();
        // 设置链中的阶段顺序1-->2-->3
        handler1.setNext(handler2);
        handler2.setNext(handler3);
        // 提交请求，返回结果
        Response response = handler1.handleMessage(new Request());
    }
}
