package com.chaochaogu.design.pattern.responsibility.chain.example.pattern;

import com.chaochaogu.design.pattern.responsibility.chain.example.normal.IWoman;

/**
 * 丈夫类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Husband extends AbstractHandler {

    /**
     * 丈夫只处理妻子的请求
     */
    public Husband() {
        super(AbstractHandler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    protected void response(IWoman woman) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(woman.getRequest());
        System.out.println("丈夫的答复是:同意\n");
    }
}
