package com.chaochaogu.design.pattern.mediator.example.pattern;

/**
 * 进销存之库存
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Stock extends AbstractColleague {
    private static int COMPUTER_NUM = 100;

    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    public void increase(int number) {
        COMPUTER_NUM += number;
        System.out.println("库存数量" + COMPUTER_NUM);
    }

    public void decrease(int number) {
        COMPUTER_NUM -= number;
        System.out.println("库存数量" + COMPUTER_NUM);
    }

    public int getStock() {
        return COMPUTER_NUM;
    }

    public void clearStock() {
        System.out.println("清理存货数量为" + COMPUTER_NUM + "台");
        super.mediator.execute("clearStock");
    }
}
