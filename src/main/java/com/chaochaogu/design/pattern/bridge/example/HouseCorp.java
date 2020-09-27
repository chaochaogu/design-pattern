package com.chaochaogu.design.pattern.bridge.example;

/**
 * 房地产公司
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class HouseCorp extends AbstractCorp {

    /**
     * 定义传递一个house进来
     *
     * @param house
     */
    public HouseCorp(House house) {
        super(house);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        System.out.println("房地产公司赚大钱了");
    }
}
