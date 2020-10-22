package com.chaochaogu.design.pk.cross.wrapping.proxy;

/**
 * 歌手
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Singer implements IStar {

    /**
     * 歌手签名
     */
    @Override
    public void sign() {
        System.out.println("明星歌手 XXX 签名");
    }
}
