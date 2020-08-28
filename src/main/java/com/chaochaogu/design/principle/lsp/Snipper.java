package com.chaochaogu.design.principle.lsp;

import lombok.Data;

/**
 * 暗中阴人的狙击手
 * @author chaochao Gu
 * @date 2020/8/25
 */
@Data
public class Snipper {
    private AUG aug;
    public void setGun(AUG aug){
        this.aug = aug;
    }
    public void killEnemy(){
        // 狙击枪默认配备战术镜，观察敌人
        aug.zoomOut();
        // 开枪射击
        aug.shoot();
    }
}
