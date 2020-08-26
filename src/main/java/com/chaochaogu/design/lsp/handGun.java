package com.chaochaogu.design.lsp;

/**
 * 手枪
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class handGun implements AbstractGun {
    @Override
    public void shoot() {
        System.out.println("小手枪，biu biu biu ...");
    }
}
