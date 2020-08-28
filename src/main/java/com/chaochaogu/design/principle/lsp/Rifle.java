package com.chaochaogu.design.principle.lsp;

/**
 * 步枪
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class Rifle implements AbstractGun {
    @Override
    public void shoot() {
        System.out.println("步枪射击，ba ba ba ...");
    }
}
