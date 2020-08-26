package com.chaochaogu.design.dip;

/**
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class Client {
    public static void main(String[] args) {
        IDriver driver = new Driver(new Benz());
        driver.drive();
    }
}
