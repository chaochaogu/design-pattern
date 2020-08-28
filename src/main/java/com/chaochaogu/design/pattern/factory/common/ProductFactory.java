package com.chaochaogu.design.pattern.factory.common;

import com.chaochaogu.design.pattern.factory.common.AbstractProduct;
import com.chaochaogu.design.pattern.factory.common.Product1;
import com.chaochaogu.design.pattern.factory.common.Product2;
import com.google.common.collect.Maps;

import java.util.Map;

/**
 * 延迟加载的工厂类
 *
 * @author chaochao Gu
 * @date 2020/8/27
 */
public class ProductFactory {
    private static final Map<String, AbstractProduct> prMap = Maps.newHashMap();

    public static synchronized AbstractProduct cerateProduct(String type) {
        AbstractProduct product;
        if (prMap.containsKey(type)) {
            // map中已经有了该product
            product = prMap.get(type);
        } else {
            if ("1".equals(type)) {
                product = new Product1();
            } else {
                product = new Product2();
            }
            // 将product放入缓存map
            prMap.put(type, product);
        }
        return product;
    }
}
