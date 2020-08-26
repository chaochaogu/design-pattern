package com.chaochaogu.design.lsp;

/**
 * 机枪
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class MachineGun implements AbstractGun {
    @Override
    public void shoot() {
        System.out.println("机枪扫射，da da da ...");
    }
}
