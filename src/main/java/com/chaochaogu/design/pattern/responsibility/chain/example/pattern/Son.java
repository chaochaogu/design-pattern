package com.chaochaogu.design.pattern.responsibility.chain.example.pattern;

import com.chaochaogu.design.pattern.responsibility.chain.example.normal.IWoman;

/**
 * 儿子类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Son extends AbstractHandler {

    /**
     * 儿子只处理母亲的请求
     */
    public Son() {
        super(AbstractHandler.SON_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(woman.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
