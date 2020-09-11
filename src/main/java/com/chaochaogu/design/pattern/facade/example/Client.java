package com.chaochaogu.design.pattern.facade.example;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/11
 */
public class Client {
    public static void main(String[] args) {
        ModernPostOffice postOffice = new ModernPostOffice();
        postOffice.sendLetter("hello kelly, happy new year", "paradise road 888");
    }
}
