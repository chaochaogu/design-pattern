package com.chaochaogu.design.pattern.mediator.example.normal;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Client {
    public static void main(String[] args) {
        // 采购人员采购电脑
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase();
        purchase.buyAlienware(100);
        // 销售人员卖电脑
        System.out.println("------销售人员卖电脑------");
        Sale sale = new Sale();
        sale.saleAlienware(3);
        // 库房人员清库存
        System.out.println("------库房人员清库存------");
        Stock stock = new Stock();
        stock.clearStock();
    }
}
