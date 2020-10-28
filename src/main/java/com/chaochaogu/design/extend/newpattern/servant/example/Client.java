package com.chaochaogu.design.extend.newpattern.servant.example;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/28
 */
public class Client {
    public static void main(String[] args) {
        //厨师清洁厨房
        Cleaner cookie = new Cleaner();
        cookie.clean(new Kitchen());
        //园丁清洁花园
        Cleaner gardener = new Cleaner();
        gardener.clean(new Garden());
        //裁缝清洁衣服
        Cleaner tailor = new Cleaner();
        tailor.clean(new Cloth());
    }
}
