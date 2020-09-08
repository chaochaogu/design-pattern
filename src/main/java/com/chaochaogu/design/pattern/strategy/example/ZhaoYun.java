package com.chaochaogu.design.pattern.strategy.example;

/**
 * 使用计谋
 *
 * @author chaochao Gu
 * @date 2020/9/7
 */
public class ZhaoYun {

    /**
     * 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
     *
     * @param args
     */
    public static void main(String[] args) {
        Context context;
        //刚刚到吴国的时候拆第一个
        System.out.println("---刚刚到吴国的时候拆第一个---");
        //拿到妙计
        context = new Context(new BackDoor());
        //拆开执行
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
        //刘备乐不思蜀了，拆第二个了
        System.out.println("---刘备乐不思蜀了，拆第二个了---");
        context = new Context(new GivenGreenLight());
        //执行了第二个锦囊
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
        //孙权的小兵追来了，咋办？拆第三个
        System.out.println("---孙权的小兵追来了，咋办？拆第三个---");
        context = new Context(new BlockEnemy());
        //孙夫人退兵
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
