package com.chaochaogu.design.pattern.adaptor.extend;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/8
 */
public class Client {
    public static void main(String[] args) {
        // 外系统的人员信息
        IOuterUserBaseInfo userBaseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo userHomeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo userOfficeInfo = new OuterUserOfficeInfo();
        // 传递3个对象
        OuterUserInfo youngGirl = new OuterUserInfo(userBaseInfo, userHomeInfo, userOfficeInfo);
        // 从数据库中查到101个
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
