package com.chaochaogu.design.lsp;

/**
 * 玩具枪
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class ToyGun implements AbstractGun{
    @Override
    public void shoot() {
        System.out.println("shit，是把玩具枪，gg");
    }
}
