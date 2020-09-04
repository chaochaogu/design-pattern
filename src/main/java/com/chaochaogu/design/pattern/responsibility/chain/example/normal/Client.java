package com.chaochaogu.design.pattern.responsibility.chain.example.normal;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * 古代女子三从四德 场景类
 *
 * @author chaochao Gu
 * @date 2020/9/4
 */
public class Client {
    public static void main(String[] args) {
        List<IWoman> women = Lists.newArrayListWithCapacity(5);
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            int status = random.nextInt(3);
            Woman woman = new Woman(status, "出门逛街");
            women.add(woman);
        }
        women.forEach(woman -> {
            WomanStatus status = WomanStatus.fromInt(woman.getStatus());
            switch (status) {
                case SINGLE: {
                    System.out.println("\n--------女儿向父亲请示-------");
                    Father father = new Father();
                    father.handleMessage(woman);
                    break;
                }
                case MARRIED: {
                    System.out.println("\n--------妻子向丈夫请示-------");
                    Husband husband = new Husband();
                    husband.handleMessage(woman);
                    break;
                }
                case WIDOW: {
                    System.out.println("\n--------母亲向儿子请示-------");
                    Son son = new Son();
                    son.handleMessage(woman);
                    break;
                }
                default: {
                }
            }
        });
    }
}
