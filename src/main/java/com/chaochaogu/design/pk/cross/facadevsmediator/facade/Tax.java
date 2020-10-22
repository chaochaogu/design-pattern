package com.chaochaogu.design.pk.cross.facadevsmediator.facade;

import java.util.Random;

/**
 * 税收
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Tax {

    public int getTax() {
        // 随机税金
        return new Random().nextInt(300);
    }
}
