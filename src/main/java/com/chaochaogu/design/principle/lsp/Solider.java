package com.chaochaogu.design.principle.lsp;

import lombok.Data;

/**
 * 上阵杀敌的士兵
 * @author chaochao Gu
 * @date 2020/8/25
 */
@Data
public class Solider {
    private AbstractGun gun;
    public void killEnemy(){
        System.out.println("上阵杀敌，冲啊 ...");
        gun.shoot();
    }
}
