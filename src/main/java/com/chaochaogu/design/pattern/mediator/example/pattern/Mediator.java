package com.chaochaogu.design.pattern.mediator.example.pattern;

/**
 * 具体中介者
 *
 * @author chaochao Gu
 * @date 2020/9/3
 */
public class Mediator extends AbstractMediator {

    /**
     * 中介者最重要的方法
     *
     * @param operation
     * @param objects
     */
    @Override
    public void execute(String operation, Object... objects) {
        switch (operation) {
            case "buyAlienware": {
                this.buyAlienware((Integer) objects[0]);
                break;
            }
            case "sellAlienware": {
                this.sellAlienware((Integer) objects[0]);
                break;
            }
            case "offSale": {
                this.offSale();
                break;
            }
            case "clearStock": {
                this.clearStock();
                break;
            }
            default: {
            }
        }
    }

    /**
     * 买电脑
     *
     * @param number
     */
    private void buyAlienware(int number) {
        if (super.sale.getSaleStatus() > 80) {
            System.out.println("销量不错，采购电脑" + number + "台");
        } else {
            number = number / 2;
            System.out.println("销量不佳，折半采购电脑" + number + "台");
        }
        super.stock.increase(number);
    }

    /**
     * 卖电脑
     *
     * @param number
     */
    private void sellAlienware(int number) {
        if (super.stock.getStock() < number) {
            System.out.println("当前库存数" + super.stock.getStock() + " < " + "购买数量" + number + "，开始通知采购部门采购");
            super.purchase.buyAlienware(number);
        }
        System.out.println("销售外星人电脑" + number + "台");
        super.stock.decrease(number);
    }

    /**
     * 折价销售
     */
    private void offSale() {
        System.out.println("折价销售电脑" + super.stock.getStock() + "台");
    }

    /**
     * 清仓处理
     */
    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyAlienware();
    }
}
