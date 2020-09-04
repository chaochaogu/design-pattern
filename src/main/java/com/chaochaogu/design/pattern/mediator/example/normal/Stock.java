package com.chaochaogu.design.pattern.mediator.example.normal;

/**
 * 进销存之库存
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Stock {
    private static int COMPUTER_NUM = 100;

    public void increase(int number) {
        COMPUTER_NUM += number;
        System.out.println("库存数量" + COMPUTER_NUM + "台");
    }

    public void decrease(int number) {
        COMPUTER_NUM -= number;
        System.out.println("库存数量" + COMPUTER_NUM + "台");
    }

    public int getStock() {
        return COMPUTER_NUM;
    }

    /**
     * 存货压力大，尽快销售，不再采购
     */
    public void clearStock() {
        Sale sale = new Sale();
        Purchase purchase = new Purchase();
        System.out.println("清理存货数量" + COMPUTER_NUM + "台");
        sale.offSale();
        purchase.refuseBuyAlienware();
    }
}
