package com.chaochaogu.design.pattern.adaptor.example;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Client {
    public static void main(String[] args) {
        // 没有与外系统连接的时候，是这样写的
        IUserInfo youngGirl = new UserInfo();
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }

        // 老板一想不对呀，兔子不吃窝边草，还是找借用人员好点
        // 我们只修改了这句话
        IUserInfo outerYoungGirl = new OuterUserInfo();
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            outerYoungGirl.getMobileNumber();
        }
    }
}
