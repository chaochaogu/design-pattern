package com.chaochaogu.design.pattern.responsibility.chain.example.pattern;

import com.chaochaogu.design.pattern.responsibility.chain.example.normal.IWoman;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Client {
    public static void main(String[] args) {
        // 随机挑选几个女性
        List<IWoman> women = Lists.newArrayList();
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            Woman woman = new Woman(random.nextInt(3), "出门购物");
            women.add(woman);
        }
        // 定义三个请示对象
        Father father = new Father();
        Husband husband = new Husband();
        Son son = new Son();
        // 设置请求顺序
        father.setNext(husband);
        husband.setNext(son);
        women.forEach(father::handleMessage);
    }
}
