package com.chaochaogu.design.pattern.responsibility.chain.example.pattern;

import com.chaochaogu.design.pattern.responsibility.chain.example.normal.IWoman;

/**
 * @author chaochao Gu
 * @date 2020/9/4
 */
public abstract class AbstractHandler {
    public static final int FATHER_LEVEL_REQUEST = 0;
    public static final int HUSBAND_LEVEL_REQUEST = 1;
    public static final int SON_LEVEL_REQUEST = 2;

    /**
     * 能处理的级别
     */
    private int level = 0;

    /**
     * 每个类都要说明一下自己能处理哪些请求
     *
     * @param level
     */
    public AbstractHandler(int level) {
        this.level = level;
    }

    /**
     * 责任传递，下一个责任人是谁
     */
    private AbstractHandler nextHandler;

    /**
     * 如果不属于你处理的请求，你应该让她找下一个环节的人
     * 如女儿出嫁了，还向父亲请示是否可以逛街，那父亲就应该告诉女儿，应该找丈夫请示
     *
     * @param nextHandler
     */
    public void setNext(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 有请示当然要回应
     */
    protected abstract void response(IWoman woman);

    /**
     * 一个女性（女儿、妻子、母亲）要求逛街，你要处理这个请求
     *
     * @param woman
     */
    public final void handleMessage(IWoman woman) {
        if (woman.getStatus() == this.level) {
            this.response(woman);
        } else {
            if (this.nextHandler != null) {
                // 有后续环节，才把请求往后递送
                this.nextHandler.handleMessage(woman);
            } else {
                // 已经没有后续处理人了，不用处理了
                System.out.println("没地方请示了，按不同意处理");
            }
        }
    }
}
