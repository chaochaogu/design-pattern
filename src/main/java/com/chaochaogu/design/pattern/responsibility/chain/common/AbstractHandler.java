package com.chaochaogu.design.pattern.responsibility.chain.common;

/**
 * 抽象处理者
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public abstract class AbstractHandler {

    private AbstractHandler nextHandler;

    /**
     * 设置下一个处理者是谁
     *
     * @param nextHandler
     */
    public void setNext(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 每个处理者都有一个处理级别
     *
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都必须实现处理业务
     *
     * @param request
     * @return
     */
    protected abstract Response echo(Request request);

    /**
     * 每个处理者都必须对请求进行处理
     *
     * @param request
     * @return
     */
    public final Response handleMessage(Request request) {
        Response response = null;
        // 判断是否是自己的处理级别
        if (this.getHandlerLevel().equals(request.getRequestLevel())) {
            response = this.echo(request);
        } else {
            // 判断是否有下一个处理者
            if (this.nextHandler != null) {
                response = this.nextHandler.handleMessage(request);
            } else {
                // 没有适当的处理者，业务自行处理
            }
        }
        return response;
    }
}
