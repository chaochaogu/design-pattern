package com.chaochaogu.design.pattern.responsibility.chain.example.pattern;

import com.chaochaogu.design.pattern.responsibility.chain.example.normal.IWoman;

/**
 * 父亲类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Father extends AbstractHandler {

    /**
     * 父亲只处理女儿的请求
     */
    public Father() {
        super(AbstractHandler.FATHER_LEVEL_REQUEST);
    }

    /**
     * 父亲的答复
     *
     * @param woman
     */
    @Override
    protected void response(IWoman woman) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(woman.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
