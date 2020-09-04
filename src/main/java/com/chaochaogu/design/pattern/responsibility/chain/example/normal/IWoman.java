package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 女性接口
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public interface IWoman {

    /**
     * 获得状态
     *
     * @return
     */
    int getStatus();

    /**
     * 获得请求
     *
     * @return
     */
    String getRequest();
}
