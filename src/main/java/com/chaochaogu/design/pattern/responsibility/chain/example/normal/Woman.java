package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

/**
 * 古代女性
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Woman implements IWoman {

    /**
     * 女性状态
     *
     * @see WomanStatus
     */
    private int status;
    private String request;

    public Woman(int status, String request) {
        this.status = status;
        this.request = request;
    }

    @Override
    public int getStatus() {
        return this.status;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
