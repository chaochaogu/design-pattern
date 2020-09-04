package com.chaochaogu.design.pattern.mediator.example.pattern;

import java.util.Random;

/**
 * 进销存之销售
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    public void sellAlienware(int number) {
        super.mediator.execute("sellAlienware", number);
    }

    public void offSale() {
        super.mediator.execute("offSale");
    }

    public int getSaleStatus() {
        Random rnd = new Random(System.currentTimeMillis());
        int status = rnd.nextInt(100);
        System.out.println("当前销售状态" + status);
        return status;
    }
}
