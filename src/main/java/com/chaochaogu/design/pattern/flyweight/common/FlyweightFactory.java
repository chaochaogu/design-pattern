package com.chaochaogu.design.pattern.flyweight.common;

import com.google.common.collect.Maps;

import javax.annotation.concurrent.NotThreadSafe;
import java.util.HashMap;

/**
 * 享元工厂（非线程安全）
 *
 * @author chaochao Gu
 * @date 2020/9/27
 */
@NotThreadSafe
public class FlyweightFactory {

    /**
     * 定义一个池容器
     */
    private static HashMap<String, AbstractFlyweight> pool = Maps.newHashMap();

    /**
     * 享元工厂
     *
     * @param extrinsic
     * @return
     */
    public AbstractFlyweight getFlyweight(String extrinsic) {
        // 需要返回的对象
        AbstractFlyweight flyweight;
        if (pool.containsKey(extrinsic)) {
            // 池中存在该对象
            flyweight = pool.get(extrinsic);
        } else {
            // 池中没有该对象，创建后放入池中
            flyweight = new Flyweight1(extrinsic);
            pool.put(extrinsic, flyweight);
        }
        return flyweight;
    }
}
