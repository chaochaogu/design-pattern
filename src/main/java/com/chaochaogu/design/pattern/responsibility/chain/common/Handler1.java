package com.chaochaogu.design.pattern.responsibility.chain.common;

/**
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Handler1 extends AbstractHandler {

    /**
     * 设置自己的处理级别
     *
     * @return
     */
    @Override
    protected Level getHandlerLevel() {
        return null;
    }

    /**
     * 定义自己的处理逻辑
     *
     * @param request
     * @return
     */
    @Override
    protected Response echo(Request request) {
        return null;
    }
}
