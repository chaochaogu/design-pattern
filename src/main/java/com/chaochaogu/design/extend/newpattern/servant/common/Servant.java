package com.chaochaogu.design.extend.newpattern.servant.common;

/**
 * 雇工类
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Servant {

    /**
     * 服务内容
     *
     * @param serviceFuture
     */
    public void service(IServiced serviceFuture) {
        serviceFuture.serviced();
    }
}
