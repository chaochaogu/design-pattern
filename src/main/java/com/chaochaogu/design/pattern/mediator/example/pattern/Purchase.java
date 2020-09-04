package com.chaochaogu.design.pattern.mediator.example.pattern;

/**
 * 进销存之采购
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Purchase extends AbstractColleague {

    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buyAlienware(int number) {
        super.mediator.execute("buyAlienware", number);
    }

    public void refuseBuyAlienware() {
        System.out.println("库存爆了，不再采购电脑");
    }
}
