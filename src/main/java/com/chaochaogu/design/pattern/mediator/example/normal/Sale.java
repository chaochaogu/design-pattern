package com.chaochaogu.design.pattern.mediator.example.normal;

import java.util.Random;

/**
 * 进销存之销售
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Sale {

    public void saleAlienware(int number) {
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStock() < number) {
            // 库存不够，通知采购
            purchase.buyAlienware(number);
        }
        System.out.println("卖出外星人电脑" + number + "台");
        stock.decrease(number);
    }

    /**
     * 获取销售状态，0-100，数字越大表示销售越好
     *
     * @return
     */
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int status = random.nextInt(100);
        System.out.println("当前销售状况为" + status);
        return status;
    }

    /**
     * 折价处理
     */
    public void offSale() {
        Stock stock = new Stock();
        System.out.println("折价处理外星人电脑" + stock.getStock() + "台");
    }
}
