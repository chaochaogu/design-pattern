package com.chaochaogu.design.principle.iip;

/**
 * 接口隔离原则（Interface Isolation Principle）
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class Client {
    public static void main(String[] args) {
        IGoodBodyGirl goodBodyGirl = new GoodBodyGirl("波波");
        IGreatTemperamentGirl greatTemperamentGirl = new GreatTemperamentGirl("玲玲");
        IPerfectGirl perfectGirl = new PerfectGirl("琪琪");
        Searcher searcher1 = new Searcher(goodBodyGirl);
        searcher1.show();
        Searcher searcher2 = new Searcher(greatTemperamentGirl);
        searcher2.show();
        Searcher searcher3 = new Searcher(perfectGirl);
        searcher3.show();
    }
}
