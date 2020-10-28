package com.chaochaogu.design.extend.newpattern.servant.example;

/**
 * 抽象的清洁者
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Cleaner {

    /**
     * 清洁
     */
    public void clean(Cleanable clean) {
        clean.cleaned();
    }
}
