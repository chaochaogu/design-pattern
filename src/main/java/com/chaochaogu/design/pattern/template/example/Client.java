package com.chaochaogu.design.pattern.template.example;

import java.util.Scanner;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/8/28
 */
public class Client {
    public static void main(String[] args) {
        // H1型号的悍马模型
        HummerH1Model hummerH1Model = new HummerH1Model();
        Scanner sc = new Scanner(System.in);
        System.out.println("悍马H1模型是否需要喇叭？ 0-不需要 1-需要");
        String flag = sc.nextLine();
        hummerH1Model.setAlarm("1".equals(flag));
        // H1试跑演示
        hummerH1Model.run();
        // H2型号的悍马模型
        HummerH2Model hummerH2Model = new HummerH2Model();
        // H2试跑演示
        hummerH2Model.run();
    }
}
