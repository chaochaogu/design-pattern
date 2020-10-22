package com.chaochaogu.design.pk.structure.decoratorvsadaptor.decorator;

/**
 * 场景类
 *
 * @author chaochao Gu
 * @date 2020/10/19
 */
public class Client {
    public static void main(String[] args) {
        //很久很久以前，这里有一个丑陋的小鸭子
        System.out.println("===很久很久以前，这里有一只丑陋的小鸭子===");
        Swan duckling = new UglyDuckling();
        //展示一下小鸭子
        duckling.show();
        duckling.cry();
        duckling.fly();
        System.out.println("\n===小鸭子终于发现自己是一只天鹅====");
        //首先外形变化了
        duckling = new BeautifulAppearance(duckling);
        //其次行为也发生了改变
        duckling = new StrongBehavior(duckling);
        //虽然还是叫丑小鸭，但是已经发生了很大变化
        duckling.show();
        duckling.cry();
        duckling.fly();
    }
}
