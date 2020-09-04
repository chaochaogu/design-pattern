package com.chaochaogu.design.pattern.responsibility.chain.example.pattern;

import com.chaochaogu.design.pattern.responsibility.chain.example.normal.IWoman;
import com.chaochaogu.design.pattern.responsibility.chain.example.normal.WomanStatus;

/**
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Woman implements IWoman {

    /**
     * 女性状态
     *
     * @see com.chaochaogu.design.pattern.responsibility.chain.example.normal.WomanStatus
     */
    private int status;
    private String request;

    public Woman(int status, String request) {
        this.status = status;
        this.request = request;
        WomanStatus womanStatus = WomanStatus.fromInt(status);
        switch (womanStatus) {
            case SINGLE: {
                System.out.println("女儿的请求是：" + request);
                break;
            }
            case MARRIED: {
                System.out.println("妻子的请求是：" + request);
                break;
            }
            case WIDOW: {
                System.out.println("儿子的请求是：" + request);
                break;
            }
            default: {
            }
        }
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
