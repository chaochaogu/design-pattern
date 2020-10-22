package com.chaochaogu.design.pk.cross.facadevsmediator.mediator;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/21
 */
public class Client {
    public static void main(String[] args) {
        // 定义中介者
        Mediator mediator = new Mediator();
        // 定义各个同事类
        Salary salary = new Salary(mediator);
        Position position = new Position(mediator);
        Tax tax = new Tax(mediator);
        // 职位提升了
        System.out.println("===职位提升===");
        position.promote();
    }
}
