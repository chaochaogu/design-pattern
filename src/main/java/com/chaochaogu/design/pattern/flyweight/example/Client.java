package com.chaochaogu.design.pattern.flyweight.example;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/25
 */
public class Client {
    public static void main(String[] args) {
        //初始化对象池
        for (int i = 0; i < 4; i++) {
            String subject = "科目" + (i + 1);
            //初始化地址
            for (int j = 0; j < 30; j++) {
                String key = subject + "考试地点" + (j + 1);
                SignInfoFactory.getSignInfo(key);
            }
        }
        SignInfoFactory.getSignInfo("科目1考试地点1");
        SignInfoFactory.getSignInfo("科目2考试地点2");
        SignInfoFactory.getSignInfo("科目3考试地点3");
    }
}
