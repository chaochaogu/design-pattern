package com.chaochaogu.design.principle.dip;

/**
 * 依赖倒置原则（Dependence Inversion Principle）
 * @author chaochao Gu
 * @date 2020/8/25
 */
public class Client {
    public static void main(String[] args) {
        IDriver driver = new Driver(new Benz());
        driver.drive();
    }
}
