package com.chaochaogu.design.pattern.bridge.example;

/**
 * @author chaochao Gu
 * @date 2020/9/27
 */
public class Client {
    public static void main(String[] args) {
        House house = new House();
        System.out.println("-------房地产公司是这样运行的-------");
        //先找到房地产公司
        HouseCorp houseCorp = new HouseCorp(house);
        //看我怎么挣钱
        houseCorp.makeMoney();
        System.out.println("\n");
        //山寨公司生产的产品很多，不过我只要指定产品就成了
        System.out.println("-------山寨公司是这样运行的-------");
        CopycatCorp iPod = new CopycatCorp(new IPod());
        iPod.makeMoney();
        System.out.println("\n");
        CopycatCorp clothe = new CopycatCorp(new Clothe());
        clothe.makeMoney();
    }
}
