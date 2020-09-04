package com.chaochaogu.design.pattern.mediator.example.pattern;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        // 采购电脑
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyAlienware(10);
        // 卖电脑
        System.out.println("------销售人员卖电脑------");
        Sale sale = new Sale(mediator);
        sale.sellAlienware(200);
        // 清库存
        System.out.println("------库房人员请库存------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
