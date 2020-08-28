package com.chaochaogu.design.pattern.singleton.example;

import com.google.common.collect.Lists;

import java.util.List;
import java.util.Random;

/**
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class MutiEmperor {
    /**
     * 定义最多能产生的实例对象
     */
    private static int maxNumberOfEmperor = 2;
    /**
     * 定义一个列表，容纳所有皇帝实例
     */
    private static List<MutiEmperor> emperors = Lists.newArrayList();
    /**
     * 每个皇帝都有名字，用List来容纳
     */
    private static List<String> names = Lists.newArrayList();
    /**
     * 当前皇帝的序号
     */
    private static int countOfEmperor = 0;

    /**
     * 产生所有对象
     */
    static {
        for (int i = 0; i < maxNumberOfEmperor; i++) {
            emperors.add(new MutiEmperor("皇帝" + i));
        }
    }

    /**
     * Dictator
     */
    private MutiEmperor() {
    }

    /**
     * 传入皇帝名称，建立皇帝对象
     *
     * @param name
     */
    private MutiEmperor(String name) {
        names.add(name);
    }

    /**
     * 随机获得一个皇帝对象
     *
     * @return
     */
    public static MutiEmperor getInstance() {
        Random random = new Random();
        // 随机拉出一个皇帝，只要是个精神领袖就行
        countOfEmperor = random.nextInt(maxNumberOfEmperor);
        return emperors.get(countOfEmperor);
    }

    /**
     * 皇帝发话了
     */
    public void say() {
        System.out.println("我是" + names.get(countOfEmperor));
    }
}
