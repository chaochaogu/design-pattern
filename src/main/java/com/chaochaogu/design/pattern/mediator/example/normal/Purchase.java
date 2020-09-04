package com.chaochaogu.design.pattern.mediator.example.normal;

/**
 * 进销存之采购
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Purchase {

    public void buyAlienware(int number) {
        Stock stock = new Stock();
        Sale sale = new Sale();
        int saleStatus = sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("销量良好，采购外星人电脑" + number + "台");
            stock.increase(number);
        } else {
            number = number / 2;
            System.out.println("销量不佳，折半采购外星人电脑" + number + "台");
            stock.increase(number);
        }

    }

    public void refuseBuyAlienware() {
        System.out.println("库存爆了，停止采购外星人电脑");
    }
}
