package com.chaochaogu.design.pattern.visitor.common;

import java.util.Random;

/**
 * 结构对象
 *
 * @author chaochao Gu
 * @date 2020/9/14
 */
public class ObjectStructure {

    /**
     * 对象生成器，这里通过一个工厂方法模式模拟
     *
     * @return
     */
    public static AbstractElement createElement() {
        Random random = new Random();
        AbstractElement element;
        if (random.nextInt(100) > 50) {
            element = new Element1();
        } else {
            element = new Element2();
        }
        return element;
    }
}
