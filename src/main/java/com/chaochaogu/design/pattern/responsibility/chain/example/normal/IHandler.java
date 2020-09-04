package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 有处理权的人员接口
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public interface IHandler {

    /**
     * 一个女性（女儿、妻子、母亲）要求逛街，你要处理这个请求
     *
     * @param woman
     */
    void handleMessage(IWoman woman);
}
